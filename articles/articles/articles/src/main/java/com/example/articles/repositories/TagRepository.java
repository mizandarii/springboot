package com.example.articles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.articles.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
