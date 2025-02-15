package com.innovatech.solution.nomina.persistencia.repository;


import com.innovatech.solution.nomina.persistencia.dta.Bancos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<Bancos, Long> {
}
