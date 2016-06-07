package com.javatpoint;

import java.util.Iterator;
import java.util.List;

import mine.table.Registrar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginDao {

	public static void main(String[] args){
		validate("1","111");
	}
	public static boolean validate(String username,String userpass){
		boolean status=false;
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		SessionFactory sfactory = (SessionFactory) context.getBean("mysessionFactory");    
		Session session=sfactory.openSession();   
		List<Registrar> registrar = (List<Registrar>)session
									.createCriteria(Registrar.class)
									.add(Restrictions.eq("RID", username))
									.add(Restrictions.eq("RPwd", userpass))
									.list();   
	    session.close();
	    if(!registrar.isEmpty()){
	    	status = true;
	    }
	    System.out.println(status);
		return status;
	}
}
