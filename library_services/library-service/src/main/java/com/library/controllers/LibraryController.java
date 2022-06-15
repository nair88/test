package com.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.models.Library;
import com.library.services.LibraryService;
import com.library.models.Books;

@RestController
public class LibraryController {
	@Autowired
	LibraryService libraryService;
	@Autowired
	Library library;

	@RequestMapping(method = RequestMethod.POST, value = "/library")
	public void addLibrary(@RequestBody Library library) {
		libraryService.addLibrary(library);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/library/{id}")
	public List<Books> addLibrary(@PathVariable("id") Integer library_id) {
		return libraryService.getAllBooks(library_id);
	}
}
