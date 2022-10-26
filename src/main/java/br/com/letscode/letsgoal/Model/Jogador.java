package br.com.letscode.letsgoal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jogador {
    private Long id;
    private Long status;
    private BigDecimal preco;
    private String nome;
    private String foto;
    private String apelido;
    private Long media;
    private Long totalJogos;
    private Clube clube;
    private Long posicao;
}
