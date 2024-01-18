package com.example.books;

import com.example.books.entity.Book;
import com.example.books.repository.BookRepository;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testFindByTitle() {
        // Создаем тестовую сущность Book
        Book testBook = new Book();
        testBook.setTitle("Java. Spring Boot");

        // Сохраняем тестовую сущность в репозиторий
        bookRepository.save(testBook);

        // Вызываем метод findByTitle для поиска
        List<Book> foundBooks = bookRepository.findByTitle("Java. Spring Boot");

        // Проверяем результат
        assert !foundBooks.isEmpty();
        assert foundBooks.size() == 1;

        Book foundBook = foundBooks.get(0);
        assert foundBook.getTitle().equals("Java. Spring Boot");
    }
}
