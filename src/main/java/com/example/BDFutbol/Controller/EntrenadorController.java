package com.example.BDFutbol.Controller;

import com.example.BDFutbol.Model.Entrenador;
import com.example.BDFutbol.Service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @GetMapping
    public List<Entrenador> getAllEntrenadores() {
        return entrenadorService.findAll();
    }

    @GetMapping("/{id}")
    public Entrenador getEntrenadorById(@PathVariable int id) {
        return entrenadorService.findById(id);
    }

    @PostMapping
    public Entrenador createEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.save(entrenador);
    }

    @PutMapping("/{id}")
    public Entrenador updateEntrenador(@PathVariable int id, @RequestBody Entrenador entrenador) {
        entrenador.setId_entrenador(id);
        return entrenadorService.save(entrenador);
    }

    @DeleteMapping("/{id}")
    public void deleteEntrenador(@PathVariable int id) {
        entrenadorService.deleteById(id);
    }
}