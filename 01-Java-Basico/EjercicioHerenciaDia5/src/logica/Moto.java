
package logica;

public class Moto extends Vehiculo{
    private double cilindrada;

    public Moto() {
    }

    public Moto(double cilindrada, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
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
        System.out.println("La moto esta acelerando");
    }
    
}
