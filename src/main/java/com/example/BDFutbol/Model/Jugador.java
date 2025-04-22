package com.example.BDFutbol.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String posicion;
    private int dorsal;
    private LocalDate fechaNac;
    private String nacionalidad;



    // Getters y setters
}