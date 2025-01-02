
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Producto;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    ProductoJpaController producJPA  = new ProductoJpaController();
    
    public void crearProducto(Producto p) {
      producJPA.create(p);
  }

      public void borrarPersona(Long id) {
         try {
          producJPA.destroy(id);
      } catch (NonexistentEntityException ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
  }

      public List<Producto> traerProducto () {
      return producJPA.findProductoEntities();
  }
    public void modificarProducto (Producto p) {
  
      try {
          producJPA.edit(p);
      } catch (Exception ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

      
}
