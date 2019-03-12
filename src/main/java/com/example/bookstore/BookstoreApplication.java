package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;
import com.example.bookstore.domain.Category;
import com.example.bookstore.domain.CategoryRepository;
import com.example.bookstore.domain.User;
import com.example.bookstore.domain.UserRepository;

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
	
	@Bean
	public CommandLineRunner demo2(UserRepository repository) {
		return (args) -> {
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			repository.save(user1);
			repository.save(user2);
		};
	}

}

