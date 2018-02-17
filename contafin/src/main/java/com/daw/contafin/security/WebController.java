package com.daw.contafin.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.daw.contafin.user.User;
import com.daw.contafin.user.UserComponent;
import com.daw.contafin.user.UserService;

@Controller
public class WebController {

	@Autowired
	UserService userService;

	@Autowired
	UserComponent userComponent;
	
	//Login Controller

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	//Home page Controller
	
	@RequestMapping("home")
	public String home(Model model) {
		
		model.addAttribute("loggedUser", userComponent.isLoggedUser());
		
		if (userComponent.isLoggedUser()) {
			model.addAttribute("name", userService.findByEmail(userComponent.getLoggedUser().getEmail()).getName());
			model.addAttribute("points", userService.findByEmail(userComponent.getLoggedUser().getEmail()).getPoints());
			model.addAttribute("streak", userService.findByEmail(userComponent.getLoggedUser().getEmail()).getStreak());
			model.addAttribute("dailyGoal", userService.findByEmail(userComponent.getLoggedUser().getEmail()).getDailyGoal());
			
		}
		
		return "home";
	}
	
	//Sign Up Controller
	
	@RequestMapping("signup")
	public String signUp(Model model, HttpServletRequest request) {
		return "signup";
	}
	
	@RequestMapping("welcome")
	public String register(Model model, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("pass") String pass) {
	
		if (userService.findByEmail(email) == null) {
			userService.save(new User(name, email, pass, "ROLE_USER"));
			return "/";
		}
		else  {
			model.addAttribute("loggedUser", true);
			return "signup";
		}
	}

}
