package mine.DAO;

import java.util.List;

import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDAOlmpl implements StudentDAO{
	private SessionFactory sessionFactory;
	
	public StudentDAOlmpl(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		sessionFactory = (SessionFactory) context.getBean("mysessionFactory");    		
	}	
	public Student login(String SID){		
		Session session = sessionFactory.openSession();
		Student student =(Student)session.createCriteria(Student.class).add(Restrictions.eq("SID",SID)).uniqueResult();
		session.close();
		return student;
	}
	public void updateStudent(String SID,String SSSN,String SName,String SBirthday,String SStatus,String SGraduationDate,String SPwd){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student student0,student1;
		student0 = (Student ) session.createCriteria(Student.class)
		                    .add(Restrictions.eq("SID", SID)).uniqueResult();
		session.delete(student0);
		student1  = new Student(SID, SSSN, SName, SBirthday, SStatus, SGraduationDate, SPwd);
		session.save(student1);
		tx.commit();
		session.close();
	}
	public List<Course> getCatalog(){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Course> list = session.createCriteria(Course.class).list();
		tx.commit();
		session.close();
		return list;
	}
	public void chooseCourse(String SID,String CID,String Grade)	//addChoose();
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Choose choose = new Choose(SID,CID,Grade);
		session.save(choose);
		tx.commit();
		session.close();
	}
	public List<Choose> viewReport(String SID)//getChoose();
	{
		Session session = sessionFactory.openSession();
		System.out.println(SID);
		List<Choose> list = session.createCriteria(Choose.class).add(Restrictions.eq("SID",SID)).list();
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		session.close();
		return list;	
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
