package com.innovatech.solution.nomina.persistencia.repository;


import com.innovatech.solution.nomina.persistencia.dta.Pensiones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PensionRepository extends JpaRepository<Pensiones, Long> {
}
