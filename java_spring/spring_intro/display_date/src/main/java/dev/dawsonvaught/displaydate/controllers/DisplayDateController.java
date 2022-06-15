package dev.dawsonvaught.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayDateController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String date() {
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		Date now = new Date();
		now.setHours(23);
		now.setMinutes(30);
		model.addAttribute("now", now.toLocaleString());
		return "time.jsp";
	}
}
