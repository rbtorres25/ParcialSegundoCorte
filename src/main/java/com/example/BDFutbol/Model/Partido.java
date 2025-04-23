package com.example.BDFutbol.Model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPartido;

    private LocalDate fecha;
    private String estadio;

    @ManyToOne
    @JoinColumn(name = "equipo_local_id")
    private Equipo equipoLocal;

    public void setId_partido(int idPartido) {

    }

    public void setId_equipo_local(int i) {
    }

    public void setId_equipo_visitante(int i) {
    }

    public void setGoles_local(int i) {
    }

    public void setGoles_visitante(int i) {

    }


    // Getters y setters
}