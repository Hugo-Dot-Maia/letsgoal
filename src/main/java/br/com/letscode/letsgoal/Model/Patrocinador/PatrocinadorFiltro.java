package br.com.letscode.letsgoal.Model.Patrocinador;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatrocinadorFiltro {
    private long ID;
    private String nome;
}
