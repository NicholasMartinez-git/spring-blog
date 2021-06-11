package com.codeup.springblog.model;

import javax.persistence.*;

@Entity
@Table(name="pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column()
    private int age;

    @Column
    private String species;
}
