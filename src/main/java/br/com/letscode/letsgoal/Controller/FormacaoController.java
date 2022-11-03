package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IFormacaoService;
import br.com.letscode.letsgoal.Model.Formacao.Formacao;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/formacoes")
public class FormacaoController {
    private final IFormacaoService formacaoService;

    public FormacaoController(IFormacaoService formacaoService) {
        this.formacaoService = formacaoService;
    }

    @GetMapping
    public List<Formacao> findAll(){
        return formacaoService.findAll();
    }

    @GetMapping("/{id}")
    public Formacao findById(@RequestParam Long id){
        return formacaoService.findById(id);
    }

    @PostMapping
    public Formacao saveFormacao(@RequestBody Formacao formacao){
        return  formacaoService.saveFormacao(formacao);
    }

}
