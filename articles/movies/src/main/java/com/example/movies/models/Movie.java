package com.example.movies.models;


import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false, length = 100)
    String title;
    int year;
    LocalDate released;
    int runtime;
    @Column(length = 1000)
    String plot;
    String awards;
    @Column(length = 500)
    String poster;
    @Column(name="imdb_rating")
    float imdbRating;

   @ManyToMany
   @JoinTable(
            name = "genre_movie",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
   List<Genre> genres;

    @ManyToMany
    @JoinTable(
            name = "actor_movie",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    List<Person> actors;

    @ManyToMany
    @JoinTable(
            name = "language_movie",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    List<Language> languages;

    @ManyToMany
    @JoinTable(
            name = "country_movie",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "country_id")
    )
    List<Country> countries;

    @ManyToOne
    @JoinColumn(name = "director_id")
    Person director;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    Person writer;




    ///director="James Cameron" one to many
    ///writer="James Cameron" one to many

    ///actors="Leonardo DiCaprio, Kate Winslet, Billy Zane" many to many
    ///language="English, Swedish, Italian, French" many to many
    ///country="United States, Mexico" many to many


}
