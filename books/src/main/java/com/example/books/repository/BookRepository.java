package com.example.books.repository;

import com.example.books.entity.Book;
import com.example.books.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Найти все книги по заданному языку
    List<Book> findByLanguage(Language language);

    // Найти все книги с заданным заголовком
    List<Book> findByTitle(String title);

    // Удалить все книги с заданным заголовком
    void deleteByTitle(String title);

    // Найти все книги с заданным заголовком и языком
    List<Book> findByTitleAndLanguage(String title, Language language);

    // Найти все книги с заданным заголовком или языком
    List<Book> findByTitleOrLanguage(String title, Language language);

    // Найти все книги с заданным заголовком, игнорируя регистр букв
    List<Book> findByTitleIgnoreCase(String title);

    // Найти все книги и отсортировать их по заголовку
    List<Book> findAllByOrderByTitle();

    // Найти все книги по ключевому слову в заголовке
    @Query("SELECT b FROM Book b WHERE b.title LIKE %:keyword%")
    List<Book> searchByKeyword(@Param("keyword") String keyword);
}
