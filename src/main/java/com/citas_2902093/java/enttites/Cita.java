package com.citas_2902093.java.enttites;
import java.time.LocalDateTime;

public class Cita {
    private Long id;
    protected LocalDateTime fecha;
    private Paciente paciente;
    private Consultorio consultorio;


    public Cita(Long id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public Consultorio getConsultorio() {
        return consultorio;
    }


    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    

    


}
