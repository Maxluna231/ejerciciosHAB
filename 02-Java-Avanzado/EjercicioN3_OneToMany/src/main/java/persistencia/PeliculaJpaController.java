
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
import logica.Sala;
import persistencia.exceptions.NonexistentEntityException;


public class PeliculaJpaController implements Serializable {

     public PeliculaJpaController() {
        emf = Persistence.createEntityManagerFactory("com.hackaboss_EjercicioN3_OneToMany_jar_1.0-SNAPSHOTPU");
    }
    
    
    public PeliculaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pelicula pelicula) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Horario unHorario = pelicula.getUnHorario();
            if (unHorario != null) {
                unHorario = em.getReference(unHorario.getClass(), unHorario.getId());
                pelicula.setUnHorario(unHorario);
            }
            em.persist(pelicula);
            if (unHorario != null) {
                Pelicula oldPeliculaOfUnHorario = unHorario.getPelicula();
                if (oldPeliculaOfUnHorario != null) {
                    oldPeliculaOfUnHorario.setUnHorario(null);
                    oldPeliculaOfUnHorario = em.merge(oldPeliculaOfUnHorario);
                }
                unHorario.setPelicula(pelicula);
                unHorario = em.merge(unHorario);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pelicula pelicula) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pelicula persistentPelicula = em.find(Pelicula.class, pelicula.getSala());
            Horario unHorarioOld = persistentPelicula.getUnHorario();
            Horario unHorarioNew = pelicula.getUnHorario();
            if (unHorarioNew != null) {
                unHorarioNew = em.getReference(unHorarioNew.getClass(), unHorarioNew.getId());
                pelicula.setUnHorario(unHorarioNew);
            }
            pelicula = em.merge(pelicula);
            if (unHorarioOld != null && !unHorarioOld.equals(unHorarioNew)) {
                unHorarioOld.setPelicula(null);
                unHorarioOld = em.merge(unHorarioOld);
            }
            if (unHorarioNew != null && !unHorarioNew.equals(unHorarioOld)) {
                Pelicula oldPeliculaOfUnHorario = unHorarioNew.getPelicula();
                if (oldPeliculaOfUnHorario != null) {
                    oldPeliculaOfUnHorario.setUnHorario(null);
                    oldPeliculaOfUnHorario = em.merge(oldPeliculaOfUnHorario);
                }
                unHorarioNew.setPelicula(pelicula);
                unHorarioNew = em.merge(unHorarioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Sala id = pelicula.getSala();
                if (findPelicula(id) == null) {
                    throw new NonexistentEntityException("The pelicula with id " + id + " no longer exists.");
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
            Pelicula pelicula;
            try {
                pelicula = em.getReference(Pelicula.class, id);
                pelicula.getSala();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pelicula with id " + id + " no longer exists.", enfe);
            }
            Horario unHorario = pelicula.getUnHorario();
            if (unHorario != null) {
                unHorario.setPelicula(null);
                unHorario = em.merge(unHorario);
            }
            em.remove(pelicula);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Sala id) throws NonexistentEntityException {
        destroy(id.getId());
    }

    public List<Pelicula> findPeliculaEntities() {
        return findPeliculaEntities(true, -1, -1);
    }

    public List<Pelicula> findPeliculaEntities(int maxResults, int firstResult) {
        return findPeliculaEntities(false, maxResults, firstResult);
    }

    private List<Pelicula> findPeliculaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pelicula.class));
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

    public Pelicula findPelicula(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pelicula.class, id);
        } finally {
            em.close();
        }
    }

    public Pelicula findPelicula(Sala id) {
        return findPelicula(id.getId());
    }

    public int getPeliculaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pelicula> rt = cq.from(Pelicula.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
