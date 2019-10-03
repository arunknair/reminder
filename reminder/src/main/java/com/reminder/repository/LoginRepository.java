package com.reminder.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reminder.model.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, String> {
	
}
