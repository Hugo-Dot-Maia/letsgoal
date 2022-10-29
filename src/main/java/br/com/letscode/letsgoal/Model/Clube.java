package br.com.letscode.letsgoal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Clube {
    @Id
    private Long id;
    private String nome;
    private String abreviacao;
    private String nomeFantasia;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "escudo_id", referencedColumnName = "id")
    private Escudo escudo;
}
