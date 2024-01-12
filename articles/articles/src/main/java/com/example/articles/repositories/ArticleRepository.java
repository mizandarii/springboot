package com.example.articles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.articles.entity.Article;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByTitle(String title);
    void deleteByTitle(String title);

    List<Article> findBySlug(String slug);
    void deleteBySlug(String slug);

    List<Article> findByUser(String users);

    List <Article> findByTag(String tag);

}
