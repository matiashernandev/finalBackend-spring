package com.example.finalBackend.dto;

import com.example.finalBackend.entity.Odontologo;
import com.example.finalBackend.entity.Paciente;

import java.time.LocalDateTime;

public class TurnoDTO {


    private Integer id;
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Odontologo odontologo;


    //GETTERS
    public Integer getId() {
        return id;
    }
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public Odontologo getOdontologo() {
        return odontologo;
    }

    //SETTERS
    public void setId(Integer id) {
        this.id = id;
    }
}
