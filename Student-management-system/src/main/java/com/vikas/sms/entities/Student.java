package com.vikas.sms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private Long phone_no;
	
	@Column
	private String email;
	
	
	public Student() {
		
	}
	
	public Student(String firstname, String lastname, long number ,String email) {
		this.first_name = firstname;
		this.last_name = lastname;
		this.phone_no = number;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long number) {
		this.phone_no = number;
	}
	
	
}
