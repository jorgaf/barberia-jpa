package ec.edu.utpl.carreras.computacion;

import ec.edu.utpl.carreras.computacion.model.Barbero;
import ec.edu.utpl.carreras.computacion.model.Cita;
import ec.edu.utpl.carreras.computacion.model.Cliente;
import ec.edu.utpl.carreras.computacion.model.Servicio;
import ec.edu.utpl.carreras.computacion.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        //Buscar un cliente por ID
        TypedQuery<Cliente> queryCliente = em.createNamedQuery("Cliente.getById", Cliente.class);
        queryCliente.setParameter("id_cliente", 1);
        var cliente = queryCliente.getSingleResult();

        //Buscar barbero
        TypedQuery<Barbero> queryBarbero = em.createNamedQuery("Barbero.getById", Barbero.class);
        queryBarbero.setParameter("id_barbero", 1);
        var barbero = queryBarbero.getSingleResult();

        //Buscar servicio
        TypedQuery<Servicio> queryServicio = em.createNamedQuery("Servicio.getById", Servicio.class);
        queryServicio.setParameter("id_servicio", 2);
        var servicio = queryServicio.getSingleResult();


        try (em) {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            //Crear cita
            Cita newCita = new Cita(LocalDateTime.now(), cliente, barbero, servicio, "Reserva", "No usar alcohol");
            em.persist(newCita);
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JPAUtil.close();
        }
    }
}