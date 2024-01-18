package com.example.books;

import com.example.books.entity.Author;
import com.example.books.repository.AuthorRepository;
import com.example.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BooksApplication implements CommandLineRunner {

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//authorRepository.save(new Author("Leo", "Tolstoy"));
		//authorRepository.save(new Author("Alexander", "Pushkin"));
		List<Author> list = authorRepository.findAll();
		for (Author author: list ) {
			System.out.println(author.getFirstName()+" "+author.getLastName());
		}
	}
}
