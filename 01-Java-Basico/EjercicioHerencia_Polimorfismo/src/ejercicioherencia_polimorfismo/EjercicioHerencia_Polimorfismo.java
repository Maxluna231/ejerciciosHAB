
package ejercicioherencia_polimorfismo;

import logica.Empleado;
import logica.EmpleadoDependencia;
import logica.EmpleadoPorHora;



public class EjercicioHerencia_Polimorfismo {

    public static void main(String[] args) {
           // Crear un vector de empleados
        Empleado[] empleados = new Empleado[5];
        
        empleados[0] = new EmpleadoDependencia(200, "Juan", 100);
        empleados[1] = new EmpleadoPorHora("Mauri", 300, 6, 80);
        empleados[2] = new EmpleadoDependencia(10, "Rosa", 1200);
        empleados[3] = new EmpleadoPorHora("Ana Diaz", 400, 30, 21);
        empleados[4] = new EmpleadoDependencia(10, "Rosa", 1200);

       
        for (Empleado empleado : empleados) {  
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: $" + empleado.calcularSalario());
            System.out.println("Descripción: " + empleado.getDescripcion());
            System.out.println("-----------------------------");
        }
    }
    
}
