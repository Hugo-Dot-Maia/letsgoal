package br.com.letscode.letsgoal.Model.Jogador;

import br.com.letscode.letsgoal.Model.Clube.Clube;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long status;
    private BigDecimal preco;
    private String nome;
    private String foto;
    private String apelido;
    private Long media;
    private Long totalJogos;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clube_id", nullable = false)
    private Clube clube;
    private Long posicao;
}
