package com.todocodeacademy.restaurante;

import com.todocodeacademy.restaurante.logica.Controladora;
import com.todocodeacademy.restaurante.logica.Platillo;

public class Restaurante {

    public static void main(String[] args) {
       
        Controladora control = new Controladora ();
        
        //Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
        Platillo plat = new Platillo (1, "Pizza de Jamón", "Masa, jamón, tomate, cebolla, queso", 15.0);
        control.crearPlatillo(plat);
        
        //Crear 2 objetos de tipo platillo más. 
        Platillo plat2 = new Platillo (2, "Hamburguesa Completa", "Pan, carne, tomate, lechuga, queso, mayonesa", 5.0);
        Platillo plat3 = new Platillo (3, "Papas fritas", "Papas, aceite", 1.5);
        control.crearPlatillo(plat2);
        control.crearPlatillo(plat3);
        
        //Eliminar luego uno y editar los datos de otro mediante JPA.
        control.eliminarPlatillo(2);
        
        //editamos datos de un
        plat3.setPrecio(0.75);
        
        control.editarPlatillo(plat3);
        
        
       
        
    }
}
