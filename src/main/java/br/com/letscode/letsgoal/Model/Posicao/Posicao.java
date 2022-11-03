package br.com.letscode.letsgoal.Model.Posicao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Posicao {
    @Id
    private Long ID;
    private String nome;
    private String abreviacao;
}
