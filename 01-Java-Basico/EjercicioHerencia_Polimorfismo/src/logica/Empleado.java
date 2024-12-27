package logica;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Métodos abstractos
    public abstract double calcularSalario();

    public abstract String getDescripcion();
}