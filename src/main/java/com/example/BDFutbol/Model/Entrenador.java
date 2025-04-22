package com.example.BDFutbol.Model;

import jakarta.persistence.*;

@Entity
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    // Getters y setters
}