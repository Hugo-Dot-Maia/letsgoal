package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IEscudoService;
import br.com.letscode.letsgoal.Model.Escudo.Escudo;
import br.com.letscode.letsgoal.Service.EscudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escudos")
public class EscudoController {
    private final IEscudoService escudoService;

    @Autowired
    public EscudoController(IEscudoService escudoService) {
        this.escudoService = escudoService;
    }

    @GetMapping("/todosEscudos")
    public List<Escudo> findAll() {
        return  escudoService.findAll();
    }

    @GetMapping("/{id}")
    public Escudo findById(@PathVariable Long id){
        return escudoService.findById(id);
    }

    @PostMapping
    public Escudo saveEscudo(@RequestBody Escudo escudo){
        return escudoService.saveEscudo(escudo);
    }

    @PutMapping("/{id}")
    public Escudo updateEscudo(@PathVariable Long id,
                             @RequestBody Escudo escudo){
        return escudo;
    }
}
