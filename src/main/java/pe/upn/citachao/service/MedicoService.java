package pe.upn.citachao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.upn.citachao.entity.Medico;
import pe.upn.citachao.repository.MedicoRepository;

@Service
@RequiredArgsConstructor
public class MedicoService {

    private final MedicoRepository repository;

    public List<Medico> listar() {
        return repository.findAll();
    }

    public Medico guardar(Medico medico) {
        return repository.save(medico);
    }
}