package com.example.BDFutbol.Controller;

import com.example.BDFutbol.Model.Partido;
import com.example.BDFutbol.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public List<Partido> getAllPartidos() {
        return partidoService.findAll();
    }

    @GetMapping("/{id}")
    public Partido getPartidoById(@PathVariable int id) {
        return partidoService.findById(id);
    }

    @PostMapping
    public Partido createPartido(@RequestBody Partido partido) {
        return partidoService.save(partido);
    }

    @PutMapping("/{id}")
    public Partido updatePartido(@PathVariable int id, @RequestBody Partido partido) {
        partido.setId_partido(id);
        return partidoService.save(partido);
    }

    @DeleteMapping("/{id}")
    public void deletePartido(@PathVariable int id) {
        partidoService.deleteById(id);
    }

    @GetMapping("/resultados")
    public List<Map<String, Object>> getResultadosPartidos() {
        List<Object[]> resultados = partidoService.obtenerResultadosPartidosConNombresEquipos();

        List<Map<String, Object>> respuesta = new ArrayList<>();
        for (Object[] fila : resultados) {
            Map<String, Object> partido = new HashMap<>();
            partido.put("id_partido", fila[0]);
            partido.put("equipo_local", fila[1]);
            partido.put("equipo_visitante", fila[2]);
            partido.put("goles_local", fila[3]);
            partido.put("goles_visitante", fila[4]);
            respuesta.add(partido);
        }

        return respuesta;
    }
}