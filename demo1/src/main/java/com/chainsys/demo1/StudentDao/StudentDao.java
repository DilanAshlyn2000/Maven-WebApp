package com.chainsys.demo1.StudentDao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chainsys.demo1.model.Student;


	@Repository
	public interface StudentDao{
		
	public void save(Student saveUser);
	
	public int update(Student u1);
	
	public List<Student> listUsers();
	
	public Student findOne(Integer userId);
	
	public String findById(Integer userId);
	

}
