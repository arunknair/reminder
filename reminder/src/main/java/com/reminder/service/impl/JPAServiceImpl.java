package com.reminder.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reminder.model.User;
import com.reminder.repository.JPARepository;
import com.reminder.service.JPAService;

@Service
@Transactional
public class JPAServiceImpl implements JPAService{

	@Autowired
	private JPARepository jPARepository;
	
	@Override
	public List<User> getAllUsers() {
		return (List<User>) jPARepository.findAll();
	}

	@Override
	public void insertUser(User user) {
		jPARepository.save(user);
	}

}
