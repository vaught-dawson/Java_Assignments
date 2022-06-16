package dev.dawsonvaught.omikujiform.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String form() {
		return "index.jsp";
	}

	@PostMapping("/omikuji/submit")
	public String submit(@RequestParam Map<String, String> fields, HttpSession session) {

		for (Map.Entry<String, String> entry : fields.entrySet()) {
			session.setAttribute(entry.getKey(), entry.getValue());
		}

		return "redirect:/omikuji/show";
	}

	@GetMapping("/omikuji/show")
	public String show(HttpSession session) {

		return "show.jsp";
	}
}
