package dev.dawsonvaught.renderingbooks.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dev.dawsonvaught.renderingbooks.models.Book;
import dev.dawsonvaught.renderingbooks.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("")
	public String index() {
		return "redirect:/books";
	}

	@GetMapping("/books")
	public String allBooks(Model model) {
		
		ArrayList<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		
		return "index.jsp";
	}

	@GetMapping("/books/{bookId}")
	public String oneBook(Model model, @PathVariable("bookId") long bookId) {

		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);

		return "showOne.jsp";
	}
}
