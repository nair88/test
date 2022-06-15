package com.library.services;

import java.util.List;

import com.library.models.Books;
import com.library.models.CountDTO;

public interface BookService {
	public void addBooks(Books book);

	public List<Books> getBooks();

	public List<CountDTO> getCount();

}
