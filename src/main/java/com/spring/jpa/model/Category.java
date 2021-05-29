package com.spring.jpa.model;

import javax.persistence.*;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Entity
@Table(name = "categorie")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="categorie_id")
    private int id;

    @Column(name="nom")
    private String name;

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
}
