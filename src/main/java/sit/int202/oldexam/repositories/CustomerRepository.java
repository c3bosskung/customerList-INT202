package sit.int202.oldexam.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sit.int202.oldexam.entities.Customer;

import java.util.List;

public class CustomerRepository {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("classic-models");
    private static EntityManager em = emf.createEntityManager();

    public static List<Customer> findAll() {
        return em.createQuery("SELECT c FROM Customer c").getResultList();
    }
}
