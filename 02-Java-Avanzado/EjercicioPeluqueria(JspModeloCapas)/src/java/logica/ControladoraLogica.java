
package logica;


public class ControladoraLogica {
     public void crearStock(String codigo_Insumo, String nombre,String cantidad, String fechaCaducidad){
        Stock stock = new Stock(codigo_Insumo,nombre,cantidad,fechaCaducidad);
        this.mostrarStock(stock);
       }
    
    public void mostrarStock(Stock stock){
        stock.toString();
      }
}
