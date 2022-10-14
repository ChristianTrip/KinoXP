package com.kinoxp.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="reservations")
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "reservation",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Seat> seats = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @CreationTimestamp
    LocalDateTime created;
    @UpdateTimestamp
    LocalDateTime edited;


    public Reservation(Customer customer, List<Seat> seats, Show show) {
        this.customer = customer;
        this.seats = seats;
        this.show = show;
    }

    public boolean reserveSeat(int row, int numbInRow){
        List<Seat> seatsInShow = this.show.getSeats();
        int size = seatsInShow.size();
        for (int i = 0; i < size; i++) {
            Seat seat = seatsInShow.get(i);
            if (!seat.isReserved()){
                if (seat.getRow() == row && seat.getNumbInRow() == numbInRow){
                    seat.setReserved(true);
                    this.seats.add(seat);
                    return true;
                }
            }
        }
        return false;
    }

}
