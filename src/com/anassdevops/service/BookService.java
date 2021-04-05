package com.anassdevops.service;

import java.util.ArrayList;

import com.anassdevops.entity.Book;

public interface BookService {
	
	public ArrayList<Book> getBooks();
	public Book addBook(Book book);
	public Book editBook(Long id);
	public void deleteBook(Long id);
}
