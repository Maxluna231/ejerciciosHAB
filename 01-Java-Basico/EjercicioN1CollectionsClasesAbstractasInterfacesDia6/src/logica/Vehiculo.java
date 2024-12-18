
package logica;


public abstract class Vehiculo {
   private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double costo;

    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
     public int getAnio() {
        return anio;
    }

    public String toString() {
        return "ID: " + id + ", Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Costo: $" + costo;
    }

    public abstract int calcularAntiguedad();
    
    interface Electrico {
    void cargarEnergia();
    }

     interface Combustion {
    void recargarCombustible();
    }
}
