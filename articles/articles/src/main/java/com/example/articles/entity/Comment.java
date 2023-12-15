package com.example.articles.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comments")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 500)
    private String content;

    @Column(nullable = false, length = 10)
    private Date dateCreated;

    /*
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
    */
    @OneToMany(mappedBy = "comment")
    private List<Users> users;



}