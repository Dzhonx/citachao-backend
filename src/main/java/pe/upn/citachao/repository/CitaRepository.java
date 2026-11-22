package pe.upn.citachao.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.upn.citachao.entity.Cita;

public interface CitaRepository
        extends JpaRepository<Cita, Long> {

}