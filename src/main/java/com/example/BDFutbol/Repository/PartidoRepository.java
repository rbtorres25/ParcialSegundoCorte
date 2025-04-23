package com.example.BDFutbol.Repository;


import com.example.BDFutbol.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Integer> {

    /**
     * Consulta nativa para devolver todos los partidos registrados en la base de datos.
     */
    @Query(value = "SELECT * FROM partido", nativeQuery = true)
    List<Partido> findAllPartidos();

    /**
     * Consulta nativa para buscar un partido por su ID.
     */
    @Query(value = "SELECT * FROM partido WHERE id_partido = ?1", nativeQuery = true)
    Partido findPartidoById(int idPartido);


    @Query(value = """
    SELECT p.id_partido, el.nombre AS equipo_local, ev.nombre AS equipo_visitante, 
           p.goles_local, p.goles_visitante
    FROM partido p
    JOIN equipo el ON p.id_equipo_local = el.id_equipo
    JOIN equipo ev ON p.id_equipo_visitante = ev.id_equipo
    """, nativeQuery = true)
    List<Object[]> obtenerResultadosPartidosConNombresEquipos();
}