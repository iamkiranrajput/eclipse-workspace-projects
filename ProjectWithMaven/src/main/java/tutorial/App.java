package tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("project started");
    	
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	SessionFactory f= con.buildSessionFactory();
    
    	
    	
    	//creating student
    	Students st=new Students(1043,"jay","vaijapur");
    	
    	
    	
    	Address ad= new Address();
    	ad.setStreet("street1");
    	ad.setCity("Delhi");
    	ad.setOpen(true);
    	ad.setAddedDate(new Date());
    	ad.setX(1234.1);
    	
    	
    	
    	FileInputStream fis= new FileInputStream("src/main/java/scorecard.png");
    	byte[ ] data=new byte[fis.available()];
    	fis.read(data);
    	ad.setImage(data);
    	
    	Session session=f.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	session.save(ad);
    	session.save(st);

       	tx.commit();
    	session.close();
//    	session.getTransaction().commit();
        
    }
}
