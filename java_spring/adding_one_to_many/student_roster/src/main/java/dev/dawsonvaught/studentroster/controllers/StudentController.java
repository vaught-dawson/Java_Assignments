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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dev.dawsonvaught.studentroster.models.Student;
import dev.dawsonvaught.studentroster.services.DormService;
import dev.dawsonvaught.studentroster.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	DormService dormService;

	@GetMapping("/new")
	public String displayNew(@ModelAttribute("student") Student student, Model model) {

		model.addAttribute("dorms", dormService.all());

		return "/students/new.jsp";
	}

	@PostMapping("/new/submit")
	public String displayPost(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model) {

		if (!result.hasErrors()) {
			studentService.create(student);
			return "redirect:/dorms";
		}

		model.addAttribute("dorms", dormService.all());

		return "/students/new.jsp";

	}
	
	@PutMapping("/update/submit")
	public String updateDorm(@RequestParam("student") long student, @RequestParam("dorm") long dorm) {
		Student current = studentService.find(student);
		current.setDorm(dormService.find(dorm));
		
		studentService.update(current);
		
		return "redirect:/dorms/" + dorm;
	}
	
	@GetMapping("/destroy/{id}")
	public String delete(@PathVariable("id") long id) {
		Student current = studentService.find(id);
		
		studentService.deleteById(id);
		
		return "redirect:/dorms/" + current.getDorm().getId();
	}
}
