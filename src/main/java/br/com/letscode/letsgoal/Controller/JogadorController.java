package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IJogadorService;
import br.com.letscode.letsgoal.Model.Jogador.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {
    final IJogadorService jogadorService;
    @Autowired
    public JogadorController(IJogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/todosJogadores")
    public List<Jogador> findAll() {
        return  jogadorService.findAll();
    }

    @GetMapping("/{id}")
    public Jogador findById(@PathVariable Long id){
        return jogadorService.findById(id);
    }

    @PostMapping
    public Jogador saveJogador(@RequestBody Jogador jogador){
        return jogadorService.saveJogador(jogador);
    }

    @PutMapping("/{id}")
    public Jogador updateClube(@PathVariable Long id,
                             @RequestBody Jogador jogador){
        return jogador;
    }
}
