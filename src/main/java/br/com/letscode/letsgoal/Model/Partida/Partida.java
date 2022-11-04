package br.com.letscode.letsgoal.Model.Partida;

import br.com.letscode.letsgoal.Model.Clube.Clube;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "casa_id")
    private Clube casa;
    @OneToOne
    @JoinColumn(name = "visitante_id")
    private Clube visitante;
    private LocalDateTime dataPartida;
    private String local;
    private Integer rodada;
    private String placarMandante;
    private String placarVisitante;
}
