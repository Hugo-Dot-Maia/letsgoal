package br.com.letscode.letsgoal.Model;

import br.com.letscode.letsgoal.Model.Formacao.Formacao;
import br.com.letscode.letsgoal.Model.Jogador.Jogador;
import lombok.Data;

import java.util.List;

@Data
public class LetsClube {
    private Long id;
    private String nome;
    private Formacao formacao;
    private List<Jogador> jogadores;
}
