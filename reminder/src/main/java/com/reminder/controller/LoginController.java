package com.reminder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reminder.model.User;
import com.reminder.repository.UserRepository;
import com.reminder.service.UserService;

@RestController
@CrossOrigin(origins="*")
public class LoginController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUsers() {
		return (List<User>) userService.getAllUsers();
	}
}
