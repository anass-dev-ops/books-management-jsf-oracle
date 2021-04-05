package com.anassdevops.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "bookBean")
@SessionScoped
public class BookBean implements Serializable{

	private static final long serialVersionUID = 6206352332495695519L;
	
	private Long id;
	private String title;
	private String description;
	private String price;
	private String author;
	private String edition;

	public BookBean() {
		super();
	}

	public BookBean(Long id, String title, String description, String price, String author, String edition) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.author = author;
		this.edition = edition;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}
}
