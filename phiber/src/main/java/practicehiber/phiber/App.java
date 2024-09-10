package practicehiber.phiber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("project started");
    	
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	SessionFactory f= con.buildSessionFactory();
    	
    	
    	Session session=f.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	//creating student
    	
    	Student st=new Student();
    	st.setId(102);
    	st.setName("kiran");
    	st.setCity("chh. Sambhajinagar");
    	session.save(st);

    	
//    	System.out.println(st);
    	
    
    	
    	
    	tx.commit();
    	
    	session.close();
//    	session.getTransaction().commit();
        
    }
}
