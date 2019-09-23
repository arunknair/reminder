package com.reminder.service;

import java.util.List;

import com.reminder.model.Student;

public interface JPAService {

	public List<Student> getAllUsers();
	public void insertUser(Student user);
}
