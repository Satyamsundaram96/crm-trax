package com.trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trax.dto.UserDto;
import com.trax.entities.User;
import com.trax.services.UserService;

@RestController
public class RegistrationController {
	
	@Autowired UserService userService;
	
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserDto userDto) {
		
		User user = userService.registerUser(userDto);
		return "Success" ;
	}

}
