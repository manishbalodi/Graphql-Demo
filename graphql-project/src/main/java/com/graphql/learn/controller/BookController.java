package com.graphql.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graphql.learn.entity.Book;
import com.graphql.learn.entity.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping()
	public Book createBook(@RequestBody Book book)
	{
		Book bookr = bookService.createBook(book);
		return bookr;
		
	}
	
	@GetMapping()
	public List<Book> getAllBooks()
	{
		return bookService.getAll();
	}
	
	@GetMapping("/{bookId}")
	public List<Book> getBook(@PathVariable int bookId)
	{
		return (List<Book>) bookService.get(bookId);
	}

}
