package com.anassdevops.service;

import java.util.List;

import com.anassdevops.entity.Book;

public interface BookService {
	
	public List<Book> getBooks();
	public Book addBook(Book book);
	public Book editBook(Long id);
	public void deleteBook(Long id);
}
