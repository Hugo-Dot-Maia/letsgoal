package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Iservice.IPartidaService;
import br.com.letscode.letsgoal.Model.Partida.Partida;
import br.com.letscode.letsgoal.Repository.PartidaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService implements IPartidaService {
    private final PartidaRepository partidaRepository;

    public PartidaService(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    @Override
    public Partida savePartida(Partida patrocinador) {
        return partidaRepository.save(patrocinador);
    }

    @Override
    public List<Partida> findAll() {
        return partidaRepository.findAll();
    }

    @Override
    public Partida findById(Long id) {
        return partidaRepository
                .findById(id)
                .orElseThrow();
    }

    @Override
    public Partida updatePartida(Long id, Partida partida) {
        var partidaAtual = partidaRepository.findById(id);
        if(partidaAtual.isEmpty())
            return new Partida();
        BeanUtils.copyProperties(partida, partidaAtual);
        return partidaRepository.save(partidaAtual.get());
    }
}
