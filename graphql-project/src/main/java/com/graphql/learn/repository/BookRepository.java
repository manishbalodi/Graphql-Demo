package com.graphql.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.learn.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
