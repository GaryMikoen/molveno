package com.molvenolakeresort.models.hotel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Hotel_Address")
@Table(name="hoteladdress")
public class Address {

    @Id
    @GeneratedValue
    private long id;
    private String country;
    private String postalCode;
    private String street;
    private int number;
    private String numberextension;
    private String city;

    public Address() {
    }

    public long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumberextension() {
        return numberextension;
    }

    public void setNumberextension(String numberextension) {
        this.numberextension = numberextension;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

