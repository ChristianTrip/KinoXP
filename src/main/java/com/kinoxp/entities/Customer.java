package com.kinoxp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

//---------------Lombok.
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
//---------------Lombok.

@Entity //--Et object som vi skal burger i DB-tabel. Fortæller Der skal laves en table af samme navn some object.
public class Customer {

    //---------------Fields / attributter.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_Id", nullable = false)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String phone;

    @Column(length =  50, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 50, nullable = false)
    private String city;

    @Column(length = 50, nullable = false)
    private String postalCode;

    @CreationTimestamp
    LocalDateTime created;

    @UpdateTimestamp
    LocalDateTime edited;
    //---------------Fields / attributter.



    //---------------Constructor. Vi skal have en fordi vi bruger DTO klasser.
    public Customer(int id, String name, String phone, String email, String address, String city, String postalCode, LocalDateTime created, LocalDateTime edited) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.created = created;
        this.edited = edited;
    }
    //---------------Constructor.


}