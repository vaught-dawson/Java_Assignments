package dev.dawsonvaught.dojosandninjas.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dev.dawsonvaught.dojosandninjas.models.Dojo;
import dev.dawsonvaught.dojosandninjas.models.Ninja;
import dev.dawsonvaught.dojosandninjas.services.DojoService;
import dev.dawsonvaught.dojosandninjas.services.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	NinjaService ninjaService;
	@Autowired
	DojoService dojoService;
	
	@GetMapping("/ninjas/new")
	public String newExpense(@ModelAttribute("ninja") Ninja ninja, Model model) {
	
		ArrayList<Dojo> dojos = dojoService.all();
		model.addAttribute("dojos", dojos);
		
		return "/ninjas/new.jsp";
	}
		
	@PostMapping("/ninjas/new")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		
		if (!result.hasErrors()) {
			ninjaService.create(ninja);
			return "redirect:/dojos/" + ninja.getDojo().getId();
		}
		
		return "/ninjas/new.jsp";
	}
}