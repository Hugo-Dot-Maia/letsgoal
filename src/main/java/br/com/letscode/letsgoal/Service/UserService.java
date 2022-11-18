package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Model.Usuario.User;
import br.com.letscode.letsgoal.Model.Usuario.UserAuthority;
import br.com.letscode.letsgoal.Repository.UserAuthorityRepository;
import br.com.letscode.letsgoal.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {
    private UserRepository userRepository;
    private UserAuthorityRepository authorityRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository,
                       UserAuthorityRepository authorityRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found!"));

        return getUserDetails(user);
    }

    private org.springframework.security.core.userdetails.User getUserDetails(User user) {
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                user.getEnabled(),
                user.getAccountNonExpired(),
                user.getCredentialsNonExpired(),
                user.getAccountNonLocked(),
                convertToSpringAuthorities(user.getAuthorities()));
    }

    private Collection<? extends GrantedAuthority> convertToSpringAuthorities(Set<UserAuthority> authorities) {
        if (CollectionUtils.isEmpty(authorities)) {
            return new HashSet<>();
        }

        return authorities.stream()
                .map(UserAuthority::getRole)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());
    }

    public UserDetails save(String username, String role, String password) {
        UserAuthority authority = authorityRepository.findByRole(role)
                .orElseThrow(() -> new RuntimeException("Authority not found!"));
        ArrayList<UserAuthority> userAuthorities = new ArrayList<>();
        userAuthorities.add(authority);
        Set<UserAuthority> set = new HashSet<UserAuthority>(userAuthorities);

        User user = User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .authorities(set)
                .build();
        user = userRepository.save(user);
        return getUserDetails(user);
    }
}
