package dev.dawsonvaught.studentroster.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.dawsonvaught.studentroster.models.Dorm;
import dev.dawsonvaught.studentroster.services.DormService;
import dev.dawsonvaught.studentroster.services.StudentService;

@Controller
@RequestMapping("/dorms")
public class DormController {
	
	@Autowired
	DormService dormService;
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("")
	public String showAll(Model model) {
		
		model.addAttribute("dorms", dormService.all());
		
		return "/dorms/showAll.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOne(Model model, @PathVariable("id") long id) {
		
		model.addAttribute("dorm", dormService.find(id));
		model.addAttribute("students", studentService.all());
		
		return "/dorms/showOne.jsp";
	}
	
	@GetMapping("/new")
	public String displayNew(@ModelAttribute("dorm") Dorm dorm) {
		return "/dorms/new.jsp";
	}
	
	@PostMapping("/new/submit")
	public String displayPost(@Valid @ModelAttribute("dorm") Dorm dorm, BindingResult result) {
		
		if (!result.hasErrors()) {
			dormService.create(dorm);
			return "redirect:/dorms";
		}
		
		return "/dorms/new.jsp";
		
	}
}
