package com.todocodeacademy.restaurante.logica;

import com.todocodeacademy.restaurante.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Luisina
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
      
    public void crearPlatillo(Platillo plat) {

        controlPersis.crearPlatillo(plat);

    }
    
    public void eliminarPlatillo (int id) {
        controlPersis.eliminarPlatillo (id);
    }
    
    public List<Platillo> traerPlatillos () {
        return controlPersis.traerPlatillos();
    }
    
    public void editarPlatillo (Platillo plat) {
        controlPersis.editarPlatillo(plat);
    }
    
}
