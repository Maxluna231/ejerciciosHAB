
package persistencia;

import logica.Festival;
import logica.Horario;
import logica.Pelicula;
import logica.Sala;


public class ControladoraPersistencia {
    FestivalJpaController feJpa = new FestivalJpaController();
    HorarioJpaController horaJpa = new HorarioJpaController();
    PeliculaJpaController peliJpa = new PeliculaJpaController();
    SalaJpaController salaJpa = new SalaJpaController();
    
    public void crearFestival (Festival fes) {
        feJpa.create(fes);
    }
    
    public void crearHora (Horario hora) {
        horaJpa.create(hora);
    }    
    
    public void crearPelicula (Pelicula peli) {
        peliJpa.create(peli);
    }
    
    public void crearSala (Sala sal) {
        salaJpa.create(sal);
    }
}
