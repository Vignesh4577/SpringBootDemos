package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappDatajpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappDatajpaApplication.class, args);
	}

	@Autowired
	IBookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Book book = new Book("first java","Kathy","Tech", 900);
		//bookService.addBook(book);
		
		//Book nbook = bookService.getById(100);
		//System.out.println(nbook);
		
		//nbook.setAuthor("king");
		//nbook.setPrice(999);
		//bookService.updateBook(nbook);
//		bookService.getByAuthor("king").forEach(System.out::println);
//		bookService.getByCatagery("Tech").forEach(System.out::println);
		bookService.getByPrice(1000).forEach(System.out::println);
		
		
//		Book book1 = new Book("second java","james","Tech", 5000);
//		Book book2 = new Book("sql",3,"Kathy","Techinfo", 400);
//		Book book3 = new Book("javascript",4,"Kathy","Tech", 200);
//		
		
//		bookService.addBook(book1);
//		bookService.addBook(book2);
//		bookService.addBook(book3);
		
		//bookService.getAll().forEach(System.out::println);
	}

}
