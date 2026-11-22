package pe.upn.citachao.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import pe.upn.citachao.entity.Medico;
import pe.upn.citachao.service.MedicoService;

@RestController
@RequestMapping("/api/medicos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MedicoController {

    private final MedicoService service;

    @GetMapping
    public List<Medico> listar() {
        return service.listar();
    }

    @PostMapping
    public Medico guardar(@RequestBody Medico medico) {
        return service.guardar(medico);
    }
}