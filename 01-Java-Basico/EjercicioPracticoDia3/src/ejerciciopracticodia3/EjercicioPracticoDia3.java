
package ejerciciopracticodia3;

import logica.Electrodomestico;



public class EjercicioPracticoDia3 {

  
    public static void main(String[] args) {
  
        System.out.println("Bievenido al sistema Electrodomesticos:3");
        Electrodomestico electro  = new Electrodomestico(0,"Hisense " , "xr342 ", 20, "gris ");
        Electrodomestico electro1 = new Electrodomestico(2,"Samsung ","yfe357 ",300 , "blanco ");
        Electrodomestico electro2 = new Electrodomestico(345, "Whirpool ","ahf456 " , 45, "negro ");
        
        System.out.println("Electrodomestico  1 " +"\n" + "Marca: " + electro.getMarca() + "Modelo: " + electro.getModelo() + "Consumo: " + electro.getConsumo());
        System.out.println("Electrodomestico  2 " +"\n" + "Marca: " + electro1.getMarca() + "Modelo: " + electro1.getModelo() + "Consumo: " + electro1.getConsumo());
        System.out.println("Electrodomestico  3 " +"\n" + "Marca: " + electro2.getMarca() + "Modelo: " + electro2.getModelo() + "Consumo: " + electro2.getConsumo());
    }
    
}
