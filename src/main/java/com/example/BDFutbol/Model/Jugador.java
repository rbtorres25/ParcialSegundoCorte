package com.example.BDFutbol.Model;

import jakarta.persistence.*;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJugador;

    private String nombre;
    private String posicion;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    // Getters y Setters

    public Long getId() {
        return idJugador;
    }

    public void setId(Long id) {
        this.idJugador = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setId_jugador(int id) {
    }

    public void setEdad(int i) {
    }

    public void setId_equipo(int i) {

    }
}
