package br.com.letscode.letsgoal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formacao {
    private Long ID;
    private String nome;
    private List<Posicao> posicoes;
}
