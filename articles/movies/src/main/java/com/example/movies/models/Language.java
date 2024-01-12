package com.example.movies.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false, length = 50)
    String name;

    @ManyToMany(mappedBy = "language")
    List<Movie> movies;
}