package com.innovatech.solution.nomina.service;

import com.innovatech.solution.nomina.persistencia.dta.Persona;
import com.innovatech.solution.nomina.persistencia.dto.BusquedaPersonasDTO;

import java.util.List;

public interface ConsultasPersonaService {
    List<Persona> busquedaPersonas(BusquedaPersonasDTO busquedaDTO);
}
