package co.edu.uniquindio.proyecto.syncup.repository;

import co.edu.uniquindio.proyecto.syncup.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCorreo(String correo);
}
