package com.spring.jpa.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "categorie_produit",
            joinColumns = @JoinColumn(name = "categorie_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private final List<Product> products = new ArrayList<>();

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

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
        product.getCategories().add(this);
    }

    public void removeProduit(Product product) {
        products.remove(product);
        product.getCategories().remove(this);
    }

}
