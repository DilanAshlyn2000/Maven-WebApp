package com.chainsys.demo1.StudentDao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chainsys.demo1.model.Student;

	@Repository
	public interface StudentDao{
		
		 public void insertUser(Student user) ;
		 public List<Student> getAllUsers();
		 public void update(Student user);
		 public void delete(Student user) ;
		 public List<Student> search(String name);	  

}
