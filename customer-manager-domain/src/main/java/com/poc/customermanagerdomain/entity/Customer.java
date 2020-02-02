package com.poc.customermanagerdomain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Customer {

    @Id
    private UUID id;

    private String name;

    private String document;

    @OneToMany
    @JoinColumn(name = "customer_telephone_id")
    private List<Telephone> telephones;

    @OneToMany
    @JoinColumn(name = "customer_address_id")
    private List<Address> addresses;

    public Customer() {
    }

    public Customer(UUID id, String name, String document, List<Telephone> telephones, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.telephones = telephones;
        this.addresses = addresses;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(document, customer.document) &&
                Objects.equals(telephones, customer.telephones) &&
                Objects.equals(addresses, customer.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, document, telephones, addresses);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", telephones=" + telephones +
                ", addresses=" + addresses +
                '}';
    }
}
