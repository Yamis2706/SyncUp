package co.edu.uniquindio.proyecto.syncup.service.impl;

import co.edu.uniquindio.proyecto.syncup.model.Cancion;
import co.edu.uniquindio.proyecto.syncup.repository.CancionRepository;
import co.edu.uniquindio.proyecto.syncup.service.CancionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CancionServiceImpl implements CancionService {

    private final CancionRepository cancionRepository;

    public CancionServiceImpl(CancionRepository cancionRepository) {
        this.cancionRepository = cancionRepository;
    }

    @Override
    public List<Cancion> listarCanciones() {
        return cancionRepository.findAll();
    }

    @Override
    public Cancion guardarCancion(Cancion cancion) {
        return cancionRepository.save(cancion);
    }

    @Override
    public void eliminarCancion(Long id) {
        cancionRepository.deleteById(id);
    }

    @Override
    public Optional<Cancion> obtenerPorId(Long id) {
        return cancionRepository.findById(id);
    }
}
