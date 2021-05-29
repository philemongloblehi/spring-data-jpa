package com.spring.jpa.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * @author Philémon Globlehi <philemon.globlehi@gmail.com>
 */
@Entity
@Table(name = "commentaire")
@DynamicUpdate
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="commentaire_id")
    private int id;

    @Column(name="contenu")
    private String content;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "produit_id")
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
