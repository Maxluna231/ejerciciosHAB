package com.hackaboss.ejemploonetoone;

import logica.Carro;
import logica.Propietario;
import persistencia.ControladoraPersistencia;

public class EjemploOneToOne {

    public static void main(String[] args) {
        
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        Propietario prop = new Propietario (1549658L, "Juan", "Perez", "123", 
                "casado", null);
       Carro carro = new Carro (1651616L, "Onix", "Chevrolet", prop );
       prop.setCarro(carro);
        
       //controlPersis.crearPropietario(prop);
       controlPersis.crearCarro(carro);
        
    }
}
