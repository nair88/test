package com.library.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library.models.Books;
import com.library.models.CountDTO;

public interface BooksDao extends JpaRepository<Books, String> {
	@Query(value = " select new com.library.models.CountDTO(library_id,count(book_id) as count) from Books group by library_id")
	public List<CountDTO> getCount();
}
