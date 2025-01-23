package org.example;

public abstract class Creadora {

    public abstract Vehiculo crearVehiculo();

    public void ejecutarVehiculo() {
        Vehiculo vehi = crearVehiculo();
        vehi.conducir();
    }


}
