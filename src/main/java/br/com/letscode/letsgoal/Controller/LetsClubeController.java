package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Model.LetsClube;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/letsClube")
public class LetsClubeController {
    @GetMapping("/todosLetsClube")
    public List<LetsClube> findAll() {
        return  Collections.emptyList();
    }

    @GetMapping("/{id}")
    public LetsClube findById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public LetsClube saveLetsClube(@RequestBody LetsClube letsClube){
        return letsClube;
    }

    @PutMapping("/{id}")
    public LetsClube updateLetsClube(@PathVariable Long id,
                               @RequestBody LetsClube letsClube){
        return letsClube;
    }
}
