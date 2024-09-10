package springmvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springmvc.controller.User;
import springmvc.service.UserService;


public class Test {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
			ApplicationContext context= new ClassPathXmlApplicationContext("spring-servlet.xml");
			
			  UserService userService = context.getBean(UserService.class);
			Session session=factory.openSession();
			
			session.save(userService);
			Transaction tx=session.beginTransaction();
	
			tx.commit();
			session.close();
	
		factory.close();
	
	}
}
