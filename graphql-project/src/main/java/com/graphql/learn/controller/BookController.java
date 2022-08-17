package com.graphql.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graphql.learn.dto.BookInput;
import com.graphql.learn.entity.Book;
import com.graphql.learn.entity.service.BookService;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@MutationMapping("createBook")
	public Book createBook(@Argument BookInput book)
	{
		System.out.println("book in 1st : "+book + "\n");
		Book b = new Book();
		b.setName(book.getName());
		b.setAuthor(book.getAuthor());
		b.setDescription(book.getDescription());
		b.setPages(book.getPages());
		b.setPrice(book.getPrice());
		return bookService.createBook(b);
		
	}
	
	@QueryMapping("getAllBooks")
	public List<Book> getAllBooks()
	{
		return bookService.getAll();
	}
	
	@QueryMapping("getBook")
	public Book getBook(@Argument int bookId)
	{
		return bookService.get(bookId);
	}

	
}
