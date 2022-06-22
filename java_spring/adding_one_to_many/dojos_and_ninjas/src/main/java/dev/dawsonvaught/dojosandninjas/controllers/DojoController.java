package dev.dawsonvaught.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dev.dawsonvaught.dojosandninjas.models.Dojo;
import dev.dawsonvaught.dojosandninjas.services.DojoService;

@Controller
public class DojoController {

	@Autowired
	DojoService dojoService;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/{id}")
	public String showOne(Model model, @PathVariable("id") long id) {
		
		model.addAttribute("dojo", dojoService.find(id));
		
		return "/dojos/showOne.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojoView(@Valid @ModelAttribute("dojo") Dojo dojo) {
		
		return "/dojos/new.jsp";
	}
	
	@PostMapping("/dojos/new") 
		public String newDojoPost(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
			
			if (!result.hasErrors()) {
				Dojo newDojo = dojoService.create(dojo);
				return "redirect:/dojos/" + newDojo.getId();
			}
			
			return "/dojos/new.jsp";
	}
}
