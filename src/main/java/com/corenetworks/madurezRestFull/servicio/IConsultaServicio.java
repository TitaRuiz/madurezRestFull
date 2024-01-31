package com.corenetworks.madurezRestFull.servicio;

import com.corenetworks.madurezRestFull.modelo.ConsultaMedica;

import java.util.List;

public interface IConsultaServicio {

    ConsultaMedica crear(ConsultaMedica cm);
    ConsultaMedica modificar(ConsultaMedica cm);
    void eliminar(int id);

    ConsultaMedica consultaUno(int id);
    List<ConsultaMedica> consultaTodos();
}
