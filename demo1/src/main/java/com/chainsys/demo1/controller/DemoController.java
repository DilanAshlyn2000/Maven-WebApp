package com.chainsys.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.demo1.StudentDao.StudentDao;
import com.chainsys.demo1.model.Student;

@Controller

public class DemoController  {

	@Autowired
	StudentDao studentDao;

	@RequestMapping("/")
	public String home() {
		System.out.println("Home Page");
		return "register.jsp";
	}

	@GetMapping("/register")
	public String saveUser(@RequestParam("name") String name, @RequestParam("grade") Integer grade,Model model) {
		Student user = new Student();
		user.setName(name);
		user.setGrade(grade);
		studentDao.insertUser(user);
		List<Student> users = studentDao.getAllUsers();
		System.out.println(users);
		model.addAttribute("users", users);
		return "displayStudent.jsp";
	}

	@GetMapping("/displayStudent")
	public String getAllUser(Model model) {
		System.out.println("getting datas");
		List<Student> users = studentDao.getAllUsers();
		System.out.println(users);
		model.addAttribute("users", users);
		return "displayStudent.jsp";
	}

	@PostMapping("/update")
	public String update(@RequestParam("grade") int grade, @RequestParam("id") int id, Model model) {
		Student user = new Student();
		user.setGrade(grade);
		user.setId(id);
		System.out.println(id + grade);
		System.out.println(user.getGrade() + user.getId());
		studentDao.update(user);
		List<Student> users = studentDao.getAllUsers();
		model.addAttribute("users", users);
		return "displayStudent.jsp";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id, Model model) {
		Student user = new Student();
		user.setId(id);
		studentDao.delete(user);
		List<Student> users = studentDao.getAllUsers();
		model.addAttribute("users", users);
		return "displayStudent.jsp";
	}

	@GetMapping("/search")
	public String search(@RequestParam("name") String name, Model model) {
		/*
		 * Student user = new Student(); user.setName(name);
		 */
		List<Student> users = studentDao.search(name);
		model.addAttribute("users", users);
		return "displayStudent.jsp";
	}
}
