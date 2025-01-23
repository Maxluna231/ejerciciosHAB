package org.example;

public class CreadorCarros extends Creadora{
    @Override
    public Vehiculo crearVehiculo() {
        return new Carro();
    }
}
