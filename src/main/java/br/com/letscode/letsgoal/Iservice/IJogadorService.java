package br.com.letscode.letsgoal.Iservice;

import br.com.letscode.letsgoal.Model.Jogador.Jogador;

import java.util.List;

public interface IJogadorService {
    Jogador findById(Long id);
    List<Jogador> findAll();
    Jogador saveJogador(Jogador jogador);
}
