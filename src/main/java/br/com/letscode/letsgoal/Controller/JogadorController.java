package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Model.Jogador;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    @GetMapping("/todosJogadores")
    public List<Jogador> findAll() {
        return  Collections.emptyList();
    }

    @GetMapping("{id}")
    public Jogador findById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public Jogador saveJogador(@RequestBody Jogador jogador){
        return jogador;
    }

    @PutMapping("{/id}")
    public Jogador updateClube(@PathVariable Long id,
                             @RequestBody Jogador jogador){
        return jogador;
    }
}
