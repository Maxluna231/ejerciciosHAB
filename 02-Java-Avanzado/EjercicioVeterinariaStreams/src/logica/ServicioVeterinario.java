
package logica;

public class ServicioVeterinario {
    
    private String tipo;
    private double costo;

    public ServicioVeterinario() {
    }

    public ServicioVeterinario(String tipo, double costo) {
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "ServicioVeterinario{" + "tipo=" + tipo + ", costo=" + costo + '}';
    }
    
    
   
}
