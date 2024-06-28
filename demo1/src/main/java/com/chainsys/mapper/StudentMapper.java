package com.chainsys.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chainsys.demo1.model.Student;
public class StudentMapper  implements RowMapper <Student>{
	@Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
    {
        Student user=new Student();
        int id=rs.getInt(1);
        String name=rs.getString(2);
       int grade=rs.getInt(3);  
        user.setId(id);
        user.setName(name);
        user.setGrade(grade);
        return user;
     }
}



