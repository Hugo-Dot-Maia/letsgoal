package br.com.letscode.letsgoal.Iservice.Patrocinador;

import br.com.letscode.letsgoal.Model.Patrocinador.Patrocinador;
import br.com.letscode.letsgoal.Model.Patrocinador.PatrocinadorFiltro;

import java.util.List;

public interface IPatrocinadorService {
    Patrocinador savePatrocinador(Patrocinador patrocinador);
    List<Patrocinador> findAll();
    Patrocinador findById(Long id);
    List<PatrocinadorFiltro> fildAllPatrocinadorFiltro();

}
