package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IPatrocinadorService;
import br.com.letscode.letsgoal.Model.Patrocinador.Patrocinador;
import br.com.letscode.letsgoal.Model.Patrocinador.PatrocinadorFiltro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patrocinadores")
public class PatrocinadorController {

    //region Propriedades
    private final Logger logger = LoggerFactory.getLogger(PatrocinadorController.class);
    private final IPatrocinadorService patrocinadorService;
    //endregion
    @Autowired
    public PatrocinadorController(IPatrocinadorService patrocinadorService) {
        this.patrocinadorService = patrocinadorService;
    }

    @GetMapping("/todosPatrocinadores")
    public List<Patrocinador> findAll() {
       logger.info("Entrou no processo de obter todos os patrocinadores");
        return  patrocinadorService.findAll();
    }

    @GetMapping("/{id}")
    public Patrocinador findById(@PathVariable Long id){
        logger.info("Entrou no processo de obter patrocinador específico");
        return patrocinadorService.findById(id);
    }
    @GetMapping("/patrocinadoresFiltro")
    public List<PatrocinadorFiltro> fildAllPatrocinadorFiltro(){
        logger.info("Entrou no processo de obter todos os itens de filtro Patrocinadores");
        return patrocinadorService.fildAllPatrocinadorFiltro();
    }

    @PostMapping
    public Patrocinador savePatrocinador(@RequestBody Patrocinador patrocinador){
        logger.info("Entrou no processo de salvar patrocinador");
        return patrocinadorService.savePatrocinador(patrocinador);
    }

    @PutMapping("/{id}")
    public Patrocinador updatePatrocinador(@PathVariable Long id,
                                           @RequestBody Patrocinador patrocinador){
        logger.info("Entrou no processo de dar update em patrocinador");
        return patrocinadorService.updatePatrocinador(id, patrocinador);
    }
}
