package com.Spring.jdbc.dao;

import com.Spring.jdbc.entity.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);

}
