package pe.upn.citachao.service;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import pe.upn.citachao.entity.Cita;
import pe.upn.citachao.repository.CitaRepository;

@Service
@RequiredArgsConstructor
public class CitaService {

    private final CitaRepository repository;

    public List<Cita> listar() {
        return repository.findAll();
    }

    public Cita guardar(Cita cita) {

        if(cita.getPaciente() == null ||
           cita.getPaciente().isBlank()) {

            throw new RuntimeException(
                "El nombre del paciente es obligatorio");
        }

        return repository.save(cita);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}