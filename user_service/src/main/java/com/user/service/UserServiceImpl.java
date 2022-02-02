package com.user.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//fake user list
	
	List<User> list = List.of(
			new User(1311L, "Durgesh Tiwari", "9879879879"),
			new User(1312L, "Ankit Tiwari", "9852125498"),
			new User(1314L, "Ravi Tiwari", "7895265423")
			);
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(i->i.getUserId().equals(id)).findAny().orElse(null);
	}

}
