
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Torneo;
import persistencia.exceptions.NonexistentEntityException;


public class TorneoJpaController implements Serializable {
    
 public TorneoJpaController() {
        emf = Persistence.createEntityManagerFactory("proPU");
    }
    
    public TorneoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Torneo torneo) {
        if (torneo.getCategorias() == null) {
            torneo.setCategorias(new ArrayList<Categoria>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Categoria> attachedCategorias = new ArrayList<Categoria>();
            for (Categoria categoriasCategoriaToAttach : torneo.getCategorias()) {
                categoriasCategoriaToAttach = em.getReference(categoriasCategoriaToAttach.getClass(), categoriasCategoriaToAttach.getId());
                attachedCategorias.add(categoriasCategoriaToAttach);
            }
            torneo.setCategorias(attachedCategorias);
            em.persist(torneo);
            for (Categoria categoriasCategoria : torneo.getCategorias()) {
                Torneo oldTorneoOfCategoriasCategoria = categoriasCategoria.getTorneo();
                categoriasCategoria.setTorneo(torneo);
                categoriasCategoria = em.merge(categoriasCategoria);
                if (oldTorneoOfCategoriasCategoria != null) {
                    oldTorneoOfCategoriasCategoria.getCategorias().remove(categoriasCategoria);
                    oldTorneoOfCategoriasCategoria = em.merge(oldTorneoOfCategoriasCategoria);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Torneo torneo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Torneo persistentTorneo = em.find(Torneo.class, torneo.getId());
            List<Categoria> categoriasOld = persistentTorneo.getCategorias();
            List<Categoria> categoriasNew = torneo.getCategorias();
            List<Categoria> attachedCategoriasNew = new ArrayList<Categoria>();
            for (Categoria categoriasNewCategoriaToAttach : categoriasNew) {
                categoriasNewCategoriaToAttach = em.getReference(categoriasNewCategoriaToAttach.getClass(), categoriasNewCategoriaToAttach.getId());
                attachedCategoriasNew.add(categoriasNewCategoriaToAttach);
            }
            categoriasNew = attachedCategoriasNew;
            torneo.setCategorias(categoriasNew);
            torneo = em.merge(torneo);
            for (Categoria categoriasOldCategoria : categoriasOld) {
                if (!categoriasNew.contains(categoriasOldCategoria)) {
                    categoriasOldCategoria.setTorneo(null);
                    categoriasOldCategoria = em.merge(categoriasOldCategoria);
                }
            }
            for (Categoria categoriasNewCategoria : categoriasNew) {
                if (!categoriasOld.contains(categoriasNewCategoria)) {
                    Torneo oldTorneoOfCategoriasNewCategoria = categoriasNewCategoria.getTorneo();
                    categoriasNewCategoria.setTorneo(torneo);
                    categoriasNewCategoria = em.merge(categoriasNewCategoria);
                    if (oldTorneoOfCategoriasNewCategoria != null && !oldTorneoOfCategoriasNewCategoria.equals(torneo)) {
                        oldTorneoOfCategoriasNewCategoria.getCategorias().remove(categoriasNewCategoria);
                        oldTorneoOfCategoriasNewCategoria = em.merge(oldTorneoOfCategoriasNewCategoria);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = torneo.getId();
                if (findTorneo(id) == null) {
                    throw new NonexistentEntityException("The torneo with id " + id + " no longer exists.");
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
            Torneo torneo;
            try {
                torneo = em.getReference(Torneo.class, id);
                torneo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The torneo with id " + id + " no longer exists.", enfe);
            }
            List<Categoria> categorias = torneo.getCategorias();
            for (Categoria categoriasCategoria : categorias) {
                categoriasCategoria.setTorneo(null);
                categoriasCategoria = em.merge(categoriasCategoria);
            }
            em.remove(torneo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Torneo> findTorneoEntities() {
        return findTorneoEntities(true, -1, -1);
    }

    public List<Torneo> findTorneoEntities(int maxResults, int firstResult) {
        return findTorneoEntities(false, maxResults, firstResult);
    }

    private List<Torneo> findTorneoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Torneo.class));
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

    public Torneo findTorneo(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Torneo.class, id);
        } finally {
            em.close();
        }
    }

    public int getTorneoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Torneo> rt = cq.from(Torneo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
