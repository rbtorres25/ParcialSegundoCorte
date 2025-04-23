package com.example.BDFutbol.Controller;

import com.example.BDFutbol.Model.Jugador;
import com.example.BDFutbol.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jugador")
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    // 1. Obtener jugadores por equipo
    @GetMapping("/equipo/{idEquipo}")
    public List<Jugador> obtenerJugadoresPorEquipo(@PathVariable int idEquipo) {
        return jugadorService.obtenerJugadoresPorEquipo(idEquipo);
    }

    // 2. Jugadores con más de X goles
    @GetMapping("/goles/{minGoles}")
    public List<Jugador> obtenerJugadoresConMasDeXGoles(@PathVariable int minGoles) {
        return jugadorService.obtenerJugadoresConMasDeXGoles(minGoles);
    }


}