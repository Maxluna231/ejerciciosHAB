package com.todocodeacademy.restaurante.persistencia;

import com.todocodeacademy.restaurante.logica.Platillo;
import com.todocodeacademy.restaurante.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PlatilloJpaController platilloJpa = new PlatilloJpaController();

    
    public void crearPlatillo(Platillo plat) {

        platilloJpa.create(plat);

    }

    public void eliminarPlatillo(int id) {
        try {
            platilloJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Platillo> traerPlatillos() {
        return platilloJpa.findPlatilloEntities();
    }

    public void editarPlatillo(Platillo plat) {
        try {
            platilloJpa.edit(plat);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
    
}
