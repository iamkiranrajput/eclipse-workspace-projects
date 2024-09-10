package spring.task.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value=true)
//@PropertySource("classpath:spring/task/data.properties")
public class Dates {
//	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    @Value("${date.mydate}")
//    private String sDate;
	
	
    @Autowired
    private Date dynamicDate;

//    @Value("#{new java.util.Date()}")
//    private Date currentDate;
    
//    public void mDates() throws ParseException {
//    	dynamicDate = dateFormat.parse(sDate);
//    }
    
//    public Dates() {
//    	System.out.println("bean loaded" + this.hashCode());
//    }
    
	public String toString() {
		return "Dates [dynamicDate=" + dynamicDate
				+ "]";
	}
}
