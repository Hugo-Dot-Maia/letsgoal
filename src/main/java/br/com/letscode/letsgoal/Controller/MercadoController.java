package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IMercadoService;
import br.com.letscode.letsgoal.Model.Mercado.Mercado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/mercado")
public class MercadoController {
    private final IMercadoService mercadoService;

    @Autowired
    public MercadoController(IMercadoService mercadoService) {
        this.mercadoService = mercadoService;
    }

    @GetMapping("/{id}")
    public Mercado findById(@PathVariable Long id){
        return mercadoService.findById(id);
    }

    @PutMapping("/{id}")
    public Mercado updateMercado(@PathVariable Long id,
                                     @RequestBody Mercado mercado){
        return mercadoService.updateMercado(id, mercado);
    }
}
