
package persistencia;

import logica.Director;
import logica.Oficina;


public class ControladoraPersistencia {
    
    DirectorJpaController directorJpa = new DirectorJpaController();
    OficinaJpaController oficinaJpa = new OficinaJpaController();
    
    //Metodos CRUD
    //crear
    
    public void crearOficina(Oficina oficina) {
        oficinaJpa.create(oficina);
    }
    
    public void crearDirector(Director director) {
        directorJpa.create(director);
    }
    
    
    //borrar
    
    
    
    //leer
    
    
    
    
    //acrualizar
    
}
