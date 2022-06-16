package com.example.finalBackend.entity;

import java.time.LocalDateTime;

public class Turno {

    private Integer id;
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Odontologo odontologo;

    // GETTERS
    public Integer getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    /* ----------------------------------------------------------------------------------------- */

    //SETTERS
    public void setId(Integer id) {
        this.id = id;
    }
}
