package com.example.BDFutbol.Model;

import jakarta.persistence.*;

@Entity
public class Estadistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadistica;

    private int goles;
    private int asistencias;
    private int minutosJugados;

    public void setId_estadistica(int idEstadistica) {
    }

    public void setId_jugador(int i) {
    }

    public void setId_partido(int i) {
    }

    public void setGoles(int i) {
    }

    public void setAsistencias(int i) {
    }

    public void setMinutos_jugados(int i) {

    }
    // Agrega más campos si lo deseas



    // Getters y setters
}