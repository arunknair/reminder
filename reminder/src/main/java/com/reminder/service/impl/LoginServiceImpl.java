package com.reminder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reminder.model.Login;
import com.reminder.repository.LoginRepository;
import com.reminder.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public boolean isValidUser(Login loginVO) {
		// TODO Auto-generated method stub
		System.out.println(loginRepository.findById("1001"));
		return false;
	}

}
