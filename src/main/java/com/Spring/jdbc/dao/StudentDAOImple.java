package com.Spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.jdbc.entity.Student;

public class StudentDAOImple implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	
	public int insert(Student student) {
       
		return 0;
	}

	public int change(Student student) {
		//Update data
		String query = "update student set name=? ,city=? where id=? ";
		this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return 0;
	}

}
