package com.example.OnlineBookStore.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_type")

public class BookType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "bookType")
	private Set<Book> books;

	
	
	public BookType() {
		
	}

	public BookType(BookType bookTypr) {
	
		this.id = bookTypr.id;
		this.type = bookTypr.type;
		this.books = bookTypr.books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookType [id=" + id + ", type=" + type + ", books=" + books + "]";
	}
	
	
	
	
}
