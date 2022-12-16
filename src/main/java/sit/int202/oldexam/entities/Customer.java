package sit.int202.oldexam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString(of = {"customerNumber", "customerName", "city", "country", "phone"})

@Entity
@Table(name = "customers")

public class Customer {
    @Id
    private int customerNumber;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
//    private int salesRepEmployeeNumber;
    private double creditLimit;
    private String password;
    private String role;
}
