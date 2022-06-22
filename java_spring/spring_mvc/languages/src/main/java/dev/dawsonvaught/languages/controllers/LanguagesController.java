package dev.dawsonvaught.languages.controllers;

import java.util.ArrayList;

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

import dev.dawsonvaught.languages.models.Language;
import dev.dawsonvaught.languages.services.LanguageService;

@Controller
public class LanguagesController {

	@Autowired
	LanguageService languageService;

	@GetMapping("/")
	public String index() {
		return "redirect:/languages";
	}

	@GetMapping("/languages")
	public String newLanguage(@ModelAttribute("language") Language language, Model model) {

		ArrayList<Language> languages = languageService.all();
		model.addAttribute("languages", languages);

		return "/languages/index.jsp";
	}

	@GetMapping("/languages/{id}")
	public String showOne(Model model, @PathVariable("id") long id) {

		model.addAttribute("language", languageService.find(id));

		return "/languages/showOne.jsp";
	}

	@PostMapping("/languages")
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {

		if (!result.hasErrors()) {
			languageService.create(language);
			return "redirect:/languages";
		}

		return "/languages/index.jsp";
	}

	@GetMapping("/languages/{id}/edit")
	public String editDisplay(Model model, @PathVariable("id") long id) {
		model.addAttribute("language", languageService.find(id));
		return "/languages/edit.jsp";
	}

	@PutMapping("/languages/{id}/edit")
	public String editPut(@Valid @ModelAttribute("language") Language language, BindingResult result,
			@PathVariable("id") long id) {
		if (!result.hasErrors()) {
			language.setId(id);
			languageService.update(language);
			return "redirect:/languages";
		}

		return "/languages/edit.jsp";
	}

	@DeleteMapping("/languages/{id}")
	public String destroy(@PathVariable("id") long id) {
		languageService.delete(id);
		return "redirect:/languages";
	}
}