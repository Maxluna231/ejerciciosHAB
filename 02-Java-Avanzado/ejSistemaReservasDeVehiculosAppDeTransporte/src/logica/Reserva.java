
package logica;


public class Reserva <T> {
    
    private T vehiculo;
    private String metodoReserva;

    public Reserva() {
    }

    public Reserva(T vehiculo, String metodoReserva) {
        this.vehiculo = vehiculo;
        this.metodoReserva = metodoReserva;
    }

    public T getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(T vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMetodoReserva() {
        return metodoReserva;
    }

    public void setMetodoReserva(String metodoReserva) {
        this.metodoReserva = metodoReserva;
    }
    
    public void procesarReserva(){
        System.out.println("Datos " + vehiculo + metodoReserva);
    }
    
}
