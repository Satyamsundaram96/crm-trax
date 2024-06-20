package com.trax.services;

import com.trax.dto.UserDto;
import com.trax.entities.User;

public interface UserService {

	User registerUser(UserDto userDto);

	
	
}
