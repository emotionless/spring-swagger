package io.java.swagger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.swagger.api.dao.BookRepository;
import io.java.swagger.api.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public String save(Book book) {
		bookRepository.save(book);
		return book.getBookId() + " saved";
	}
	
	public Book getBook(int bookId) {
		return bookRepository.findOne(bookId);
	}
	
	public List<Book> remove(int bookId) {
		bookRepository.delete(bookId);
		return bookRepository.findAll();
	}
}
