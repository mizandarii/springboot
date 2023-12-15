package com.example.articles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.articles.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
