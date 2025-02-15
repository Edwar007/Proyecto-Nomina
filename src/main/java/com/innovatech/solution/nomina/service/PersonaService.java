package com.innovatech.solution.nomina.service;

import com.innovatech.solution.nomina.persistencia.dto.PersonaDTO;
import java.util.List;

public interface PersonaService {

    List<PersonaDTO> personas();
    PersonaDTO persona(String id);
    PersonaDTO registrar(PersonaDTO persona);
    void actualizar(PersonaDTO persona);
    void desactivar(Long id);
}
