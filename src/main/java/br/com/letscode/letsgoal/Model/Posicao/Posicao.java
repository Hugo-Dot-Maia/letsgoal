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
public class Posicao implements Comparable<Posicao>{
    @Id
    private Long ID;
    private String nome;
    private String abreviacao;
    @Override
    public int compareTo(Posicao posicao){
        return this.getID().compareTo(posicao.getID());
    }
}
