package com.innovatech.solution.nomina.persistencia.repository;


import com.innovatech.solution.nomina.persistencia.dta.Eps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpsRepository extends JpaRepository<Eps, Long> {
}
