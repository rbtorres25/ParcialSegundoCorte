package com.example.BDFutbol.Model;

import jakarta.persistence.*;

@Entity
public class Estadistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int goles;
    private int asistencias;
    private int minutosJugados;
    // Agrega más campos si lo deseas



    // Getters y setters
}