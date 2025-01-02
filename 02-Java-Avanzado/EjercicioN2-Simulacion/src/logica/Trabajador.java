
package logica;

public class Trabajador extends Thread {
    private String nombre;
    private Fabrica fabrica;

    public Trabajador(String nombre, Fabrica fabrica) {
        this.nombre = nombre;
        this.fabrica = fabrica;
    }
    
    @Override
    public void run() {
        while (fabrica.isActive()) {
        String tarea = fabrica.asignarTarea(); // Asigna una tarea
            
            System.out.println("\n" + nombre + " está atendiendo " + tarea);
            System.out.println("ensamblando productos");
            System.out.println("controlando productos");
            System.out.println("embalando productos");
            try {
                Thread.sleep(2000); // Simula el tiempo de las tareas
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nombre + " ha resuelto " + tarea);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }
    
    
    
}
