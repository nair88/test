package com.library.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class BookDTO implements Serializable {
	private Integer library_id;
	private String library_name;
	private String book_id;
	private String book_name;
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDTO(Integer library_id, String library_name, String book_id, String book_name) {
		super();
		this.library_id = library_id;
		this.library_name = library_name;
		this.book_id = book_id;
		this.book_name = book_name;
	}
	public Integer getLibrary_id() {
		return library_id;
	}
	public void setLibrary_id(Integer library_id) {
		this.library_id = library_id;
	}
	public String getLibrary_name() {
		return library_name;
	}
	public void setLibrary_name(String library_name) {
		this.library_name = library_name;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

}
