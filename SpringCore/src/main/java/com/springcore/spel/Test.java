package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.mysql.cj.xdevapi.Expression;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo d= context.getBean("demo", Demo.class);
		System.out.println(d);
		
		
//	SpelExpressionParser temp = new SpelExpressionParser();
//	   org.springframework.expression.Expression ex = temp.parseExpression("#{1+34-34}");
//		System.out.println(ex.getExpressionString());
	}
}
