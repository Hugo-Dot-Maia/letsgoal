package br.com.letscode.letsgoal.Iservice;

import br.com.letscode.letsgoal.Model.Mercado.Mercado;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IMercadoService {
    Mercado findById(@PathVariable Long id);
    Mercado updateMercado(@PathVariable Long id, @RequestBody Mercado mercado);
}
