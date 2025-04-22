package com.example.BDFutbol.Model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;
    private LocalDate fundacion;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Entrenador> entrenadores;

    @OneToMany(mappedBy = "equipoLocal")
    private List<Partido> partidosComoLocal;

    @OneToMany(mappedBy = "equipoVisitante")
    private List<Partido> partidosComoVisitante;

    // Getters y setters
}