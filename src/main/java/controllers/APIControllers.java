package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/daikichi")
public class APIControllers {
	
	@RequestMapping("/travel/Honolulu")
	public String staticRoute() {
		return "Congratulations! You will soon travel to Honolulu";
	}
	
	@RequestMapping("/lotto/{variable}")
	public String dynamicRoute (@PathVariable Integer variable) {
		if(variable %2 ==0) {
			return "You will take a grand journey in the near future, but the wary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
	
	@RequestMapping("/travel/{city}") 
	public String cityTravel(@PathVariable String city) {
		return "Congratulations! You will soon travel to "+ city ;
	}
	
	

}
