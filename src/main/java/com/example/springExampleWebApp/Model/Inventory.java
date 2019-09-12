package com.example.springExampleWebApp.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private BigInteger quantity;

    private String description;

    private BigInteger price;



    public Inventory(String name, BigInteger quantity, String description, BigInteger price) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }


}
