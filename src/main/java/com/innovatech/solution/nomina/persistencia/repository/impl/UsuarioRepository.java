package com.innovatech.solution.nomina.persistencia.repository.impl;

import com.innovatech.solution.nomina.persistencia.dta.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
    boolean existsByEmail(String email);
}
