package com.gurdians;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.gurdians.beans.A;

public class Client 
{
    public static void main( String[] args )
    {
    	ClassPathResource context = new ClassPathResource("com/gurdians/resources/beans.xml");
    	XmlBeanFactory factory= new XmlBeanFactory(context);
    	
    	A a=factory.getBean(A.class);
    	System.out.println(a);
    }

	
}
