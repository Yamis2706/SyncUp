package co.edu.uniquindio.proyecto.syncup.repository;

import co.edu.uniquindio.proyecto.syncup.model.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, Long> {
    // puedes agregar queries personalizados si los necesitas
}
