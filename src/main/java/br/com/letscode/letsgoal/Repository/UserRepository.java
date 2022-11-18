package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Usuario.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
