
package logica;

public abstract class Animal {
    String nombre;
    String color;
    
    //No suelen tener constructores
    //Por que no se busca que se INSTANCIE en la clase
    
    //Metodo implementado
     public Animal() {
    }
     
    protected Animal(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    public void HolaAnimal() {
        System.out.println("Hola soy un animalL: " + nombre );
    }
    
    //Metodos abstractos
    public abstract void comer();
    public abstract void hacerSonido();
}
