package com.chainsys.demo1.StudentDao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chainsys.demo1.model.Student;
import com.chainsys.mapper.StudentMapper;

@Repository
public class StudentImp implements StudentDao {

@Autowired	
JdbcTemplate jdbcTemplate;
StudentMapper mapper;  

/*
 * public void insertUser(Student user) { String
 * save="insert into users(name, grade) values (?, ?)"; Object[] params=
 * {user.getName(), user.getGrade()}; jdbcTemplate.update(save, params);
 * 
 * }
 */
public void insertUser(Student user) {
    String checkIfExistsQuery = "SELECT COUNT(*) FROM users WHERE name = ?";
    String insertQuery = "INSERT INTO users (name, grade) VALUES (?, ?)";

    int count = jdbcTemplate.queryForObject(checkIfExistsQuery, Integer.class, user.getName());

    if (count == 0) {
        Object[] params = { user.getName(), user.getGrade() };
        jdbcTemplate.update(insertQuery, params);
        System.out.println("User inserted successfully.");
    }
    else 
    {
        System.out.println("User with name " + user.getName() + " already exists.");
    }
}
    public List<Student> getAllUsers()
    {
        String select="select id,name,grade from users where status=0";
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
        String delete = "update users set status=1 where id=?";
        Object[] params = {user.getId()};
        
        jdbcTemplate.update(delete, params);
        
    }
	/*
	 * public List<Student> search(Student user) { String
	 * search="select id,name,grade from users where name =? and status=0 ";
	 * Object[] name = {user.getName()}; List<Student>
	 * userList=jdbcTemplate.query(search,new StudentMapper(),name); return
	 * userList;
	 * 
	 * }
	 */
    public List<Student> search(String name) 
    {
        String retrive = String.format 
                (
                    "SELECT id,name,grade FROM users " +
                    "WHERE (name LIKE '%%%s%%' OR grade LIKE '%%%s%%' OR id LIKE '%%%s%%') " +
                    "AND status=0",
                    name, name,name
                );
                return jdbcTemplate.query(retrive, new StudentMapper());        
    }
   
}

