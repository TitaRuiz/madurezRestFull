package com.corenetworks.madurezRestFull.repositorio;

import com.corenetworks.madurezRestFull.modelo.ConsultaMedica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConsusltaRepositorio extends JpaRepository<ConsultaMedica,Integer> {
}
