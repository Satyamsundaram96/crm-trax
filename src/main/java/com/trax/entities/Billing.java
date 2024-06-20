package com.trax.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bill_copy")
public class Billing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "first_name")
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	private String email;
	
	private long mobile;
	
	private String product;
	
	private int amount;
	
	
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public long getMobile() {
		return mobile;
	}
	public String getProduct() {
		return product;
	}
	public int getAmount() {
		return amount;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
