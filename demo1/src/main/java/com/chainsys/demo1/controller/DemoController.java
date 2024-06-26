package com.chainsys.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.demo1.StudentDao.StudentImp;
import com.chainsys.demo1.model.Student;



@Controller

public class DemoController {
	/*@RequestMapping("/")
public String display() {
	return "home.jsp";
	
}
@GetMapping("/about")
public String Read() {
	
	return "about.jsp";
	
}*/
	@Autowired
    StudentImp userImpl;

    @RequestMapping("/")
    public String home() {
        System.out.println("Home Page");
        return "register.jsp";
    }

    @GetMapping("/register")
    public String saveUser(@RequestParam("name") String name, @RequestParam("grade") Integer grade) {
        Student user = new Student();
        user.setName(name);
        user.setGrade(grade);
        userImpl.insertUser(user);
        return "about.jsp";
    }
    
    @GetMapping("/displayStudent")
    public String getAllUser(Model model){
    System.out.println("getting datas");
    List<Student>users=userImpl.getAllUsers();
    System.out.println(users);
    model.addAttribute("users",users);
    return "displayStudent.jsp";
    }
    
    @PostMapping("/update")
    public String update(@RequestParam ("grade") int grade, @RequestParam ("id") int id, Model model)
    {
        Student user = new Student();
        
        user.setGrade(grade);
        user.setId(id);
        System.out.println(id+grade);
        System.out.println(user.getGrade()+user.getId());
       userImpl .update(user);
        
        List<Student> users = userImpl.getAllUsers();
        model.addAttribute("users ", users);
        
        return "displayStudent.jsp";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam ("id") int id, Model model)
    {
        Student user = new Student();
        
        user.setId(id);
        
        userImpl.delete(user);
        
        List<Student> users =userImpl.getAllUsers();
        model.addAttribute("users", users);
        
        return "displayStudent.jsp";
    }
 }

