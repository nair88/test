package com.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.models.Books;
import com.library.models.CountDTO;
import com.library.services.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	@Autowired
	Books book;

	@RequestMapping(method = RequestMethod.POST, value = "/books")
	public void addBook(@RequestBody Books book) {
		bookService.addBooks(book);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getBooks")
	public List<Books> getBook() {
		return bookService.getBooks();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/count")
	public List<CountDTO> getCount() {
		return bookService.getCount();
	}
}
