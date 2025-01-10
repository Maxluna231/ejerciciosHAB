
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Sala;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Festival;
import persistencia.exceptions.NonexistentEntityException;

public class FestivalJpaController implements Serializable {

      public FestivalJpaController() {
        emf = Persistence.createEntityManagerFactory("com.hackaboss_EjercicioN3_OneToMany_jar_1.0-SNAPSHOTPU");
    }
    
    
    
    public FestivalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Festival festival) {
        if (festival.getSalas() == null) {
            festival.setSalas(new ArrayList<Sala>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Sala> attachedSalas = new ArrayList<Sala>();
            for (Sala salasSalaToAttach : festival.getSalas()) {
                salasSalaToAttach = em.getReference(salasSalaToAttach.getClass(), salasSalaToAttach.getId());
                attachedSalas.add(salasSalaToAttach);
            }
            festival.setSalas(attachedSalas);
            em.persist(festival);
            for (Sala salasSala : festival.getSalas()) {
                Festival oldFestivalOfSalasSala = salasSala.getFestival();
                salasSala.setFestival(festival);
                salasSala = em.merge(salasSala);
                if (oldFestivalOfSalasSala != null) {
                    oldFestivalOfSalasSala.getSalas().remove(salasSala);
                    oldFestivalOfSalasSala = em.merge(oldFestivalOfSalasSala);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Festival festival) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Festival persistentFestival = em.find(Festival.class, festival.getId());
            List<Sala> salasOld = persistentFestival.getSalas();
            List<Sala> salasNew = festival.getSalas();
            List<Sala> attachedSalasNew = new ArrayList<Sala>();
            for (Sala salasNewSalaToAttach : salasNew) {
                salasNewSalaToAttach = em.getReference(salasNewSalaToAttach.getClass(), salasNewSalaToAttach.getId());
                attachedSalasNew.add(salasNewSalaToAttach);
            }
            salasNew = attachedSalasNew;
            festival.setSalas(salasNew);
            festival = em.merge(festival);
            for (Sala salasOldSala : salasOld) {
                if (!salasNew.contains(salasOldSala)) {
                    salasOldSala.setFestival(null);
                    salasOldSala = em.merge(salasOldSala);
                }
            }
            for (Sala salasNewSala : salasNew) {
                if (!salasOld.contains(salasNewSala)) {
                    Festival oldFestivalOfSalasNewSala = salasNewSala.getFestival();
                    salasNewSala.setFestival(festival);
                    salasNewSala = em.merge(salasNewSala);
                    if (oldFestivalOfSalasNewSala != null && !oldFestivalOfSalasNewSala.equals(festival)) {
                        oldFestivalOfSalasNewSala.getSalas().remove(salasNewSala);
                        oldFestivalOfSalasNewSala = em.merge(oldFestivalOfSalasNewSala);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = festival.getId();
                if (findFestival(id) == null) {
                    throw new NonexistentEntityException("The festival with id " + id + " no longer exists.");
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
            Festival festival;
            try {
                festival = em.getReference(Festival.class, id);
                festival.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The festival with id " + id + " no longer exists.", enfe);
            }
            List<Sala> salas = festival.getSalas();
            for (Sala salasSala : salas) {
                salasSala.setFestival(null);
                salasSala = em.merge(salasSala);
            }
            em.remove(festival);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Festival> findFestivalEntities() {
        return findFestivalEntities(true, -1, -1);
    }

    public List<Festival> findFestivalEntities(int maxResults, int firstResult) {
        return findFestivalEntities(false, maxResults, firstResult);
    }

    private List<Festival> findFestivalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Festival.class));
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

    public Festival findFestival(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Festival.class, id);
        } finally {
            em.close();
        }
    }

    public int getFestivalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Festival> rt = cq.from(Festival.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
