package com.example.BDFutbol.Model;

import jakarta.persistence.*;

@Entity
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntrenador;

    private String nombre;
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "equipo_id")  // Nombre de la columna que será la FK en la tabla
    private Equipo equipo;

    // Getters y setters
    public Long getId() { return idEntrenador; }
    public void setId(Long id) { this.idEntrenador = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public Equipo getEquipo() {
        return null;
    }
    public void setEquipo(Equipo equipo) { this.equipo = equipo; }

    public void setId_entrenador(int id) {
    }

    public void setEdad(int i) {
    }

    public void setNacionalidad(String s) {
    }

    public void setId_equipo(int i) {

    }
}
