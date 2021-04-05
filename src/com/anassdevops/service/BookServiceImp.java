package com.anassdevops.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.anassdevops.entity.Book;

public class BookServiceImp implements BookService{

	@Override
	public List<Book> getBooks() {
		
		return null;
	}

	@Override
	public Book addBook(Book book) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sys as sysdba", "1234");
			System.out.println("Connected ...");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into sys.books values(?,?,?,?,?,?)");
			preparedStatement.setLong(1, book.getId());
			preparedStatement.setString(2, book.getTitle());
			preparedStatement.setString(3, book.getDescription());
			preparedStatement.setString(4, book.getPrice());
			preparedStatement.setString(5, book.getAuthor());
			preparedStatement.setString(6, book.getEdition());
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Not Connected");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Book editBook(Long id) {
		return null;
	}

	@Override
	public void deleteBook(Long id) {
		
	}

}
