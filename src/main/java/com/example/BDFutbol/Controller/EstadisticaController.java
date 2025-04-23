package com.example.BDFutbol.Controller;

import com.example.BDFutbol.Model.Estadistica;
import com.example.BDFutbol.Service.EstadisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class EstadisticaController {

    @Autowired
    private EstadisticaService estadisticaService;

    // Obtener todas las estadísticas
    @GetMapping
    public List<Estadistica> getAllEstadisticas() {
        return estadisticaService.findAll();
    }

    // Obtener estadística por ID
    @GetMapping("/{id}")
    public Estadistica getEstadisticaById(@PathVariable int id) {
        return estadisticaService.findById(id);
    }

    // Crear nueva estadística
    @PostMapping
    public Estadistica createEstadistica(@RequestBody Estadistica estadistica) {
        return estadisticaService.save(estadistica);
    }

    // Actualizar estadística existente
    @PutMapping("/{id}")
    public Estadistica updateEstadistica(@PathVariable int id, @RequestBody Estadistica estadistica) {
        estadistica.setId_estadistica(id);
        return estadisticaService.save(estadistica);
    }

    // Eliminar estadística por ID
    @DeleteMapping("/{id}")
    public void deleteEstadistica(@PathVariable int id) {
        estadisticaService.deleteById(id);
    }

    // 2. Obtener los jugadores que han marcado más de X goles
    @GetMapping("/goles-mayor-que/{goles}")
    public List<Estadistica> getJugadoresConMasGoles(@PathVariable int goles) {
        return estadisticaService.findJugadoresConMasDeXGoles(goles);
    }

    // 3. Obtener el número total de goles por equipo
    @GetMapping("/total-goles/{idEquipo}")
    public Integer getTotalGolesPorEquipo(@PathVariable int idEquipo) {
        return estadisticaService.totalGolesPorEquipo(idEquipo);
    }
}
