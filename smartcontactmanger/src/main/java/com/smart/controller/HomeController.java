package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.entities.User;
import com.smart.respository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/")
	//@ResponseBody
	public String home(Model model) {
		
//		User user=new User();
//		user.setName("Pritesh");
//		user.setEmail("neeleshdubey@gmail.com");
//		userRepository.save(user);
		model.addAttribute("title","Home-Smart Contact Manager");
		
		return "home";
	}
	
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title","Home-Smart Contact Manager");
		return "about";
	}
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title","Home-Smart Contact Manager");
		return "signup";
	}

}
