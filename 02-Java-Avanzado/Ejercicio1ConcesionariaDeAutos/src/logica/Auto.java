
package logica;


public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    
    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }

   
    
}
