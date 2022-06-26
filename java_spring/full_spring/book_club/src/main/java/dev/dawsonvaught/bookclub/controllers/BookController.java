package dev.dawsonvaught.bookclub.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.dawsonvaught.bookclub.models.Book;
import dev.dawsonvaught.bookclub.services.BookService;
import dev.dawsonvaught.bookclub.services.UserService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@Autowired
	UserService userService;

	@GetMapping("")
	public String newBook(@ModelAttribute("book") Book book, Model model, HttpSession session) {
		
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
		
		ArrayList<Book> books = bookService.all();
		model.addAttribute("books", books);
		model.addAttribute("user", userService.find((Long) session.getAttribute("uuid")));

		return "/books/showAll.jsp";
	}

	@GetMapping("/{id}")
	public String showOne(Model model, @PathVariable("id") long id, HttpSession session) {

		model.addAttribute("book", bookService.find(id));
		model.addAttribute("user", userService.find((Long) session.getAttribute("uuid")));

		return "/books/showOne.jsp";
	}
	
	@GetMapping("/new")
	public String newDisplay(@ModelAttribute("book") Book book, HttpSession session, Model model) {
		
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
				
		return "/books/new.jsp";
	}

	@PostMapping("/new/submit")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {

		if (!result.hasErrors()) {
			
			book.setUser(userService.find((long) session.getAttribute("uuid")));
			bookService.create(book);
			return "redirect:/books";
		}
		
		return "/books/new.jsp";
	}

	@GetMapping("/{id}/edit")
	public String editDisplay(Model model, @PathVariable("id") long id, HttpSession session) {
		
		Book book = bookService.find(id);
		
		System.out.println(book.getUser().getId());
		System.out.println(session.getAttribute("uuid"));
		
		if (book.getUser().getId() != (long) session.getAttribute("uuid")) {
			return "redirect:/books";
		}
		
		model.addAttribute("book", book);
		
		return "/books/edit.jsp";
	}

	@PutMapping("/{id}/update")
	public String editPut(@Valid @ModelAttribute("book") Book book, BindingResult result, @PathVariable("id") long id, HttpSession session) {
		
		if (bookService.find(id).getUser().getId() != (long) session.getAttribute("uuid")) {
			return "redirect:/books";
		}
		
		if (!result.hasErrors()) {
			book.setId(id);
			book.setUser(userService.find((long) session.getAttribute("uuid")));
			bookService.update(book);
			return "redirect:/books/" + id;
		}

		return "/books/edit.jsp";
	}

	@DeleteMapping("/{id}")
	public String destroy(@PathVariable("id") long id) {
		bookService.deleteById(id);
		return "redirect:/books";
	}
}