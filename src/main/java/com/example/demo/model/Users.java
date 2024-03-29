package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table
public class Users {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;

    public Users(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Users() {

    }

    public Users(String name, String country) {
        this.name = name;
        this.country = country;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
