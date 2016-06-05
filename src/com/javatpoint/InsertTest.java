package com.javatpoint;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.table.Passwd;

public class InsertTest {
public static void main(String[] args) {
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	
	EmployeeDao dao=(EmployeeDao)factory.getBean("d");
	
	Employee e=new Employee();
	e.setId(147);
	e.setName("小明");
	e.setSalary(70000);
	
	//dao.saveEmployee(e);
	dao.updateEmployee(e);
	
	
	ApplicationContext context =   
	    new ClassPathXmlApplicationContext("applicationContext.xml");  
	SessionFactory sfactory = (SessionFactory) context.getBean("mysessionFactory");    
	//creating session object    
	Session session=sfactory.openSession();   
	List<Passwd> pwd = (List<Passwd>)session.createCriteria(Passwd.class).list();	            
    Iterator<Passwd> itr=pwd.iterator();  
    while(itr.hasNext()){  
    	 Passwd p=itr.next();  
    	 System.out.println(p);  		
    }
              
    session.close();  
	
}
}
