package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;
import com.example.bookstore.domain.Category;
import com.example.bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	Category category = new Category("Testi");
	
	@Bean
	public CommandLineRunner demo(CategoryRepository repository) {
		return (args) -> {
			repository.save(category);
		};
	}
	
	@Bean
	public CommandLineRunner demo1(BookRepository repository) {
		return (args) -> {
			Book book = new Book(category, "Testi", "Testi", "123456789", 25.00, 2010);
			repository.save(book);
		};
	}

}

