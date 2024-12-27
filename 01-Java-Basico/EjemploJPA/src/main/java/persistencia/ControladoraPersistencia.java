
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    PersonaJpaController persoJpa = new PersonaJpaController();
    
    public void crearPersona(Persona perso){
    persoJpa.create(perso);
    }
    
     public void borrarPersona(Long id) {
      try {
          persoJpa.destroy(id);
      } catch (NonexistentEntityException ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
   public List<Persona> traerPersonas () {
      return persoJpa.findPersonaEntities();
  }
  
public void modificarPersona (Persona pers) {
  
      try {
          persoJpa.edit(pers);
      } catch (Exception ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

   
   
      
    }
