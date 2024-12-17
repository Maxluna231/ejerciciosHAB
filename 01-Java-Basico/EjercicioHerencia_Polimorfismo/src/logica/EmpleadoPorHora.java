
package logica;

public class EmpleadoPorHora extends Empleado{
     private int horasTrabajadas;
    private double tarifaPorHora;

    // Constructor
    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Getters y setters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    // Sobrescribir calcularSalario
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    // Sobrescribir getDescripcion
    @Override
    public String getDescripcion() {
        return "Empleado por hora. Tarifa por hora: $" + tarifaPorHora;
    }
}
