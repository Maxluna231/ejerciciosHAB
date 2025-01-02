/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import logica.Carro;
import logica.Propietario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Luisina
 */
public class PropietarioJpaController implements Serializable {

       public PropietarioJpaController() {
        emf = Persistence.createEntityManagerFactory("CarroPropietarioPU");
    }
    
    public PropietarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Propietario propietario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carro carro = propietario.getCarro();
            if (carro != null) {
                carro = em.getReference(carro.getClass(), carro.getNum_motor());
                propietario.setCarro(carro);
            }
            em.persist(propietario);
            if (carro != null) {
                Propietario oldUnPropietarioOfCarro = carro.getUnPropietario();
                if (oldUnPropietarioOfCarro != null) {
                    oldUnPropietarioOfCarro.setCarro(null);
                    oldUnPropietarioOfCarro = em.merge(oldUnPropietarioOfCarro);
                }
                carro.setUnPropietario(propietario);
                carro = em.merge(carro);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Propietario propietario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Propietario persistentPropietario = em.find(Propietario.class, propietario.getId());
            Carro carroOld = persistentPropietario.getCarro();
            Carro carroNew = propietario.getCarro();
            if (carroNew != null) {
                carroNew = em.getReference(carroNew.getClass(), carroNew.getNum_motor());
                propietario.setCarro(carroNew);
            }
            propietario = em.merge(propietario);
            if (carroOld != null && !carroOld.equals(carroNew)) {
                carroOld.setUnPropietario(null);
                carroOld = em.merge(carroOld);
            }
            if (carroNew != null && !carroNew.equals(carroOld)) {
                Propietario oldUnPropietarioOfCarro = carroNew.getUnPropietario();
                if (oldUnPropietarioOfCarro != null) {
                    oldUnPropietarioOfCarro.setCarro(null);
                    oldUnPropietarioOfCarro = em.merge(oldUnPropietarioOfCarro);
                }
                carroNew.setUnPropietario(propietario);
                carroNew = em.merge(carroNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = propietario.getId();
                if (findPropietario(id) == null) {
                    throw new NonexistentEntityException("The propietario with id " + id + " no longer exists.");
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
            Propietario propietario;
            try {
                propietario = em.getReference(Propietario.class, id);
                propietario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The propietario with id " + id + " no longer exists.", enfe);
            }
            Carro carro = propietario.getCarro();
            if (carro != null) {
                carro.setUnPropietario(null);
                carro = em.merge(carro);
            }
            em.remove(propietario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Propietario> findPropietarioEntities() {
        return findPropietarioEntities(true, -1, -1);
    }

    public List<Propietario> findPropietarioEntities(int maxResults, int firstResult) {
        return findPropietarioEntities(false, maxResults, firstResult);
    }

    private List<Propietario> findPropietarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Propietario.class));
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

    public Propietario findPropietario(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Propietario.class, id);
        } finally {
            em.close();
        }
    }

    public int getPropietarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Propietario> rt = cq.from(Propietario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
