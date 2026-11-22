package pe.upn.citachao.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import pe.upn.citachao.entity.Especialidad;
import pe.upn.citachao.service.EspecialidadService;

@RestController
@RequestMapping("/api/especialidades")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EspecialidadController {

    private final EspecialidadService service;

    @GetMapping
    public List<Especialidad> listar() {
        return service.listar();
    }

    @PostMapping
    public Especialidad guardar(@RequestBody Especialidad especialidad) {
        return service.guardar(especialidad);
    }
}