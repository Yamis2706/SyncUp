package co.edu.uniquindio.proyecto.syncup.repository;

import co.edu.uniquindio.proyecto.syncup.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreoAndContrasena(String correo, String contrasena);
}
