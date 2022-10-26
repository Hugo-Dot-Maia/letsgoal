package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Model.Clube;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/clubes")
public class ClubeController {

    @GetMapping("/todosClubes")
    public List<Clube> findAll() {
        return  Collections.emptyList();
    }

    @GetMapping("/{id}")
    public Clube findById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public Clube saveClube(@RequestBody Clube clube){
        return clube;
    }

    @PutMapping("/{id}")
    public Clube updateClube(@PathVariable Long id,
                                           @RequestBody Clube clube){
        return clube;
    }
}
