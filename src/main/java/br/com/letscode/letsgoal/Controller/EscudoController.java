package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Model.Escudo;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/escudos")
public class EscudoController {
    @GetMapping("/todosEscudos")
    public List<Escudo> findAll() {
        return  Collections.emptyList();
    }

    @GetMapping("{id}")
    public Escudo findById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public Escudo saveEscudo(@RequestBody Escudo escudo){
        return escudo;
    }

    @PutMapping("{/id}")
    public Escudo updateEscudo(@PathVariable Long id,
                             @RequestBody Escudo escudo){
        return escudo;
    }
}
