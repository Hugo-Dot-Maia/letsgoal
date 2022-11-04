package br.com.letscode.letsgoal.Service;

import br.com.letscode.letsgoal.Iservice.IMercadoService;
import br.com.letscode.letsgoal.Model.Mercado.Mercado;
import br.com.letscode.letsgoal.Repository.MercadoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class MercadoService implements IMercadoService {
    private final MercadoRepository mercadoRepository;

    public MercadoService(MercadoRepository mercadoRepository) {
        this.mercadoRepository = mercadoRepository;
    }

    @Override
    public Mercado findById(Long id) {
        return mercadoRepository
                .findById(id)
                .orElseThrow();
    }

    @Override
    public Mercado updateMercado(Long id, Mercado mercado) {
        var mercadoAtual = mercadoRepository.findById(id);
        if(mercadoAtual.isEmpty())
            return new Mercado();
        BeanUtils.copyProperties(mercado, mercadoAtual);
        return mercadoRepository.save(mercado);
    }
}
