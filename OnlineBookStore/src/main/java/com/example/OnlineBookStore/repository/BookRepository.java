package com.example.OnlineBookStore.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.OnlineBookStore.Model.Book;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "book")
public interface BookRepository extends JpaRepository<Book, Long> {
	
	Page<Book> findBybookTypeId(@Param("id") Long id,Pageable pageable);
	
	Page<Book> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}
