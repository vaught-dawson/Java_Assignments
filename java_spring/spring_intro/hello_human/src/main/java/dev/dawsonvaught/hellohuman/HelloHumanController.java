package dev.dawsonvaught.hellohuman;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@GetMapping(value = "/")
	public String index() {
		return "Hello Human";
	}

	@GetMapping(value = "/", params = "name")
	public String firstName(@RequestParam Map<String, String> requestParams) {
		return String.format("Hello %s", requestParams.get("name"));
	}

	@GetMapping(value = "/", params = { "name", "last_name" })
	public String fullName(@RequestParam Map<String, String> requestParams) {
		return String.format("Hello %s %s", requestParams.get("name"), requestParams.get("last_name"));
	}
	
	@GetMapping(value = "/", params = { "name", "last_name", "times" })
	public String fullNameMulti(@RequestParam Map<String, String> requestParams) {
		String output = "";
		
		for (int i = 0; i < Double.parseDouble(requestParams.get("times")); i++) {
			output += String.format("Hello %s %s", requestParams.get("name"), requestParams.get("last_name"));
		}
		
		return output;
	}

}
