/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hackaboss.ejemplojpa;

import java.util.ArrayList;
import java.util.List;
import logica.Persona;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author lunad
 */
public class EjemploJPA {

    public static void main(String[] args) {
        
         ControladoraPersistencia controlPersis = new ControladoraPersistencia();
         
         //Crear 3 personas en la BD
         controlPersis.crearPersona(new Persona(1L, "max", 20));
         controlPersis.crearPersona(new Persona(2L, "Esteban", 20));
         controlPersis.crearPersona(new Persona(3L, "Alejendra", 30));
         
         //Obtener todas las personas
         List<Persona> listaPersonas = controlPersis.traerPersonas();
         for(Persona per: listaPersonas){
             System.out.println("Persona: " + per.getNombre());
         }
         
         //Borramos una persona
         controlPersis.borrarPersona(2L);
         
         controlPersis.modificarPersona(new Persona(3L,"M",3));
    }
}
