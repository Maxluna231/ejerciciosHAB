package org.example;

public class GasolinaFactory implements VehiculoFactory{
    @Override
    public Carro crearCarro() {
        return new CarroGasolina();
    }

    @Override
    public Moto crearMoto() {
        return new MotoGasolina();
    }
}
