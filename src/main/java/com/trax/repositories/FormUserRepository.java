package com.trax.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trax.entities.FormUser;

@Repository
public interface FormUserRepository extends JpaRepository<FormUser, Long> {

	FormUser findByUserName(String username);

}
