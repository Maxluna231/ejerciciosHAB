
package ejerciciofrutas;

import java.util.Scanner;
import logica.Fruta;

public class EjercicioFrutas {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido al sistema de fruterias");
        
        Fruta frut = new Fruta();
        Scanner teclado = new Scanner(System.in);
        //cargar datos
        System.out.println("Ingrese los datos de la fruta que desea cargar");
        System.out.println("Ingrese el nombre de la fruta");
        frut.setNombre(teclado.nextLine());
        
        System.out.println("Ingrese el color de la fruta");
        frut.setColor(teclado.nextLine());
        
        System.out.println("Ingrese el tipo de cascara de la fruta");
        frut.setTipoCascara(teclado.nextLine());
        
        System.out.println("Ingrese las calorias de la fruta");
        teclado = new Scanner(System.in);
        frut.setCalorias(teclado.nextDouble());
        
        System.out.println("¿La fruta es comestible? ingrese Y si es asi, o n si es comestible");
        teclado = new Scanner(System.in);
        String opcion = teclado.next();
        
        if(opcion.equals("y")){
        frut.setEsComestible(true);
        }else{
        frut.setEsComestible(false);
        }
        //mostrar los datos
        if(frut.isEsComestible()==true){
        opcion = "Si";
        }else{
        opcion = "No";
        }
        
        System.out.println("La fruta cargada es: " + 
                "Nombre: "+ frut.getNombre()+ "Color: " +  frut.getColor() + "Tipo Cascara: " + frut.getTipoCascara()+
                "Calorias: " + frut.getCalorias() + "Es comestible?: " + opcion);
        
        System.out.println("Cambio a 25 calorias");
        frut.setCalorias(25);
        
        System.out.println("Datos despues de modificar");
        
        System.out.println(frut.toString());
    }
    
}
