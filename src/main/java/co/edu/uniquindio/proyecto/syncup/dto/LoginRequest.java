package co.edu.uniquindio.proyecto.syncup.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String correo;
    private String contrasena;
}
