package com.trax.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trax.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
