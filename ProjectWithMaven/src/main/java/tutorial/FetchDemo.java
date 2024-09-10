package tutorial;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tutorial.Address;
import tutorial.Students;

public class FetchDemo {
	public static void main(String[] args) {
		// gert and load method

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// get
//	Students stud =(Students) session.get(Students.class,101);
//	Students stud2 =(Students) session.get(Students.class,101);		//it hit the database when you create the object its always in ready state
//
//	System.out.println(stud);	s
//	System.out.println(stud2);

		Students stud3 = (Students) session.load(Students.class, 101);
		Students stud4 = (Students) session.load(Students.class, 101); // when you create an object its not write the
																		// select query when you try to print the data
																		// time
																		// it does

		System.out.println(stud3); // its load the data when you try to print the data
		System.out.println(stud4);

//	Address add=(Address) session.get(Address.class,3);
//	System.out.println(add.getAddressId()+"\t"+add.getStreet()+"\t"+add.getCity());

//	System.out.println(add.getStreet());

		session.close();
		factory.close();

	}
}
