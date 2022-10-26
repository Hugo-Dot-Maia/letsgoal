package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Model.Patrocinador;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/patrocinadores")
public class PatrocinadorController {

    @GetMapping("/todosPatrocinadores")
    public List<Patrocinador> findAll() {
        return  Collections.emptyList();
    }

    @GetMapping("{id}")
    public Patrocinador findById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public Patrocinador savePatrocinador(@RequestBody Patrocinador patrocinador){
        return patrocinador;
    }

    @PutMapping("{/id}")
    public Patrocinador updatePatrocinador(@PathVariable Long id,
                                           @RequestBody Patrocinador patrocinador){
        return patrocinador;
    }
}
