package ec.edu.utpl.carreras.computacion;

import ec.edu.utpl.carreras.computacion.model.Servicio;
import ec.edu.utpl.carreras.computacion.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();


        try (em) {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            //Crear un servicio
            Servicio servicioPerfilado = new Servicio("Perfilado barba express", "Perfilado barba en 10 minutos o menos.", 5, 10);
            em.persist(servicioPerfilado);
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JPAUtil.close();
        }
    }
}