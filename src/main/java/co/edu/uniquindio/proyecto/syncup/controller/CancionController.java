package co.edu.uniquindio.proyecto.syncup.controller;

import co.edu.uniquindio.proyecto.syncup.model.Cancion;
import co.edu.uniquindio.proyecto.syncup.service.CancionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/canciones")
public class CancionController {

    private final CancionService cancionService;

    public CancionController(CancionService cancionService) {
        this.cancionService = cancionService;
    }

    @GetMapping
    public ResponseEntity<List<Cancion>> listar() {
        return ResponseEntity.ok(cancionService.listarCanciones());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cancion> obtener(@PathVariable Long id) {
        return cancionService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cancion> crear(@RequestBody Cancion cancion) {
        Cancion guardada = cancionService.guardarCancion(cancion);
        // devuelve 201 Created con Location
        return ResponseEntity.created(URI.create("/api/canciones/" + guardada.getId())).body(guardada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (cancionService.obtenerPorId(id).isPresent()) {
            cancionService.eliminarCancion(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
