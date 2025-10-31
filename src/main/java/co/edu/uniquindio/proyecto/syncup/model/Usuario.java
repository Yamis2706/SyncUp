package co.edu.uniquindio.proyecto.syncup.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("nombre")
    @Column(nullable = false, length = 100)
    private String nombre;

    @JsonProperty("correo")
    @Column(nullable = false, unique = true, length = 150)
    private String correo;

    @JsonProperty("contrasena")
    @Column(nullable = false, length = 150)
    private String contrasena;
}

