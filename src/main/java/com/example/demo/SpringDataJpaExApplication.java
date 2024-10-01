package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.model.Student;
@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		
		s1.setRollNo(10);
		s1.setName("John");
		s1.setMarks(100);

		s2.setRollNo(10);
		s2.setName("John");
		s2.setMarks(100);

		s3.setRollNo(10);
		s3.setName("John");
		s3.setMarks(100);
		
//		repo.save(s1);
//		repo.findAll();  
//		repo.findById(100);
//		repo.findByName("david");
//		repo.delete(s1);
	}

}
