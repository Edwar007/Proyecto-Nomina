package com.innovatech.solution.nomina.persistencia.repository;

import com.innovatech.solution.nomina.persistencia.dta.PagoNomina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PagoNominaRepository extends JpaRepository<PagoNomina, Long>, JpaSpecificationExecutor<PagoNomina> {
}
