package spring.task;

import java.text.ParseException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.task.model.Dates;


public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean-configuration.xml");
    	Dates date = context.getBean("dates", Dates.class);
//    	date.mDates();
    	System.out.println(date);
    }
}
