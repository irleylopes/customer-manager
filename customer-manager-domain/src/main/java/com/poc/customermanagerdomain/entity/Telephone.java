package com.poc.customermanagerdomain.entity;

import com.poc.customermanagerdomain.entity.enums.TelephoneType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Telephone {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "customer_telephone_id")
    private Customer customer;

    private TelephoneType type;

    private String number;

    public Telephone() {
    }

    public Telephone(UUID id, Customer customer, TelephoneType type, String number) {
        this.id = id;
        this.customer = customer;
        this.type = type;
        this.number = number;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TelephoneType getType() {
        return type;
    }

    public void setType(TelephoneType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return Objects.equals(id, telephone.id) &&
                Objects.equals(customer, telephone.customer) &&
                type == telephone.type &&
                Objects.equals(number, telephone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, type, number);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "id=" + id +
                ", customer=" + customer +
                ", type=" + type +
                ", number='" + number + '\'' +
                '}';
    }
}
