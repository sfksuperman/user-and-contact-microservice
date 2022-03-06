package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long userId;
	private String name;
	private String phone;
	
	List<Contact> contacts = new ArrayList<>();

	// default-constructor
	public User() {
	}
	
	// Parameterized-constructor involving a user who has contact
	public User(Long userId, String name, String phone, List<Contact> contacts) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	// Parameterized-constructor involving a user who does not have a contact
	public User(Long userId, String name, String phone) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	// getter-setter
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
