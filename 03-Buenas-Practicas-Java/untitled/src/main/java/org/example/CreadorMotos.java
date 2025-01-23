package org.example;

public class CreadorMotos extends Creadora{
    @Override
    public Vehiculo crearVehiculo() {
        return new Moto();
    }
}
