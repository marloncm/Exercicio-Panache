package com.aula;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;


@Entity
public class Message extends PanacheEntity {


    @ManyToOne
    private User user;

    private String text;

}
