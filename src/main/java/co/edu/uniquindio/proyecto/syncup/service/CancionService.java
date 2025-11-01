package co.edu.uniquindio.proyecto.syncup.service;

import co.edu.uniquindio.proyecto.syncup.model.Cancion;

import java.util.List;
import java.util.Optional;

public interface CancionService {
    List<Cancion> listarCanciones();
    Cancion guardarCancion(Cancion cancion);
    void eliminarCancion(Long id);
    Optional<Cancion> obtenerPorId(Long id);
}
