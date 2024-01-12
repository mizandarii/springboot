package com.example.articles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.articles.entity.Users;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findByUser (String username);
}
