package com.example.movies.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "actors")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false, length = 100)
    String firstname;

    @Column(nullable = false, length = 100)
    String lastname;

    @ManyToMany(mappedBy = "actors")
    List<Movie> movies;

    @OneToMany(mappedBy = "director")
    List<Movie> director_movies;
    @OneToMany(mappedBy = "writer")
    List<Movie> writer_movies;

    ///@OneToMany(mappedBy = "director")
    ///private List <Movie> director_movies;
}