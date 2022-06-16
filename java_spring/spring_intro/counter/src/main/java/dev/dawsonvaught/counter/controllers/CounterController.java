package dev.dawsonvaught.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {
	@GetMapping("/")
	public String index(HttpSession session) {

		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}

		session.setAttribute("count", ((Integer) session.getAttribute("count")) + 1);

		return "index.jsp";
	}

	@GetMapping("/counter")
	public String counter(HttpSession session, Model model) {

		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}

		model.addAttribute("count", (Integer) session.getAttribute("count"));
		return "counter.jsp";
	}
}
