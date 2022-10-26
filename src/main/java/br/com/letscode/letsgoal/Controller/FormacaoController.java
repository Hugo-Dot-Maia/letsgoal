package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Model.Formacao;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/formacoes")
public class FormacaoController {

    @GetMapping
    public List<Formacao> findAll(){
        return Collections.emptyList();
    }

    @GetMapping("{/id}")
    public Formacao findById(@RequestParam Long id){
        return null;
    }

    @PostMapping
    public Formacao saveFormacao(@RequestBody Formacao formacao){
        return  formacao;
    }

}
