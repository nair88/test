package com.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.models.Books;
import com.library.models.Library;
import com.library.repositories.LibraryDao;

@Service
public class LibraryServiceImpl implements LibraryService {
	@Autowired
	LibraryDao libraryDao;

	@Override
	public void addLibrary(Library library) {
		// TODO Auto-generated method stub
		libraryDao.save(library);
	}

	@Override
	public List<Books> getAllBooks(Integer library_id) {
		// TODO Auto-generated method stub
		return libraryDao.getAllBooks(library_id);
	}

}
