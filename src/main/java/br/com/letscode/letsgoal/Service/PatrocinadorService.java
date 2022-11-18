package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Exception.PatrocinadorNotFoundException;
import br.com.letscode.letsgoal.Iservice.IPatrocinadorService;
import br.com.letscode.letsgoal.Model.Patrocinador.Patrocinador;
import br.com.letscode.letsgoal.Model.Patrocinador.PatrocinadorFiltro;
import br.com.letscode.letsgoal.Repository.PatrocinadorRepository;
import br.com.letscode.letsgoal.Utils.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatrocinadorService implements IPatrocinadorService {
    private final PatrocinadorRepository patrocinadorRepository;
    @Autowired
    public PatrocinadorService(PatrocinadorRepository patrocinadorRepository) {
        this.patrocinadorRepository = patrocinadorRepository;
    }

    public Patrocinador savePatrocinador(Patrocinador patrocinador){
        return patrocinadorRepository.save(patrocinador);
    }
    public List<Patrocinador> findAll(){
        return CollectionUtils
                .makeCollectionFromIterable(patrocinadorRepository.findAll())
                .stream()
                .toList();
    }

    public Patrocinador findById(Long id){
        return  patrocinadorRepository
                .findById(id)
                .orElseThrow(PatrocinadorNotFoundException::new);
    }

    public List<PatrocinadorFiltro> fildAllPatrocinadorFiltro() {
        return CollectionUtils
                .makeCollectionFromIterable(patrocinadorRepository.findAll())
                .stream()
                .map(p -> new PatrocinadorFiltro(p.getID(), p.getNome()))
                .toList();
    }

    public Patrocinador updatePatrocinador(Long id, Patrocinador patrocinador) {
        var patrocinadorAtual = patrocinadorRepository.findById(id);
        if(patrocinadorAtual.isEmpty())
            return new Patrocinador();
        BeanUtils.copyProperties(patrocinador, patrocinadorAtual);
        return patrocinadorRepository.save(patrocinadorAtual.get());
    }
}
