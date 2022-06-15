package com.library.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library.models.Books;
import com.library.models.Library;

public interface LibraryDao extends JpaRepository<Library, Integer> {
	@Query("from Books b INNER JOIN b.library l where l.library_id=?1")
	public List<Books> getAllBooks(Integer library_id);
}
