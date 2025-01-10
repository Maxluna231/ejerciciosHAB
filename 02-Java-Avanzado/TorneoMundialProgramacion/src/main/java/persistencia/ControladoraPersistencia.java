
package persistencia;

import logica.Categoria;
import logica.Inscripcion;
import logica.Programador;
import logica.Torneo;


public class ControladoraPersistencia {
    CategoriaJpaController categJpa = new CategoriaJpaController();
    InscripcionJpaController inscripJpa = new InscripcionJpaController();
    ProgramadorJpaController progJpa = new ProgramadorJpaController();
    TorneoJpaController torneoJpa = new TorneoJpaController();
    
    public void crearCategoria (Categoria cate) {
        categJpa.create(cate);
    }
    
    public void crearInscripcion (Inscripcion insc) {
        inscripJpa.create(insc);
    }    
    
    public void crearProgramador (Programador prog) {
        progJpa.create(prog);
    }
    
    public void crearTorneo (Torneo tor) {
        torneoJpa.create(tor);
    }
}
