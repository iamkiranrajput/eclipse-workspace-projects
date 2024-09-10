package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("program started");
//    		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    		ApplicationContext context =new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
    	JdbcTemplate j= context.getBean("jdbcTemplate",JdbcTemplate.class);
    		StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
    		
//    		Student student=new Student();
//    		student.setCity("vaijapur");
//    		student.setId(131);
//    		student.setName("dev");
//    		int i = studentDao.insert(student);
//    		System.out.println("student added : "+i);
    		
//    		Student student =new Student();
//    		student.setCity("jaypur");
//    		student.setName("rajarao");
//    		student.setId(111);
//    		int r=studentDao.change(student);
//    		System.out.println(r);
    		
//    		this is not recommnded way
//    		String query="insert into student(id,name,city) values(?,?,?)";
//    		int result = j.update(query,256,"veer kumar", "jaipur");
//    		System.out.println("Number of record inserted : "+result);
    		
    		
//    		Student student =new Student();
//    		Scanner sc=new Scanner(System.in);
//    		System.out.println("enter id which data do you want to delete id:");
//    		student.setId(sc.nextInt());
//    		int r=studentDao.delete(student);
//    		System.out.println("deleted"+r);
    		
    		
//    		Student student=studentDao.getStudent(256);
//    		System.out.println(student);
    		
    		List<Student> student=studentDao.getAllStudents();
    		System.out.println(student);
//    		System.out.println(student);
    }
}
