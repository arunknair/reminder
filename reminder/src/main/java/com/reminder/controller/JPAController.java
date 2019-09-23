package com.reminder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reminder.model.User;
import com.reminder.service.JPAService;

@RestController
@RequestMapping
public class JPAController {

	@Autowired
	private JPAService jpaService;
	
	@GetMapping("/getAll")
	public List<User> getAllUsers() {
		return jpaService.getAllUsers();
	}
	
	@GetMapping("/insert")
	public void insertUser() {
		User user = new User();
		user.setEmail("arunk@sss.com");
		user.setPhoneNumber("4545454545");
		user.setStudentName("Arun");
		jpaService.insertUser(user);
	}
	
}
