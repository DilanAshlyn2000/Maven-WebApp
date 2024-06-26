package com.chainsys.demo1.StudentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chainsys.demo1.model.Student;
import com.chainsys.mapper.StudentMapper;

@Repository
public class StudentImp {

@Autowired	
JdbcTemplate jdbcTemplate;
StudentMapper mapper;
    
    public void insertUser(Student user) {
        String save="insert into users(name, grade) values (?, ?)";
        Object[] params= {user.getName(), user.getGrade()};
       jdbcTemplate.update(save, params);
       
    }
    public List<Student> getAllUsers()
    {
        String select="select id,name,grade from users";
        List<Student> userList=jdbcTemplate.query(select, new StudentMapper());
        System.out.println(userList);
        return userList;
    }
    public void update(Student user)
    {
        String update = "update users set grade=? where id=?";
        Object[] id = {user.getGrade(), user.getId()};
        jdbcTemplate.update(update, id);            
    }
    public void delete(Student user) 
    {
        String delete = "delete from users where id=?";
        Object[] params = {user.getId()};
        
        jdbcTemplate.update(delete, params);
        
    }
}

