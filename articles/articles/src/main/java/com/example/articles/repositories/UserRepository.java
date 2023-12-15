package com.example.articles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.articles.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
