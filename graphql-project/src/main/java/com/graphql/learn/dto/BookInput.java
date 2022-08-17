package com.graphql.learn.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class BookInput {
	
		private String name;
		private String description;
		private String author;
		private double price;
		private int pages;

}
