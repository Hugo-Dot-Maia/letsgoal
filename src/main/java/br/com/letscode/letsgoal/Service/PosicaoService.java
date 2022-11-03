package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Exception.PosicaoNotFoundException;
import br.com.letscode.letsgoal.Iservice.IPosicaoService;
import br.com.letscode.letsgoal.Model.Posicao.Posicao;
import br.com.letscode.letsgoal.Repository.PosicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosicaoService implements IPosicaoService {
    private final PosicaoRepository posicaoRepository;

    @Autowired
    public PosicaoService(PosicaoRepository posicaoRepository) {
        this.posicaoRepository = posicaoRepository;
    }


    public List<Posicao> findAll() {
        return posicaoRepository.findAll();
    }

    public Posicao findById(Long id) {
        return posicaoRepository
                .findById(id)
                .orElseThrow(PosicaoNotFoundException::new);
    }

    public Posicao savePosicao(Posicao posicao) {
        return posicaoRepository.save(posicao);
    }
}
