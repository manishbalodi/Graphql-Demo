package com.graphql.learn.entity.service;

import java.util.List;

import com.graphql.learn.entity.Book;

public interface BookService {
	
	Book createBook(Book book);
	List<Book> getAll();
	Book get(int id);
	

}
