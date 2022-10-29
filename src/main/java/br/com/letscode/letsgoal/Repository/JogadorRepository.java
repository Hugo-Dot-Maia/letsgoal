package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Jogador.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
