package br.com.letscode.letsgoal.DTO;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ClubeDTO {
    private Long id;
    private String nome;
    private String abreviacao;
    private String nomeFantasia;
    private EscudoDTO escudo;
}
