package com.Spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.jdbc.dao.StudentDao;
import com.Spring.jdbc.entity.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDaoimpl",StudentDao.class);
        
        Student student = new Student();
        student.setId(3);
        student.setName("Vikas");
        student.setCity("Pune");
        
        int result = studentDao.insert(student);
        System.out.println("Okay");

        
    }
}
