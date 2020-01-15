package io.java.swagger.api.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.swagger.api.model.Book;
import io.java.swagger.api.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/save")
	public String saveBook(@RequestBody Book book) {
		return bookService.save(book);
	}
	
	@GetMapping("/get/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return bookService.getBook(bookId);
	}
	
	@DeleteMapping("/delete/{bookId}")
	public List<Book> deleteBook(@PathVariable int bookId) {
		return bookService.remove(bookId);
	}
}
