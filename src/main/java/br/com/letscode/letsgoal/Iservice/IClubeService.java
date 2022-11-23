package br.com.letscode.letsgoal.Iservice;

import br.com.letscode.letsgoal.Model.Clube.Clube;

import java.util.List;

public interface IClubeService {
    List<Clube> findAll();
    Clube findById(Long id);
    Clube findByAbreviacao(String abreviacao);
    Clube saveClube(Clube clube);
}
