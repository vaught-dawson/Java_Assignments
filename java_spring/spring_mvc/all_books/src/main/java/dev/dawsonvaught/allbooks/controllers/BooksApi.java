package dev.dawsonvaught.allbooks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.dawsonvaught.allbooks.models.Book;
import dev.dawsonvaught.allbooks.services.BookService;

@RestController
@RequestMapping("/api")
public class BooksApi {
	private final BookService bookService;

	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/books")
	public List<Book> index() {
		return bookService.allBooks();
	}

	@GetMapping("/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}

	@PostMapping("/books")
	public Book create(@RequestParam(value = "title") String title,
			@RequestParam(value = "description") String desc, @RequestParam(value = "language") String lang,
			@RequestParam(value = "pages") Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}

	@PutMapping("/books/{id}")
	public Book update(@PathVariable("id") Long id, @RequestParam(value = "title") String title,
			@RequestParam(value = "description") String desc, @RequestParam(value = "language") String lang,
			@RequestParam(value = "pages") Integer numOfPages) {
		return bookService.updateBook(id, title, desc, lang, numOfPages);
	}

	@DeleteMapping("/books/{id}")
	public void destroy(@PathVariable("id") long id) {
		bookService.deleteBook(id);
	}
}