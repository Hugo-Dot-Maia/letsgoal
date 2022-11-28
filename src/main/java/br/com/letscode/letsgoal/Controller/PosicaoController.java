package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IPosicaoService;
import br.com.letscode.letsgoal.Model.Posicao.Posicao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posicoes")
public class PosicaoController {

    private final IPosicaoService posicaoService;

    @Autowired
    public PosicaoController(IPosicaoService posicaoService) {
        this.posicaoService = posicaoService;
    }

    @GetMapping
    public List<Posicao> findAll(){
        return posicaoService.findAll();
    }

    @GetMapping("/{id}")
    public Posicao findById(@RequestParam Long id){
        return posicaoService.findById(id);
    }

    @PostMapping
    public Posicao savePosicao(@RequestBody Posicao posicao){
        return  posicaoService.savePosicao(posicao);
    }

    @PostMapping("insertAllPosicoes")
    public List<Posicao> saveTodasPosicoes(@RequestBody List<Posicao> posicoes){
        return  posicaoService.saveTodasPosicoes(posicoes);
    }

}
