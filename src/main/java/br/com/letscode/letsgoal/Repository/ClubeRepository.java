package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Clube.Clube;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubeRepository extends JpaRepository<Clube, Long> {
}
