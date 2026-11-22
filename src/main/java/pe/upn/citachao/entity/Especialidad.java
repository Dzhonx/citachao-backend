package pe.upn.citachao.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "especialidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}