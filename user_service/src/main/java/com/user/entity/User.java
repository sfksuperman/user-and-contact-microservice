package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Long userId;
	private String name;
	private String phone;
	
	// List of contacts will be fetched other service
	List<Contact> contacts = new ArrayList<>();

	// 1. Parameterized Constructor including List<Contact>
	public User(Long userId, String name, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	
	// 2. Parameterized Constructor excluding List<Contact>
	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	// 3. Default Constructor
	public User() {
	}

	// 4. Getter-Setter
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
