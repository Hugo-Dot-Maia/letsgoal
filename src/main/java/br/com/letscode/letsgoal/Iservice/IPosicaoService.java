package br.com.letscode.letsgoal.Iservice;

import br.com.letscode.letsgoal.Model.Posicao.Posicao;

import java.util.List;

public interface IPosicaoService {
    List<Posicao> findAll();
    Posicao findById(Long id);
    Posicao savePosicao(Posicao posicao);
}
