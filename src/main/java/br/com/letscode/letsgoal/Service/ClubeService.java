package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Iservice.IClubeService;
import br.com.letscode.letsgoal.Model.Clube.Clube;
import br.com.letscode.letsgoal.Repository.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClubeService implements IClubeService {
    private final ClubeRepository clubeRepository;

    @Autowired
    public ClubeService(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }

    @Override
    public List<Clube> findAll() {
        return clubeRepository.findAll();
    }

    @Override
    public Clube findById(Long id) {
        return clubeRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public Clube findByAbreviacao(String abreviacao) {
        return clubeRepository
                .findByAbreviacao(abreviacao)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public Clube saveClube(Clube clube) {
        return clubeRepository.save(clube);
    }
}
