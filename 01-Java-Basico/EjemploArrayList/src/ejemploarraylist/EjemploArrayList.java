
package ejemploarraylist;

import java.util.ArrayList;
import logica.Fruta;

public class EjemploArrayList {

 
    public static void main(String[] args) {
       
       ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();
       
       Fruta fruta = new Fruta("Manzana", "Anaranjado", "Todo el año");
       listaFrutas.add(fruta);
       listaFrutas.add(new Fruta("Naranja","Anaranjado","Todo el año"));
       listaFrutas.add(new Fruta("Banana","Amarillo",""));
       listaFrutas.add(new Fruta("Sandia","Verde","Verano"));
       
       
       //Traer elemento de un indice en particular
       Fruta frut = listaFrutas.get(3);
       
       //Eliminar un elemento
       listaFrutas.add(new Fruta("Melon", "Azul","Verano"));
       
       listaFrutas.remove(4);
       
       //Obtener tamaño
       int tamanio = listaFrutas.size();
       
       //Recorrido Mediante indices
       for(int i=0; i<listaFrutas.size();i++){
        System.out.println("Fruta: " +listaFrutas.get(i).getNombre());
      }
       
       //Recorrer con el for each
       for(Fruta fru:listaFrutas) {
           System.out.println("fruta: " + fru.getNombre());
       }
       
    }
    
}
