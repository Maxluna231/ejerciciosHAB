
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
import logica.Director;
import logica.Oficina;
import persistencia.exceptions.NonexistentEntityException;


public class DirectorJpaController implements Serializable {
    
    public DirectorJpaController() {
        emf = Persistence.createEntityManagerFactory("OficinaDirectorPU");
    }


    public DirectorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Director director) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Oficina oficina = director.getOficina();
            if (oficina != null) {
                oficina = em.getReference(oficina.getClass(), oficina.getNumOficina());
                director.setOficina(oficina);
            }
            em.persist(director);
            if (oficina != null) {
                Director oldUnDirectorOfOficina = oficina.getUnDirector();
                if (oldUnDirectorOfOficina != null) {
                    oldUnDirectorOfOficina.setOficina(null);
                    oldUnDirectorOfOficina = em.merge(oldUnDirectorOfOficina);
                }
                oficina.setUnDirector(director);
                oficina = em.merge(oficina);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Director director) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Director persistentDirector = em.find(Director.class, director.getId());
            Oficina oficinaOld = persistentDirector.getOficina();
            Oficina oficinaNew = director.getOficina();
            if (oficinaNew != null) {
                oficinaNew = em.getReference(oficinaNew.getClass(), oficinaNew.getNumOficina());
                director.setOficina(oficinaNew);
            }
            director = em.merge(director);
            if (oficinaOld != null && !oficinaOld.equals(oficinaNew)) {
                oficinaOld.setUnDirector(null);
                oficinaOld = em.merge(oficinaOld);
            }
            if (oficinaNew != null && !oficinaNew.equals(oficinaOld)) {
                Director oldUnDirectorOfOficina = oficinaNew.getUnDirector();
                if (oldUnDirectorOfOficina != null) {
                    oldUnDirectorOfOficina.setOficina(null);
                    oldUnDirectorOfOficina = em.merge(oldUnDirectorOfOficina);
                }
                oficinaNew.setUnDirector(director);
                oficinaNew = em.merge(oficinaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = director.getId();
                if (findDirector(id) == null) {
                    throw new NonexistentEntityException("The director with id " + id + " no longer exists.");
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
            Director director;
            try {
                director = em.getReference(Director.class, id);
                director.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The director with id " + id + " no longer exists.", enfe);
            }
            Oficina oficina = director.getOficina();
            if (oficina != null) {
                oficina.setUnDirector(null);
                oficina = em.merge(oficina);
            }
            em.remove(director);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Director> findDirectorEntities() {
        return findDirectorEntities(true, -1, -1);
    }

    public List<Director> findDirectorEntities(int maxResults, int firstResult) {
        return findDirectorEntities(false, maxResults, firstResult);
    }

    private List<Director> findDirectorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Director.class));
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

    public Director findDirector(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Director.class, id);
        } finally {
            em.close();
        }
    }

    public int getDirectorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Director> rt = cq.from(Director.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
