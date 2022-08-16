package com.graphql.learn.entity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.graphql.learn.entity.Book;
import com.graphql.learn.repository.BookRepository;

public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book get(int id) {
		return bookRepository.findById(id).orElseThrow(()-> new RuntimeException("The book you are looking was not found"));
	}

}
