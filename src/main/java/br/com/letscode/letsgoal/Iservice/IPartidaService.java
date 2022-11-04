package br.com.letscode.letsgoal.Iservice;

import br.com.letscode.letsgoal.Model.Partida.Partida;


import java.util.List;

public interface IPartidaService {

    Partida savePartida(Partida patrocinador);
    List<Partida> findAll();
    Partida findById(Long id);
    Partida updatePartida(Long id, Partida patrocinador);
}
