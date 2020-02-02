package com.poc.customermanagerdomain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Address {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "customer_address_id")
    private Customer customer;

    private String street;

    private String number;

    private String apartment;

    private String complement;

    private String zipCode;

    private String district;

    private String city;

    public Address() {
    }

    public Address(UUID id, Customer customer, String street, String number, String apartment, String complement, String zipCode, String district, String city) {
        this.id = id;
        this.customer = customer;
        this.street = street;
        this.number = number;
        this.apartment = apartment;
        this.complement = complement;
        this.zipCode = zipCode;
        this.district = district;
        this.city = city;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) &&
                Objects.equals(customer, address.customer) &&
                Objects.equals(street, address.street) &&
                Objects.equals(number, address.number) &&
                Objects.equals(apartment, address.apartment) &&
                Objects.equals(complement, address.complement) &&
                Objects.equals(zipCode, address.zipCode) &&
                Objects.equals(district, address.district) &&
                Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, street, number, apartment, complement, zipCode, district, city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", customer=" + customer +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", apartment='" + apartment + '\'' +
                ", complement='" + complement + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
