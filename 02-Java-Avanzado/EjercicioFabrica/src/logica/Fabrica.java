package logica;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private List<String> listaTareas; // Lista de tareas
    private int numTarea; // Identificador de tarea
    private boolean isActive = true; // Variable que controla si la fábrica está activa o no

    
    
   public Fabrica() {
        listaTareas = new ArrayList<>();
        numTarea = 1; // Inicializa el ID de las llamadas
    }

    // Método sincronizado para recibir tareas
    public synchronized void recibirTarea() {
        String tarea = "Tarea " + numTarea;
        listaTareas.add(tarea);
        System.out.println("\n" + tarea + " ha sido recibida.");
        numTarea++;
        notifyAll(); // Notifica a los trabajadores de que hay una nueva tarea
    }
    
    // Método sincronizado para asignar una tarea a un trabajador
    public synchronized String asignarTarea() {
        while (listaTareas.isEmpty()) {
            try {
                wait(); // Espera si no hay tareas
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return listaTareas.remove(0); // Elimina de la lista la primera tarea y la devuelve
        
    }
    
        // Método para verificar si la fábrica está activa
    public synchronized boolean isActive() {
        return isActive;
    }

    // Método para cerrar la fabrica
    public synchronized void shutdown() {
        isActive = false; // Cambiar el estado a inactivo
        notifyAll(); // Notifica a los hilos en espera para que terminen
    }
    

    public List<String> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<String> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public int getNumTarea() {
        return numTarea;
    }

    public void setNumTarea(int numTarea) {
        this.numTarea = numTarea;
    }
    
    
    
}
