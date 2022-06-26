package dev.dawsonvaught.bookclub.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dawsonvaught.bookclub.models.Book;
import dev.dawsonvaught.bookclub.repositories.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public ArrayList<Book> all() {
		return bookRepository.findAll();
	}
	
	public Book create(Book book) {
		return bookRepository.save(book);
	}
	
	public Book find(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	public Book update(Book book) {
		return bookRepository.save(book);
	}
	
	public void deleteById(long id) {
		bookRepository.deleteById(id);
	}
}