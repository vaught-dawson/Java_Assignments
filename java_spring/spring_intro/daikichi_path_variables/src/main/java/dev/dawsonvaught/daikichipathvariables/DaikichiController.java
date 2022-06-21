package dev.dawsonvaught.daikichipathvariables;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportinity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("travel/{location}")
	public String travelLocation(@PathVariable("location") String location) {
		return String.format("Congratulations! You will soon travel to %s", location);
	}
	
	@RequestMapping("lotto/{num}") 
	public String lottory(@PathVariable("num") int num) {
		if (num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
}