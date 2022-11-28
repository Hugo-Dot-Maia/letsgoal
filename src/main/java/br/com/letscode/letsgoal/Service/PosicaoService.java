package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Exception.PosicaoNotFoundException;
import br.com.letscode.letsgoal.Iservice.IPosicaoService;
import br.com.letscode.letsgoal.Model.Posicao.Posicao;
import br.com.letscode.letsgoal.Repository.PosicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PosicaoService implements IPosicaoService {
    private final PosicaoRepository posicaoRepository;

    @Autowired
    public PosicaoService(PosicaoRepository posicaoRepository) {
        this.posicaoRepository = posicaoRepository;
    }


    public List<Posicao> findAll() {
        List<Posicao> posicoes = posicaoRepository.findAll();
        Collections.sort(posicoes);
        return posicoes;
    }

    public Posicao findById(Long id) {
        return posicaoRepository
                .findById(id)
                .orElseThrow(PosicaoNotFoundException::new);
    }

    public Posicao savePosicao(Posicao posicao) {
        return posicaoRepository.save(posicao);
    }

    @Override
    public List<Posicao> saveTodasPosicoes(List<Posicao> posicoes) {
        List<Posicao> posicoesSalvas = posicaoRepository.findAll();
        List<Posicao> novasPosicoes = new ArrayList<>(Collections.emptyList());
        posicoes.forEach(posicao -> {
            if(!posicoesSalvas.contains(posicao)){
                posicaoRepository.save(posicao);
                novasPosicoes.add(posicao);
            }
        });
        return novasPosicoes;
    }
}
