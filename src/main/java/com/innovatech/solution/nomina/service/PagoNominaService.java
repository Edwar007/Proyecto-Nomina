package com.innovatech.solution.nomina.service;

import com.innovatech.solution.nomina.persistencia.dto.JasperDTO;
import com.innovatech.solution.nomina.persistencia.dto.PagoNominaDTO;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

public interface PagoNominaService {
    List<PagoNominaDTO> listarPagos();
    PagoNominaDTO calcularPago(PagoNominaDTO pago);

    PagoNominaDTO crearPago(PagoNominaDTO pago);
    Double calPrima(LocalDate fecNom, Double salario);
    ResponseEntity<ByteArrayResource> crearPdf(JasperDTO jasper);

}
