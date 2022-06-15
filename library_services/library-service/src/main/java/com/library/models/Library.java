package com.library.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "library")
public class Library {
	@Id
	private Integer library_id;
	private String library_name;
	@OneToMany(mappedBy = "library")
	private Set<Books> books;

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

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int library_id, String library_name) {
		super();
		this.library_id = library_id;
		this.library_name = library_name;
	}

}
