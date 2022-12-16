package sit.int202.oldexam;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sit.int202.oldexam.entities.Customer;
import sit.int202.oldexam.repositories.CustomerRepository;

import java.util.Currency;
import java.util.List;

public class TestJPA {
    public static void main(String[] args) {
        List<Customer> customerList = CustomerRepository.findAll();
        customerList.forEach(customer -> System.out.println(customer));
    }
}
