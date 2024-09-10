package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
    	Student student= new Student(121,"Kiran Rajput","Vaijapur");
    	int i =studentDao.insert(student);
    	System.out.println(i);
    }
}
