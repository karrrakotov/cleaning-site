package com.happy.cleaning.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Responses {
    public Responses(String name, String surname, String zaptel, String address, String getTitle, String getPrice) {
        this.name = name;
        this.surname = surname;
        this.zaptel = zaptel;
        this.address = address;
        this.getTitle = getTitle;
        this.getPrice = getPrice;
    }

    public Responses() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, surname, zaptel, address, getTitle, getPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getZaptel() {
        return zaptel;
    }

    public void setZaptel(String zaptel) {
        this.zaptel = zaptel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGetTitle() {
        return getTitle;
    }

    public void setGetTitle(String getTitle) {
        this.getTitle = getTitle;
    }

    public String getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(String getPrice) {
        this.getPrice = getPrice;
    }
}
