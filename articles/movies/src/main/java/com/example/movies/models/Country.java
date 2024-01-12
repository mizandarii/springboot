package com.example.movies.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false, length = 100)
    String name;

    @ManyToMany(mappedBy = "country")
    List<Movie> movies;
}