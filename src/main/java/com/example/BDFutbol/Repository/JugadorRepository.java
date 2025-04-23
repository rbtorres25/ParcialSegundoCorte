package com.example.BDFutbol.Repository;


import com.example.BDFutbol.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {

    /**
     * Consulta nativa para obtener todos los jugadores de un equipo específico.
     */
    @Query(value = "SELECT * FROM jugador WHERE equipo_id = :idEquipo", nativeQuery = true)
    List<Jugador> findJugadoresByEquipo(int idEquipo);

    /**
     * Consulta nativa para obtener los jugadores que han marcado más de X goles.
     *
     */
    @Query(value = "SELECT * FROM jugador WHERE goles > :minGoles", nativeQuery = true)
    List<Jugador> findJugadoresConMasDeXGoles(int minGoles);
}