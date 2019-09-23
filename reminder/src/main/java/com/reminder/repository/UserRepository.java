package com.reminder.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reminder.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
