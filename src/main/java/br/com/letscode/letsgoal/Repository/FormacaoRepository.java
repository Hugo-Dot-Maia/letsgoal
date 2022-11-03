package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Formacao.Formacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormacaoRepository extends JpaRepository<Formacao, Long> {
}
