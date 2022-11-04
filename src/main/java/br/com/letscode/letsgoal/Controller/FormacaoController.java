package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IFormacaoService;
import br.com.letscode.letsgoal.Model.BadErrorClass;
import br.com.letscode.letsgoal.Model.Formacao.Formacao;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formacoes")
public class FormacaoController {
    private final IFormacaoService formacaoService;

    public FormacaoController(IFormacaoService formacaoService) {
        this.formacaoService = formacaoService;
    }

    @ApiOperation(value = "getGreeting")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Erro no servidor"),
            @ApiResponse(code = 400, message = "Erro do usuário",
                    response = BadErrorClass.class),
            @ApiResponse(code = 404, message = "Serviço não encontrado"),
            @ApiResponse(code = 200, message = "Recuperação bem-sucedida",
                    response = Formacao.class, responseContainer = "Lista") })
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
