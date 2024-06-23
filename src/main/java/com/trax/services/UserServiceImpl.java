package com.trax.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.trax.dto.UserDto;
import com.trax.entities.FormUser;
import com.trax.entities.User;
import com.trax.repositories.FormUserRepository;
import com.trax.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private FormUserRepository formUserRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User registerUser(UserDto userDto) {
		 User user = new User();
		 user.setFirstName(userDto.getFirstName());
		 user.setLastName(userDto.getLastName());
		 user.setEmail(userDto.getEmail());
		 user.setPassword(passwordEncoder.encode(userDto.getPassword()));
		 user.setRole("USER");
		 userRepository.save(user);
		return user ;
	}
	
	public FormUser saveUser(FormUser formUser) {
		formUser.setPassword(passwordEncoder.encode(formUser.getPassword()));
		return formUserRepository.save(formUser);
	}
	
	public List<FormUser> getAllUsers() {
		return formUserRepository.findAll();
	}

}
