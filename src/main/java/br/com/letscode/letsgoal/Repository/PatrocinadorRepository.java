package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Patrocinador.Patrocinador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrocinadorRepository extends JpaRepository<Patrocinador, Long> {
}
