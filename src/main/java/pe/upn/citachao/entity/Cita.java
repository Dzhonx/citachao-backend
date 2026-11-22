package pe.upn.citachao.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cita")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paciente;

    private String fecha;

    private String hora;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;
}