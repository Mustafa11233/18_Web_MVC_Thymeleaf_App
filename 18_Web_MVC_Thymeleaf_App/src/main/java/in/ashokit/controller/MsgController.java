package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	//for Thymeleaf we are creating html files in templates folder
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg","welcome to Thymeleaf Pages..");
		
		
		return "index";
	}
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		model.addAttribute("msg","Good Evening..");
		
		
		return "index";
	}

}
