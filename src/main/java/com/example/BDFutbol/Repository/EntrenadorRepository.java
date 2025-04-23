package com.example.BDFutbol.Repository;


import com.example.BDFutbol.Model.Entrenador;
import com.example.BDFutbol.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> {

    /**
     * Consulta nativa para obtener todos los entrenadores.
     * Utiliza SQL directamente con nativeQuery = true.
     */
    @Query(value = "SELECT * FROM entrenador", nativeQuery = true)
    List<Entrenador> findAllEntrenadores();

    /**
     * Consulta nativa para obtener un entrenador por ID.
     * Utiliza ?1 para indicar que el primer parámetro será reemplazado por el valor del ID.
     */
    @Query(value = "SELECT * FROM entrenador WHERE id_entrenador = ?1", nativeQuery = true)
    Entrenador findEntrenadorById(int id);
}

