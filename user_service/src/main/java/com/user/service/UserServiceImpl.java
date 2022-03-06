package com.user.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	// fake user list
	
	List<User> list = List.of(
			new User(1311L, "Ram Kumar", "8754856212"),
			new User(1312L, "Shyam Kumar", "7845659856"),
			new User(1314L, "Mohan Kumar", "8956451232")
			);
	
	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}	

}
