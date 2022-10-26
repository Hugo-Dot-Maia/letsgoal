package br.com.letscode.letsgoal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Escudo {
    private Long id;
    private String tamanho60x60;
    private String tamanho45x45;
    private String tamanho30x30;
}
