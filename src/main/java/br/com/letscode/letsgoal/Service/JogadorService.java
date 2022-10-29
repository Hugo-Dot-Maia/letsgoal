package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Exception.JogadorNotFoundException;
import br.com.letscode.letsgoal.Iservice.IJogadorService;
import br.com.letscode.letsgoal.Model.Jogador.Jogador;
import br.com.letscode.letsgoal.Model.Patrocinador.Patrocinador;
import br.com.letscode.letsgoal.Repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService implements IJogadorService {
    private final JogadorRepository jogadorRepository;

    @Autowired
    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public Jogador findById(Long id){
        return jogadorRepository
                .findById(id)
                .orElseThrow(JogadorNotFoundException::new);
    }

    public List<Jogador> findAll(){
        return jogadorRepository.findAll();
    }

    public Jogador saveJogador(Jogador jogador){
        return jogadorRepository.save(jogador);
    }




}
