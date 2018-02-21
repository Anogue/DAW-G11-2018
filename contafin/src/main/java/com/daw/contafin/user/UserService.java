package com.daw.contafin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserComponent userComponent;
	
	public User findByEmail (String email) {
		return userRepository.findByEmail(email);
	}
	
	public List<User> getUsers () {
		return userRepository.findAll();
	}
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User findById(long id) {
		return userRepository.findById(id);
	}
	
	public void updateUserData(User user) {
		userRepository.save(user);
	}
	
	
	
	
}
