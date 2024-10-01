package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query("select s from student s where name = ?1")
	List<Student> findByName(String name);
	
}
