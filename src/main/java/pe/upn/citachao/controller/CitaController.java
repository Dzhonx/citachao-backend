package pe.upn.citachao.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import pe.upn.citachao.entity.Cita;
import pe.upn.citachao.service.CitaService;

@RestController
@RequestMapping("/api/citas")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CitaController {

    private final CitaService service;

    @GetMapping
    public List<Cita> listar() {
        return service.listar();
    }

    @PostMapping
    public Cita guardar(@RequestBody Cita cita) {
        return service.guardar(cita);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}