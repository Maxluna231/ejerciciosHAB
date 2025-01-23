package org.example;

public class Main {
    public static void main(String[] args) {

        Creadora creadoraCarro = new CreadorCarros();
        creadoraCarro.ejecutarVehiculo();

        Creadora creadoraMoto = new CreadorMotos();
        creadoraMoto.ejecutarVehiculo();
    }
}