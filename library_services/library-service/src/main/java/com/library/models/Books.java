package com.library.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "book")
public class Books {

	@Id
	private String book_id;
	private Integer library_id;

	private String book_name;
	@ManyToOne
	@JoinColumn(name = "library_id", insertable = false, updatable = false)
	private Library library;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(String book_id, Integer library_id, String book_name) {
		super();
		this.book_id = book_id;
		this.library_id = library_id;
		this.book_name = book_name;
	}

	public Integer getLibrary_id() {
		return library_id;
	}

	public void setLibrary_id(Integer library_id) {
		this.library_id = library_id;
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
