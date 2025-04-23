package com.example.BDFutbol.Service;

import com.example.BDFutbol.Model.Partido;
import com.example.BDFutbol.Repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para manejar operaciones relacionadas con la entidad Partido.
 * Este servicio proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los partidos.
 */
@Service
public class PartidoService {
    @Autowired
    private PartidoRepository partidoRepository;

    public List<Partido> findAll() {
        return partidoRepository.findAll();
    }

    public Partido findById(int id) {
        return partidoRepository.findById(id).orElse(null);
    }

    public Partido save(Partido partido) {
        return partidoRepository.save(partido);
    }

    public void deleteById(int id) {
        partidoRepository.deleteById(id);
    }

    public List<Object[]> obtenerResultadosPartidosConNombresEquipos() {
        return partidoRepository.obtenerResultadosPartidosConNombresEquipos();
    }
}