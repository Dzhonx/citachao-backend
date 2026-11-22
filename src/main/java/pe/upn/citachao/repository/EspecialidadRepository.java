package pe.upn.citachao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upn.citachao.entity.Especialidad;

public interface EspecialidadRepository
        extends JpaRepository<Especialidad, Long> {

}