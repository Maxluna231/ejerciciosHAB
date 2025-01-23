package org.example;

public class Main {
    public static void main(String[] args) {
        //Crear la fábrica de vehículos gasolina
        VehiculoFactory gasolina = new GasolinaFactory();
        Carro carroGasolina = gasolina.crearCarro();
        Moto motoGasolina = gasolina.crearMoto();

        carroGasolina.conducir();
        motoGasolina.conducir();

        //Crear la fábrica de eléctricos
        VehiculoFactory electrico = new ElectricoFactory();
        Carro carroElectrico = electrico.crearCarro();
        Moto motoElectrica = electrico.crearMoto();

        carroElectrico.conducir();
        motoElectrica.conducir();

    }
}