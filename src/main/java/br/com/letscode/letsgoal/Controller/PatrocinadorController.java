package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Model.Patrocinador;
import br.com.letscode.letsgoal.Service.PatrocinadorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/patrocinadores")
public class PatrocinadorController {

    //region Logs
    Logger logger = LoggerFactory.getLogger(PatrocinadorController.class);
    //endregion

    //region Service
    @Autowired
    PatrocinadorService patrocinadorService;
    //endregion

    @GetMapping("/todosPatrocinadores")
    public List<Patrocinador> findAll() {
       logger.info("Entrou no processo de obter todos os patrocinadores");
        return  patrocinadorService.findAll();
    }

    @GetMapping("/{id}")
    public Patrocinador findById(@PathVariable Long id){
        logger.info("Entrou no processo de obter patrocinador específico");
        return null;
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
        return patrocinador;
    }
}
