package com.example.BDFutbol.Service;

import com.example.BDFutbol.Model.Estadistica;
import com.example.BDFutbol.Repository.EstadisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para manejar operaciones relacionadas con la entidad EstadisticasJugador.
 * Este servicio proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre las estadísticas de los jugadores.
 */
@Service
public class EstadisticaService {

    @Autowired
    private EstadisticaRepository estadisticaRepository;

    public List<Estadistica> findAll() {
        return estadisticaRepository.findAll();
    }

    public Estadistica findById(int idEstadistica) {
        return estadisticaRepository.findById(idEstadistica).orElse(null);
    }

    public Estadistica save(Estadistica estadistica) {
        return estadisticaRepository.save(estadistica);
    }

    public void deleteById(int idEstadistica) {
        estadisticaRepository.deleteById(idEstadistica);
    }

    public List<Estadistica> findJugadoresConMasDeXGoles(int goles) {
        return estadisticaRepository.findJugadoresConMasDeXGoles(goles);
    }

    public Integer totalGolesPorEquipo(int idEquipo) {
        return estadisticaRepository.totalGolesPorEquipo(idEquipo);
    }
}