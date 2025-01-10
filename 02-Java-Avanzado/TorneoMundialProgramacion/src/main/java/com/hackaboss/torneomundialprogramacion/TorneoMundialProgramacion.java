
package com.hackaboss.torneomundialprogramacion;

import java.time.LocalDate;
import logica.Categoria;
import logica.Inscripcion;
import logica.Programador;
import logica.Torneo;
import persistencia.ControladoraPersistencia;

public class TorneoMundialProgramacion {

    public static void main(String[] args) {
       // Crear una instancia de la clase Persistencia
         ControladoraPersistencia controlPersis = new ControladoraPersistencia();
         
         // Paso 1: Crear un torneo
        Torneo torneo = new Torneo();
        torneo.setNombreTorneo("Torneo Mundial de Programación");
        controlPersis.crearTorneo(torneo);

        // Paso 2: Crear 2 categorías
        Categoria categoria1 = new Categoria();
        categoria1.setNombreCategoria("Hackathons Relámpago");
        categoria1.setTorneo(torneo);  // Asignar la categoría al torneo

        Categoria categoria2 = new Categoria();
        categoria2.setNombreCategoria("Algoritmos en Tiempo Real");
        categoria2.setTorneo(torneo);  // Asignar la categoría al torneo

        // Persistir las categorías
        controlPersis.crearCategoria(categoria1);
        controlPersis.crearCategoria(categoria2);

        // Paso 3: Crear 3 programadores
        Programador programador1 = new Programador();
        programador1.setNombre("Juan");
        programador1.setApellido("Pérez");
        programador1.setNivelAcademico("Intermedio");

        Programador programador2 = new Programador();
        programador2.setNombre("Ana");
        programador2.setApellido("Gómez");
        programador2.setNivelAcademico("Avanzado");

        Programador programador3 = new Programador();
        programador3.setNombre("Carlos");
        programador3.setApellido("Martínez");
        programador3.setNivelAcademico("Principiante");

        // Persistir los programadores
        controlPersis.crearProgramador(programador1);
        controlPersis.crearProgramador(programador2);
        controlPersis.crearProgramador(programador3);

        // Paso 4: Crear inscripciones y asignar categorías y programadores
        Inscripcion inscripcion1 = new Inscripcion();
        inscripcion1.setFecha(LocalDate.now());
        inscripcion1.setCategoria(categoria1);  // Programador 1 en la primera categoría
        inscripcion1.setProgramador(programador1);

        Inscripcion inscripcion2 = new Inscripcion();
        inscripcion2.setFecha(LocalDate.now());
        inscripcion2.setCategoria(categoria2);  // Programador 2 en la segunda categoría
        inscripcion2.setProgramador(programador2);

        Inscripcion inscripcion3 = new Inscripcion();
        inscripcion3.setFecha(LocalDate.now());
        inscripcion3.setCategoria(categoria1);  // Programador 3 en la primera categoría
        inscripcion3.setProgramador(programador3);

        // Paso 5: Persistir las inscripciones
        controlPersis.crearInscripcion(inscripcion1);
        controlPersis.crearInscripcion(inscripcion2);
        controlPersis.crearInscripcion(inscripcion3);

        System.out.println("Datos cargados exitosamente.");
        
    }
}
