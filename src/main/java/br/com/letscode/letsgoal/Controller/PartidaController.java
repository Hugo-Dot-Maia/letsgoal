package br.com.letscode.letsgoal.Controller;

import br.com.letscode.letsgoal.Iservice.IPartidaService;
import br.com.letscode.letsgoal.Model.Partida.Partida;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {
    private final IPartidaService partidaService;

    public PartidaController(IPartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @GetMapping("/todasPartidas")
    public List<Partida> findAll() {
        return  partidaService.findAll();
    }

    @GetMapping("/{id}")
    public Partida findById(@PathVariable Long id){
        return partidaService.findById(id);
    }

    @PostMapping
    public Partida savePartida(@RequestBody Partida partida){
        return partidaService.savePartida(partida);
    }

    @PutMapping("/{id}")
    public Partida updatePartida(@PathVariable Long id,
                                           @RequestBody Partida partida){
        return partidaService.updatePartida(id, partida);
    }

}
