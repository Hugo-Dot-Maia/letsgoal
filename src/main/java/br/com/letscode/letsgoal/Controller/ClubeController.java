package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IClubeService;
import br.com.letscode.letsgoal.Model.Clube.Clube;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubes")
public class ClubeController {
    private final IClubeService clubeService;
    @Autowired
    public ClubeController(IClubeService clubeService) {
        this.clubeService = clubeService;
    }

    @GetMapping("/todosClubes")
    public List<Clube> findAll() {
        return  clubeService.findAll();
    }

    @GetMapping("/{id}")
    public Clube findById(@PathVariable Long id){
        return clubeService.findById(id);
    }

    @PostMapping
    public Clube saveClube(@RequestBody Clube clube){
        return clubeService.saveClube(clube);
    }

    @PutMapping("/{id}")
    public Clube updateClube(@PathVariable Long id,
                                           @RequestBody Clube clube){
        return clube;
    }
}
