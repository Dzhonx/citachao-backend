package pe.upn.citachao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.upn.citachao.entity.Especialidad;
import pe.upn.citachao.repository.EspecialidadRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EspecialidadService {

    private final EspecialidadRepository repository;

    public List<Especialidad> listar() {
        return repository.findAll();
    }

    public Especialidad guardar(Especialidad especialidad) {
        return repository.save(especialidad);
    }
}