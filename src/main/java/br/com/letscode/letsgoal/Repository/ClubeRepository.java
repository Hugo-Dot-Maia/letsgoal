package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Clube.Clube;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClubeRepository extends JpaRepository<Clube, Long> {
    Optional<Clube> findByAbreviacao(String abreviacao);
}
