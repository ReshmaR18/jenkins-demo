package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
@RequestMapping("/user")  //here we are defining this class as a RestController and mapping it to the "/user" end point.
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping //Defining a POST end point to save a user
	void saveUser(@RequestBody Users user) {
		userService.saveUser(user);
		System.out.println("user created " + user.getName());
	}

	//Define a GET endpoint to retrieve all users
	@GetMapping
	Iterable<Users> getUser() {
		//userService.getAllUsers();
		//System.out.println("test");
		//System.out.println("USER FOUND");
		return userService.getAllUsers();
	}
	
	@DeleteMapping("/{id}")
	void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		
	}
	
	
}
