package com.trax.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FormUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "userName" , length = 45 , nullable = false)
	private String userName;
	
	@Column(name = "password" , length = 45 , nullable = false)
	private String password;

	
	public FormUser() {
	
	}

	public FormUser(Long id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	public FormUser(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
