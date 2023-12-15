package com.example.articles.repositories;

import com.example.articles.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.articles.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>  {
    List<Comment> findByUser(Users users);


}
