package br.com.letscode.letsgoal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clube {
    private Long id;
    private String nome;
    private String abreviacao;
    private String nomeFantasia;
    private Escudo escudo;
}
