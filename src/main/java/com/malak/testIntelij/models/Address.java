package com.malak.testIntelij.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Address {

    @Id
    @GeneratedValue
    private Integer id;

    private String rue;

}