
package logica;


public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto() {
    }

    public Auto(int cantidadPuertas, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public void acelerar() {
        System.out.println("El auto esta acelerando");
    }
    
}
