package com.kinoxp.entities;

import com.sun.xml.bind.v2.TODO;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//---------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
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
    //---------------Fields / attributter.

    //TODO vi skal lige have afklaret om de skal være her eller i Reservation.
    @CreationTimestamp
    LocalDateTime created;
    @UpdateTimestamp
    LocalDateTime edited;


    //---------------Reservation class.
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    List<Reservation> reservations = new ArrayList<>();

    public void addReservation(Reservation reservation){
        reservations.add(reservation);
        //reservation.setMovie(this);
    }
    //---------------Reservation class.


    //---------------Constructor. Vi skal have en fordi vi bruger DTO klasser.
    public Customer(int id, String name, String phone, String email, LocalDateTime created, LocalDateTime edited) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.created = created;
        this.edited = edited;
    }
    //---------------Constructor.

    //---------------Constructor.
    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    //---------------Constructor.
}