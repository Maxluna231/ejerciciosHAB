package org.example;

public class ElectricoFactory implements VehiculoFactory{
    @Override
    public Carro crearCarro() {
        return new CarroElectrico();
    }

    @Override
    public Moto crearMoto() {
        return new MotoElectrica();
    }
}
