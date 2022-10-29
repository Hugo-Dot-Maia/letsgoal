package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Exception.PatrocinadorNotFoundException;
import br.com.letscode.letsgoal.Model.Patrocinador;
import br.com.letscode.letsgoal.Repository.PatrocinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatrocinadorService {
    @Autowired
    PatrocinadorRepository patrocinadorRepository;

    public Patrocinador savePatrocinador(Patrocinador patrocinador){
        return patrocinadorRepository.save(patrocinador);
    }
    public List<Patrocinador> findAll(){
        return patrocinadorRepository.findAll();
    }

    public Patrocinador findById(Long id){
        return  patrocinadorRepository
                .findById(id)
                .orElseThrow(PatrocinadorNotFoundException::new);
    }
}
