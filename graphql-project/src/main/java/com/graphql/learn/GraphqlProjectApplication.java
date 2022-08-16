package com.graphql.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.learn.entity.Book;
import com.graphql.learn.entity.service.BookService;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner{

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book b1 = new Book();
		b1.setName("Java Complete Reference");
		b1.setDescription("Java book");
		b1.setPrice(5000);
		b1.setPages(850);
		b1.setAuthor("Manish");
		Book b2 = new Book();
		b2.setName("Python Complete Reference");
		b2.setDescription("Pyton book");
		b2.setPrice(6000);
		b2.setPages(700);
		b2.setAuthor("Mukul");
		Book b3 = new Book();
		b3.setName("Salesforce Complete Reference");
		b3.setDescription("Salesforce book");
		b3.setPrice(7000);
		b3.setPages(1000);
		b3.setAuthor("digvijay");
		
		bookService.createBook(b1);
		bookService.createBook(b2);
		bookService.createBook(b3);

		
	}

}
