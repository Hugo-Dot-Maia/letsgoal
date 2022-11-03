package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Escudo.Escudo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscudoRepository extends JpaRepository<Escudo, Long> {
}
