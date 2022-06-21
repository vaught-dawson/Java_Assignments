package dev.dawsonvaught.renderingbooks.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dawsonvaught.renderingbooks.models.Book;
import dev.dawsonvaught.renderingbooks.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public ArrayList<Book> allBooks() {
		return bookRepository.findAll();
	}

	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	public Book updateBook(long id, String title, String description, String language, int pages) {
		Book current = this.findBook(id);
		if (title != "") current.setTitle(title);
		if (description != "") current.setDescription(description);
		if (language != "") current.setLanguage(language);
		current.setNumberOfPages(pages);
		bookRepository.save(current);
		
		return current;
	}
	
	public void deleteBook(long id) {
		bookRepository.deleteById(id);
	}
}