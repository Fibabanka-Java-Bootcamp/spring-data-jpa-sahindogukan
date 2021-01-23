package com.hkarabakla.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private LocalDate createdAt;

    @OneToMany(mappedBy = "order")
    private Set<User> users;

    private double total;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", createdAt=" + createdAt +
                ", users=" + users +
                ", total=" + total +
                '}';
    }
}
