package com.reminder.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reminder.model.Student;

@Repository
public interface JPARepository extends CrudRepository<Student, Long>{

}
