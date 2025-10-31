package co.edu.uniquindio.proyecto.syncup.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desactiva protección CSRF para pruebas
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Permite acceso libre a todos los endpoints
                )
                .formLogin(login -> login.disable()) // Desactiva el formulario de login
                .httpBasic(basic -> basic.disable()); // Desactiva autenticación básica

        return http.build();
    }
}
