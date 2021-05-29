package com.spring.jpa.model;

import javax.persistence.*;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Entity
@Table(name = "produit")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produit_id")
    private int id;

    @Column(name = "nom")
    private String name;

    @Column(name = "cout")
    private int cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
