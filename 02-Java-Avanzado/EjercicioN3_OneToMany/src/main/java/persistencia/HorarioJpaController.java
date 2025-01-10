
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Horario;
import logica.Pelicula;
import persistencia.exceptions.NonexistentEntityException;


public class HorarioJpaController implements Serializable {

     public HorarioJpaController() {
        emf = Persistence.createEntityManagerFactory("com.hackaboss_EjercicioN3_OneToMany_jar_1.0-SNAPSHOTPU");
    }
    
    
    public HorarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Horario horario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pelicula pelicula = horario.getPelicula();
            if (pelicula != null) {
                pelicula = em.getReference(pelicula.getClass(), pelicula.getSala());
                horario.setPelicula(pelicula);
            }
            em.persist(horario);
            if (pelicula != null) {
                Horario oldUnHorarioOfPelicula = pelicula.getUnHorario();
                if (oldUnHorarioOfPelicula != null) {
                    oldUnHorarioOfPelicula.setPelicula(null);
                    oldUnHorarioOfPelicula = em.merge(oldUnHorarioOfPelicula);
                }
                pelicula.setUnHorario(horario);
                pelicula = em.merge(pelicula);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Horario horario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Horario persistentHorario = em.find(Horario.class, horario.getId());
            Pelicula peliculaOld = persistentHorario.getPelicula();
            Pelicula peliculaNew = horario.getPelicula();
            if (peliculaNew != null) {
                peliculaNew = em.getReference(peliculaNew.getClass(), peliculaNew.getSala());
                horario.setPelicula(peliculaNew);
            }
            horario = em.merge(horario);
            if (peliculaOld != null && !peliculaOld.equals(peliculaNew)) {
                peliculaOld.setUnHorario(null);
                peliculaOld = em.merge(peliculaOld);
            }
            if (peliculaNew != null && !peliculaNew.equals(peliculaOld)) {
                Horario oldUnHorarioOfPelicula = peliculaNew.getUnHorario();
                if (oldUnHorarioOfPelicula != null) {
                    oldUnHorarioOfPelicula.setPelicula(null);
                    oldUnHorarioOfPelicula = em.merge(oldUnHorarioOfPelicula);
                }
                peliculaNew.setUnHorario(horario);
                peliculaNew = em.merge(peliculaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = horario.getId();
                if (findHorario(id) == null) {
                    throw new NonexistentEntityException("The horario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Horario horario;
            try {
                horario = em.getReference(Horario.class, id);
                horario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The horario with id " + id + " no longer exists.", enfe);
            }
            Pelicula pelicula = horario.getPelicula();
            if (pelicula != null) {
                pelicula.setUnHorario(null);
                pelicula = em.merge(pelicula);
            }
            em.remove(horario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Horario> findHorarioEntities() {
        return findHorarioEntities(true, -1, -1);
    }

    public List<Horario> findHorarioEntities(int maxResults, int firstResult) {
        return findHorarioEntities(false, maxResults, firstResult);
    }

    private List<Horario> findHorarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Horario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Horario findHorario(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Horario.class, id);
        } finally {
            em.close();
        }
    }

    public int getHorarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Horario> rt = cq.from(Horario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
