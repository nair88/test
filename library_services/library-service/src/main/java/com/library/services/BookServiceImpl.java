package com.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.models.Books;
import com.library.models.CountDTO;
import com.library.repositories.BooksDao;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BooksDao booksDao;

	@Override
	public void addBooks(Books book) {
		// TODO Auto-generated method stub
		booksDao.save(book);
	}

	@Override
	public List<Books> getBooks() {
		// TODO Auto-generated method stub
		return booksDao.findAll();
	}

	@Override
	public List<CountDTO> getCount() {
		// TODO Auto-generated method stub
		return booksDao.getCount();
	}

}
