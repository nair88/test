package com.library.services;

import java.util.List;

import com.library.models.BookDTO;
import com.library.models.Books;
import com.library.models.Library;

public interface LibraryService {
	public void addLibrary(Library library);

	public List<Books> getAllBooks(Integer library_id);

	public List<BookDTO> getBookEachLibrary();

}
