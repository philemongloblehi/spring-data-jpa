package com.spring.jpa.model;

import javax.persistence.*;

/**
 * @author Philémon Globlehi <philemon.globlehi@gmail.com>
 */
@Entity
@Table(name = "commentaire")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="commentaire_id")
    private int id;

    @Column(name="contenu")
    private String content;

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
}
