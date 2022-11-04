package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Posicao.Posicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosicaoRepository extends JpaRepository<Posicao, Long> {
}
