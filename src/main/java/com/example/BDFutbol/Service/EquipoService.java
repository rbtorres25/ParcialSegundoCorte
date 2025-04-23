package com.example.BDFutbol.Service;

import com.example.BDFutbol.Model.Equipo;
import com.example.BDFutbol.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para manejar operaciones relacionadas con la entidad Equipo.
 * Este servicio proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los equipos.
 */
@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public List<Equipo> findAll() {
        return equipoRepository.findAll();
    }

    public Equipo findById(int idEquipo) {
        return equipoRepository.findById(idEquipo).orElse(null);
    }

    public Equipo save(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public void deleteById(int idEquipo) {
        equipoRepository.deleteById(idEquipo);
    }
}