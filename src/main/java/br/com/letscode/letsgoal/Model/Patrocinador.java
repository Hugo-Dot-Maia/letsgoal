package br.com.letscode.letsgoal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patrocinador {
    private long ID;
    private static String descricao;
    private String urlLink;
    private String imagemMarca;
    private String nome;
}
