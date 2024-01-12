package com.example.movies.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false, length = 100)
    String name;

    @ManyToMany(mappedBy = "genres")
    List<Movie> movies;
}
