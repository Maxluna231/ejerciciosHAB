
package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearEmpleado (String nombre, String apellido, String domicilio, String telefono) {
    
        Empleado emple = new Empleado (nombre,apellido,domicilio,telefono); 
        this.mostrarEmpleado(emple);
    }
    
    public void mostrarEmpleado(Empleado emple) {
        emple.toString();
    }
    
    public List<Empleado> traerEmpleados () {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Juan", "Perez", "hola 123", "135496874"));
        listaEmpleados.add(new Empleado("José", "del monde", "hola 2345", "789789"));
        listaEmpleados.add(new Empleado("Delfina", "del Mar", "hola 978", "5555"));
        return listaEmpleados;
      }
    }
