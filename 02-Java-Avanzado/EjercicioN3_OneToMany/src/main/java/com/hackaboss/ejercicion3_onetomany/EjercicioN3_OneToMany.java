

package com.hackaboss.ejercicion3_onetomany;



import java.util.Arrays;
import logica.Festival;
import logica.Horario;
import logica.Pelicula;
import logica.Sala;
import persistencia.ControladoraPersistencia;

public class EjercicioN3_OneToMany {

    public static void main(String[] args) {
       ControladoraPersistencia controlPersis = new ControladoraPersistencia();
       
       Festival festival = new Festival();
       festival.setNombreFestival("Festival de cine Internacional");
       controlPersis.crearFestival(festival);
         // Crear Salas
        Sala sala1 = new Sala();
        sala1.setNombreSala("Sala 1");
        sala1.setCapacidad(100);
        sala1.setFestival(festival);

        controlPersis.crearSala(sala1);
        
        Sala sala2 = new Sala();
        sala2.setNombreSala("Sala 2");
        sala2.setCapacidad(150);
        sala2.setFestival(festival);

        controlPersis.crearSala(sala2);
        
        
        // Crear Horarios
        Horario horario1 = new Horario();
        horario1.setHoraInicio("10:00");
        horario1.setHoraFin("12:00");

        Horario horario2 = new Horario();
        horario2.setHoraInicio("12:30");
        horario2.setHoraFin("14:30");

        Horario horario3 = new Horario();
        horario3.setHoraInicio("15:00");
        horario3.setHoraFin("17:00");

        Horario horario4 = new Horario();
        horario4.setHoraInicio("17:30");
        horario4.setHoraFin("19:30");

        Horario horario5 = new Horario();
        horario5.setHoraInicio("20:00");
        horario5.setHoraFin("22:00");

        controlPersis.crearHora(horario1);
        controlPersis.crearHora(horario2);
        controlPersis.crearHora(horario3);
        controlPersis.crearHora(horario4);
        controlPersis.crearHora(horario5);
        // Crear Películas
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setTitulo("Película A");
        pelicula1.setDirector("Director A");
        pelicula1.setDuracion(120);
        pelicula1.setUnHorario(horario1);
        pelicula1.setSala(sala1);

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setTitulo("Película B");
        pelicula2.setDirector("Director B");
        pelicula2.setDuracion(120);
        pelicula2.setUnHorario(horario2);
        pelicula2.setSala(sala1);

        Pelicula pelicula3 = new Pelicula();
        pelicula3.setTitulo("Película C");
        pelicula3.setDirector("Director C");
        pelicula3.setDuracion(120);
        pelicula3.setUnHorario(horario3);
        pelicula3.setSala(sala2);

        
        controlPersis.crearPelicula(pelicula1);
        controlPersis.crearPelicula(pelicula2);
        controlPersis.crearPelicula(pelicula3);
     
        // Asociar datos
        sala1.setListaPeliculas(Arrays.asList(pelicula1, pelicula2));
        sala2.setListaPeliculas(Arrays.asList(pelicula3));
        festival.setSalas(Arrays.asList(sala1, sala2));
        
         System.out.println("Datos cargados exitosamente.");
    }
}
