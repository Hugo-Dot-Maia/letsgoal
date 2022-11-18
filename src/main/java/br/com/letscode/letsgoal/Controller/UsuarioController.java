package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    private UserService userService;

    @Autowired
    public UsuarioController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserDetails> get(@PathVariable("username") String username ) {
        UserDetails userDetails = userService.loadUserByUsername(username);

        return new ResponseEntity<UserDetails>(userDetails, HttpStatus.OK);
    }

    @PostMapping("/{username}/{role}/{password}")
    public ResponseEntity<UserDetails> save(@PathVariable("username") String username,
                                            @PathVariable("role") String role, @PathVariable("password") String password) {
        UserDetails userDetails = userService.save(username, role, password);
        return new ResponseEntity<UserDetails>(userDetails, HttpStatus.OK);
    }
}
