package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Partida.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
