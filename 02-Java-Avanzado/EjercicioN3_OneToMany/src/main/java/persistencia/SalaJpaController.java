
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Festival;
import logica.Pelicula;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Sala;
import persistencia.exceptions.NonexistentEntityException;


public class SalaJpaController implements Serializable {

     public SalaJpaController() {
        emf = Persistence.createEntityManagerFactory("com.hackaboss_EjercicioN3_OneToMany_jar_1.0-SNAPSHOTPU");
    }
    
    
    public SalaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sala sala) {
        if (sala.getListaPeliculas() == null) {
            sala.setListaPeliculas(new ArrayList<Pelicula>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Festival festival = sala.getFestival();
            if (festival != null) {
                festival = em.getReference(festival.getClass(), festival.getId());
                sala.setFestival(festival);
            }
            List<Pelicula> attachedListaPeliculas = new ArrayList<Pelicula>();
            for (Pelicula listaPeliculasPeliculaToAttach : sala.getListaPeliculas()) {
                listaPeliculasPeliculaToAttach = em.getReference(listaPeliculasPeliculaToAttach.getClass(), listaPeliculasPeliculaToAttach.getSala());
                attachedListaPeliculas.add(listaPeliculasPeliculaToAttach);
            }
            sala.setListaPeliculas(attachedListaPeliculas);
            em.persist(sala);
            if (festival != null) {
                festival.getSalas().add(sala);
                festival = em.merge(festival);
            }
            for (Pelicula listaPeliculasPelicula : sala.getListaPeliculas()) {
                Sala oldSalaOfListaPeliculasPelicula = listaPeliculasPelicula.getSala();
                listaPeliculasPelicula.setSala(sala);
                listaPeliculasPelicula = em.merge(listaPeliculasPelicula);
                if (oldSalaOfListaPeliculasPelicula != null) {
                    oldSalaOfListaPeliculasPelicula.getListaPeliculas().remove(listaPeliculasPelicula);
                    oldSalaOfListaPeliculasPelicula = em.merge(oldSalaOfListaPeliculasPelicula);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sala sala) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sala persistentSala = em.find(Sala.class, sala.getId());
            Festival festivalOld = persistentSala.getFestival();
            Festival festivalNew = sala.getFestival();
            List<Pelicula> listaPeliculasOld = persistentSala.getListaPeliculas();
            List<Pelicula> listaPeliculasNew = sala.getListaPeliculas();
            if (festivalNew != null) {
                festivalNew = em.getReference(festivalNew.getClass(), festivalNew.getId());
                sala.setFestival(festivalNew);
            }
            List<Pelicula> attachedListaPeliculasNew = new ArrayList<Pelicula>();
            for (Pelicula listaPeliculasNewPeliculaToAttach : listaPeliculasNew) {
                listaPeliculasNewPeliculaToAttach = em.getReference(listaPeliculasNewPeliculaToAttach.getClass(), listaPeliculasNewPeliculaToAttach.getSala());
                attachedListaPeliculasNew.add(listaPeliculasNewPeliculaToAttach);
            }
            listaPeliculasNew = attachedListaPeliculasNew;
            sala.setListaPeliculas(listaPeliculasNew);
            sala = em.merge(sala);
            if (festivalOld != null && !festivalOld.equals(festivalNew)) {
                festivalOld.getSalas().remove(sala);
                festivalOld = em.merge(festivalOld);
            }
            if (festivalNew != null && !festivalNew.equals(festivalOld)) {
                festivalNew.getSalas().add(sala);
                festivalNew = em.merge(festivalNew);
            }
            for (Pelicula listaPeliculasOldPelicula : listaPeliculasOld) {
                if (!listaPeliculasNew.contains(listaPeliculasOldPelicula)) {
                    listaPeliculasOldPelicula.setSala(null);
                    listaPeliculasOldPelicula = em.merge(listaPeliculasOldPelicula);
                }
            }
            for (Pelicula listaPeliculasNewPelicula : listaPeliculasNew) {
                if (!listaPeliculasOld.contains(listaPeliculasNewPelicula)) {
                    Sala oldSalaOfListaPeliculasNewPelicula = listaPeliculasNewPelicula.getSala();
                    listaPeliculasNewPelicula.setSala(sala);
                    listaPeliculasNewPelicula = em.merge(listaPeliculasNewPelicula);
                    if (oldSalaOfListaPeliculasNewPelicula != null && !oldSalaOfListaPeliculasNewPelicula.equals(sala)) {
                        oldSalaOfListaPeliculasNewPelicula.getListaPeliculas().remove(listaPeliculasNewPelicula);
                        oldSalaOfListaPeliculasNewPelicula = em.merge(oldSalaOfListaPeliculasNewPelicula);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = sala.getId();
                if (findSala(id) == null) {
                    throw new NonexistentEntityException("The sala with id " + id + " no longer exists.");
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
            Sala sala;
            try {
                sala = em.getReference(Sala.class, id);
                sala.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sala with id " + id + " no longer exists.", enfe);
            }
            Festival festival = sala.getFestival();
            if (festival != null) {
                festival.getSalas().remove(sala);
                festival = em.merge(festival);
            }
            List<Pelicula> listaPeliculas = sala.getListaPeliculas();
            for (Pelicula listaPeliculasPelicula : listaPeliculas) {
                listaPeliculasPelicula.setSala(null);
                listaPeliculasPelicula = em.merge(listaPeliculasPelicula);
            }
            em.remove(sala);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sala> findSalaEntities() {
        return findSalaEntities(true, -1, -1);
    }

    public List<Sala> findSalaEntities(int maxResults, int firstResult) {
        return findSalaEntities(false, maxResults, firstResult);
    }

    private List<Sala> findSalaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sala.class));
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

    public Sala findSala(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sala.class, id);
        } finally {
            em.close();
        }
    }

    public int getSalaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sala> rt = cq.from(Sala.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
