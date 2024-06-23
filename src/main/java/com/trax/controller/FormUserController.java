package com.trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.FormUser;
import com.trax.services.UserServiceImpl;

@Controller
@RequestMapping("/users")
public class FormUserController {
	
	@Autowired
	private UserServiceImpl service;
	
	// First starting of this application URL -> http://localhost:8080/users/welcome
	@GetMapping("/welcome")
    public String home() {
        return "welcome";
    }
    
	// For Login
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    // After login success then home url will call
    @GetMapping("/home")
    public String welcome() {
        return "home"; // welcome page add msg for User login successfully & give url for Trade Entry & Query result page
    }
    
    // For Sign-in
    @GetMapping("/sign-in")
    public String signIn() {
        return "signin";
    }
	
	// Save user/sign-in
	@PostMapping("/register")
	public String saveNewUser(@RequestParam("userName") String userName, @RequestParam("password") String password, ModelMap model) {
		FormUser formUser = new FormUser(userName, password);
		service.saveUser(formUser);
		model.addAttribute("message", "User "+ userName + " saved successfully!");
		return "user_result"; // user_result page add url for Trade Entry & Query result page
	}

}
