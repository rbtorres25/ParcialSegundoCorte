package com.example.BDFutbol.Repository;

import com.example.BDFutbol.Model.Estadistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadisticaRepository extends JpaRepository<Estadistica, Integer> {

    /**
     * Consulta nativa para listar todas las estadísticas de jugadores.
     */
    @Query(value = "SELECT * FROM estadisticas_jugador", nativeQuery = true)
    List<Estadistica> findAllEstadisticas();

    /**
     * Consulta nativa para encontrar estadísticas por ID.
     */
    @Query(value = "SELECT * FROM estadisticas_jugador WHERE id_estadistica = ?1", nativeQuery = true)
    Estadistica findEstadisticaById(int id);


    //Obtener los jugadores que han marcado más de X goles
    @Query(value = "SELECT * FROM estadisticas_jugador WHERE goles > ?1", nativeQuery = true)
    List<Estadistica> findJugadoresConMasDeXGoles(int goles);

    @Query(value = """
    SELECT SUM(ej.goles)
    FROM estadistica ej
    JOIN jugador j ON ej.id_jugador = j.id_jugador
    WHERE j.id_equipo = ?1
    """, nativeQuery = true)
    Integer totalGolesPorEquipo(int idEquipo);

}
