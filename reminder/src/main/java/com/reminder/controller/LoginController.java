package com.reminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reminder.model.Login;
import com.reminder.service.LoginService;

@RestController
@RequestMapping
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping(path="/login")
	public boolean isValidUser(Login loginMsg) {
		System.out.println("login call************************" +  loginMsg.getUsername());
		return loginService.isValidUser(loginMsg);
	}
	
}
