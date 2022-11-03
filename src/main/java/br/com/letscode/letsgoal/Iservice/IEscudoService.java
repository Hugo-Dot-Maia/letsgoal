package br.com.letscode.letsgoal.Iservice;

import br.com.letscode.letsgoal.Model.Escudo;

import java.util.List;

public interface IEscudoService {
    List<Escudo> findAll();
    Escudo findById(Long id);
    Escudo saveEscudo(Escudo escudo);
}
