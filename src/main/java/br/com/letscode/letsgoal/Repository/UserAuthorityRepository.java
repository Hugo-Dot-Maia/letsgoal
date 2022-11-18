package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Usuario.UserAuthority;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserAuthorityRepository extends CrudRepository<UserAuthority, Integer> {
    Optional<UserAuthority> findByRole(String role);
}
