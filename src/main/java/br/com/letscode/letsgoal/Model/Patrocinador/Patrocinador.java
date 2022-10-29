package br.com.letscode.letsgoal.Model.Patrocinador;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patrocinador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String descricao;
    private String urlLink;
    private String imagemMarca;
    @Column(unique = true)
    private String nome;
}
