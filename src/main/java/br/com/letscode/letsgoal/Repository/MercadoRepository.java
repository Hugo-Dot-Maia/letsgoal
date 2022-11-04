package br.com.letscode.letsgoal.Repository;

import br.com.letscode.letsgoal.Model.Mercado.Mercado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoRepository extends JpaRepository<Mercado, Long> {
}
