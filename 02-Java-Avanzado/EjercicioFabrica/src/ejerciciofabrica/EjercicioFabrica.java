package ejerciciofabrica;

import logica.Fabrica;
import logica.Trabajador;


public class EjercicioFabrica {

 
    public static void main(String[] args) {
        //Creo una nueva "Fábrica" para usar como controladora de tareas
        Fabrica fabrica = new Fabrica();
        
        // Creo 3 trabajadores y hago que los 3 estén en la misma fábrica
        Trabajador trab1 = new Trabajador("Trabajador 1", fabrica);
        Trabajador trab2 = new Trabajador("Trabajador 2", fabrica);
        Trabajador trab3 = new Trabajador("Trabajador 3", fabrica);
        
        // Iniciar los hilos de los trabajadores
        //los trabajadores quedan a la espera de recibir una tarea
        trab1.start();
        trab2.start();
        trab3.start();
        
        //Empezamos a simular 10 tareas con un for llamando al método recibirTarea de la fábrica
        for (int i=0; i<10;i++) {
            fabrica.recibirTarea();
            try {
                //podemos simular un tiempo aprox entre llamada y llamada para probar
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
    }


        
    }
    
}
