package com.example.BDFutbol.Service;

import com.example.BDFutbol.Model.Entrenador;
import com.example.BDFutbol.Model.Entrenador;
import com.example.BDFutbol.Repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para manejar operaciones relacionadas con la entidad Entrenador.
 * Este servicio proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los entrenadores.
 */
@Service
public class EntrenadorService {
    @Autowired
    private EntrenadorRepository entrenadorRepository;

    /**
     * Obtiene una lista de todos los entrenadores.
     *
     * @return List<Entrenador> - lista de todos los entrenadores en la base de datos.
     */
    public List<Entrenador> findAll() {
        return entrenadorRepository.findAll();
    }

    /**
     * Busca un entrenador por su ID.
     *
     * @param id - ID del entrenador a buscar.
     * @return Entrenador - entrenador encontrado o null si no existe.
     */
    public Entrenador findById(int idEntrenador) {
        return entrenadorRepository.findById(idEntrenador).orElse(null);
    }

    /**
     * Guarda un nuevo entrenador o actualiza uno existente.
     *
     * @param entrenador - entrenador a guardar o actualizar.
     * @return Entrenador - entrenador guardado o actualizado.
     */
    public Entrenador save(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    /**
     * Elimina un entrenador por su ID.
     *
     * @param id - ID del entrenador a eliminar.
     */
    public void deleteById(int idEntrenador) {
        entrenadorRepository.deleteById(idEntrenador);
    }
}