package com.reminder.service;

import java.util.List;

import com.reminder.model.User;

public interface JPAService {

	public List<User> getAllUsers();
	public void insertUser(User user);
}
