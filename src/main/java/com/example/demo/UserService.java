package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	//Call the UserService to save the user
	void saveUser(Users user) {
		repository.save(user);
		System.out.println("user created " + user.getName());
}
	public Iterable<Users> getAllUsers() {
		return repository.findAll();
		// TODO Auto-generated method stub
		
	}
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
}