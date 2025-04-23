/*package com.example.BDFutbol.Model;


import com.example.BDFutbol.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class Data {

    @Bean
    CommandLineRunner initData(
            JugadorRepository jugadorRepository,
            EquipoRepository equipoRepository,
            EntrenadorRepository entrenadorRepository,
            PartidoRepository partidoRepository,
            EstadisticaRepository estadisticaRepository
    ) {
        return args -> {
            Random random = new Random();

            // Crear equipos
            for (int i = 1; i <= 100; i++) {
                Equipo equipo = new Equipo();
                equipo.setNombre("Equipo " + i);
                equipo.setCiudad("Ciudad " + i);
                equipoRepository.save(equipo);
            }

            // Crear entrenadores
            for (int i = 1; i <= 100; i++) {
                Entrenador entrenador = new Entrenador();
                entrenador.setNombre("Entrenador " + i);
                entrenador.setEdad(30 + random.nextInt(20));
                entrenador.setNacionalidad("País " + i);
                entrenador.setId_equipo(i); // Relacionado con el equipo i
                entrenadorRepository.save(entrenador);
            }

            // Crear jugadores
            for (int i = 1; i <= 100; i++) {
                Jugador jugador = new Jugador();
                jugador.setNombre("Jugador " + i);
                jugador.setPosicion("Delantero");
                jugador.setEdad(18 + random.nextInt(15));
                jugador.setId_equipo(random.nextInt(100) + 1);
                jugadorRepository.save(jugador);
            }

            // Crear partidos
            for (int i = 1; i <= 100; i++) {
                Partido partido = new Partido();
                partido.setId_equipo_local(random.nextInt(100) + 1);
                partido.setId_equipo_visitante(random.nextInt(100) + 1);
                partido.setGoles_local(random.nextInt(5));
                partido.setGoles_visitante(random.nextInt(5));
                partidoRepository.save(partido);
            }

            // Crear estadísticas
            for (int i = 1; i <= 100; i++) {
                Estadistica estadistica = new Estadistica();
                estadistica.setId_jugador(random.nextInt(100) + 1);
                estadistica.setId_partido(random.nextInt(100) + 1);
                estadistica.setGoles(random.nextInt(5));
                estadistica.setAsistencias(random.nextInt(3));
                estadistica.setMinutos_jugados(90);
                estadisticaRepository.save(estadistica);
            }

            System.out.println("✅ Se insertaron 100 registros en cada tabla");
        };
    }
}


 */