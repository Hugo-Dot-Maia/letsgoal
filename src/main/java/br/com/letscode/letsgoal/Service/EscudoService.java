package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Exception.EscudoNotFoundException;
import br.com.letscode.letsgoal.Iservice.IEscudoService;
import br.com.letscode.letsgoal.Model.Escudo.Escudo;
import br.com.letscode.letsgoal.Repository.EscudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscudoService implements IEscudoService {

    private final EscudoRepository escudoRepository;

    @Autowired
    public EscudoService(EscudoRepository escudoRepository) {
        this.escudoRepository = escudoRepository;
    }

    public List<Escudo> findAll() {
        return escudoRepository.findAll();
    }

    @Override
    public Escudo findById(Long id) {
        return escudoRepository
                .findById(id)
                .orElseThrow(EscudoNotFoundException::new);
    }

    @Override
    public Escudo saveEscudo(Escudo escudo) {
        return escudoRepository.save(escudo);
    }


}
