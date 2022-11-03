package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Exception.FormacaoNotFoundException;
import br.com.letscode.letsgoal.Iservice.IFormacaoService;
import br.com.letscode.letsgoal.Model.Formacao.Formacao;
import br.com.letscode.letsgoal.Repository.FormacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormacaoService implements IFormacaoService {
    private final FormacaoRepository formacaoRepository;

    @Autowired
    public FormacaoService(FormacaoRepository formacaoRepository) {
        this.formacaoRepository = formacaoRepository;
    }

    public List<Formacao> findAll() {
        return formacaoRepository.findAll();
    }

    public Formacao findById(Long id) {
        return formacaoRepository
                .findById(id)
                .orElseThrow(FormacaoNotFoundException::new);
    }

    public Formacao saveFormacao(Formacao formacao) {
        return formacaoRepository.save(formacao);
    }
}
