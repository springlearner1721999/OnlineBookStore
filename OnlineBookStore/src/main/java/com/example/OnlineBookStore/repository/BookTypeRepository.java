package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.OnlineBookStore.Model.BookType;

@CrossOrigin("http://localhost:4200")
public interface BookTypeRepository  extends JpaRepository<BookType, Long>{

}
