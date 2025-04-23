package com.example.BDFutbol.Controller;

import com.example.BDFutbol.Model.Equipo;
import com.example.BDFutbol.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping
    public List<Equipo> getAllEquipos() {
        return equipoService.findAll();
    }

    @GetMapping("/{id}")
    public Equipo getEquipoById(@PathVariable int id) {
        return equipoService.findById(id);
    }

    @PostMapping
    public Equipo createEquipo(@RequestBody Equipo equipo) {
        return equipoService.save(equipo);
    }

    @PutMapping("/{id}")
    public Equipo updateEquipo(@PathVariable int id, @RequestBody Equipo equipo) {
        equipo.setId_equipo(id);
        return equipoService.save(equipo);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipo(@PathVariable int id) {
        equipoService.deleteById(id);
    }
}