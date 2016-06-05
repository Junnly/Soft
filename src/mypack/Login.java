package mypack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.Passwd;


public class Login {
private String userName,Password;

public String getPassword() {
	return Password;
}

public void setPassword(String pwd) {
	this.Password= pwd;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String execute(){
	ApplicationContext context =   
	    new ClassPathXmlApplicationContext("applicationContext.xml");  
	SessionFactory sfactory = (SessionFactory) context.getBean("mysessionFactory");    
	//creating session object    
	Session session=sfactory.openSession();   
	List<Passwd> pwd = (List<Passwd>)session.createCriteria(Passwd.class).list();	            
    Iterator<Passwd> itr=pwd.iterator();    
    Passwd p=itr.next();    		
    session.close();
    if(p.getPwd().equals(Password)){
    	System.out.println("正确:"+p.getPwd());
    	return "success";
    }else{
    	System.out.println("错误:"+Password+"|"+p.getPwd());
    	return "fail";
    }          
	}
}