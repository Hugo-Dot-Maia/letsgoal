package br.com.letscode.letsgoal.Iservice;

import br.com.letscode.letsgoal.Model.Formacao.Formacao;

import java.util.List;

public interface IFormacaoService {
    List<Formacao> findAll();
    Formacao findById(Long id);
    Formacao saveFormacao(Formacao formacao);
}
