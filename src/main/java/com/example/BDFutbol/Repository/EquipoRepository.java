package com.example.BDFutbol.Repository;


import com.example.BDFutbol.Model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer> {

    /**
     * Consulta nativa para obtener todos los equipos registrados.
     */
    @Query(value = "SELECT * FROM equipo", nativeQuery = true)
    List<Equipo> findAllEquipos();

    /**
     * Consulta nativa que busca un equipo según su ID.
     */
    @Query(value = "SELECT * FROM equipo WHERE id_equipo = ?1", nativeQuery = true)
    Equipo findEquipoById(int id);
}