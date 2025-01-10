
package com.hackaboss.ejercicio_n1onetoone;

import logica.Director;
import logica.Oficina;
import persistencia.ControladoraPersistencia;

public class EjercicioOficinasYDirectoresOneToOne {

    public static void main(String[] args) {
        
       ControladoraPersistencia controlPersis = new ControladoraPersistencia();
       
       Director dir = new Director(12345L, "Fer", "Casillas", "15000", null);
       
       Oficina ofic = new Oficina(4522L, "6A", "PB", dir);
       
       dir.setOficina(ofic);
       
     
       controlPersis.crearOficina(ofic);
        
        
        
        
    }
}
