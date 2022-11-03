package br.com.letscode.letsgoal.Model.Formacao;

import br.com.letscode.letsgoal.Model.Posicao.Posicao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Formacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String nome;
    @OneToMany
    private List<Posicao> posicoes;
}
