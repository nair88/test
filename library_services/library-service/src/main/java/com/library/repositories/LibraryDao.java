package com.library.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library.models.BookDTO;
import com.library.models.Books;
import com.library.models.Library;

public interface LibraryDao extends JpaRepository<Library, Integer> {
	@Query("from Books b INNER JOIN b.library l where l.library_id=?1")
	public List<Books> getAllBooks(Integer library_id);
	@Query(value = " select new com.library.models.BookDTO(l.library_id as library_id,l.library_name as library_name,b.book_id as book_id,b.book_name as book_name) "
			+ "from Books b inner join Library l on l.library_id =b.library_id order by library_id")
	public List<BookDTO> getBookEachLibrary();
}
