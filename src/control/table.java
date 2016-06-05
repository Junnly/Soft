package control;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.Student;

public class table {

	/**
	 * @param args
	 */
	public String m() {
		// TODO Auto-generated method stub
		ApplicationContext context =   
		    new ClassPathXmlApplicationContext("applicationContext.xml");  
		SessionFactory sfactory = (SessionFactory) context.getBean("mysessionFactory");    
		//creating session object    
		Session session=sfactory.openSession();   
		List<Student> student = (List<Student>)session.createCriteria(Student.class).list();
		System.out.println("*9*");
	            
	    Iterator<Student> itr= student.iterator();  
	     while(itr.hasNext()){  
	     Student s=itr.next();  
	     System.out.println(s);  
	     }  	          
	    session.close();
	    return "success";
	}

}
