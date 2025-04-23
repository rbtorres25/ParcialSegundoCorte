package com.example.BDFutbol.Service;



import com.example.BDFutbol.Model.Jugador;
import com.example.BDFutbol.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para manejar operaciones relacionadas con la entidad Jugador.
 * Este servicio proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los jugadores.
 */
@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> obtenerJugadoresPorEquipo(int idEquipo) {
        return jugadorRepository.findJugadoresByEquipo(idEquipo);
    }

    public List<Jugador> obtenerJugadoresConMasDeXGoles(int minGoles) {
        return jugadorRepository.findJugadoresConMasDeXGoles(minGoles);
    }



}