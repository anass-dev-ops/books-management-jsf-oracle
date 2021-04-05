package com.anassdevops.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.anassdevops.entity.Book;

public class BookServiceImp implements BookService{

	@Override
	public ArrayList<Book> getBooks() {
		ArrayList<Book> booksList = new ArrayList<Book>(); 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sys as sysdba", "1234");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from sys.books");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Book b = new Book();
				b.setId(resultSet.getLong(1));
				b.setTitle(resultSet.getString(2));
				b.setDescription(resultSet.getString(3));
				b.setPrice(resultSet.getString(4));
				b.setAuthor(resultSet.getString(5));
				b.setEdition(resultSet.getString(6));
				booksList.add(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return booksList;
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
