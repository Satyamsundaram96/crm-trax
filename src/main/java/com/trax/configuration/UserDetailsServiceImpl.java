package com.trax.configuration;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.trax.entities.FormUser;
import com.trax.repositories.FormUserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	private FormUserRepository formUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		FormUser formUser = formUserRepository.findByUserName(username);
        if (formUser == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return org.springframework.security.core.userdetails.User
            .withUsername(formUser.getUserName())
            .password(formUser.getPassword())
            .build();
	}

}
