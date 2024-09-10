package com.practice;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.controller.CustController;
import com.practice.model.CustDto;
import com.practice.model.CustVo;

public class App 
{
    public static void main( String[] args )
    {
    	
    	boolean flag=false;
    	ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
    	CustController controller= context.getBean(CustController.class);
    	
    	CustVo vo= new CustVo();
    	vo.setAddress("Chh. Sambhajinagar");
//    	vo.setId(1111012);
    	vo.setName("Karn");
    	vo.setSalary("944456");
    	flag= controller.registerCustomer(vo);
    	System.out.println("data inserted : "+ flag);
    	
    	
    	System.out.println("_________________________________________\n");
    	CustVo user= new CustVo();
    	user.setId(2);
    	int record = controller.deleteCustomer(user);    	
    	System.out.println("No of record Deleted : "+ record);

    	
    	System.out.println("_________________________________________\n");
    	CustVo UpUser= new CustVo();
    	UpUser.setAddress("Dharashiv");
    	UpUser.setId(1);
    	UpUser.setName("Veer");
    	UpUser.setSalary("999999");   	
    	flag= controller.updateCustomer(UpUser);
    	System.out.println("data Updated : "+ flag);
    	
    	
    	System.out.println("_________________________________________");
    	CustVo fetchData= new CustVo();
    	fetchData.setId(1);
    	ArrayList<CustDto> list =controller.fetchCustomer(fetchData);
    	System.out.println(list);
    	
    	
    	
    }
}
