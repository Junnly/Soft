package mine.DAO;

import java.util.List;

import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegistrarDAOlmpl implements RegistrarDAO {
	private SessionFactory sessionFactory;
	
	public RegistrarDAOlmpl(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		sessionFactory = (SessionFactory) context.getBean("mysessionFactory");    		
	}
	
	public Registrar login(String username,String userpass){
		Session session=sessionFactory.openSession();   
		Registrar registrar = (Registrar)session
									.createCriteria(Registrar.class)
									.add(Restrictions.eq("RID", username))
									.add(Restrictions.eq("RPwd", userpass))
									.list().get(0);   
	    session.close();
		return registrar;
	}
	
	public void addStudent(Student student){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		System.out.println("add student");
		tx.commit();
		session.close();
		return;
	}
	public void addProfessor(Professor professor){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(professor);
		//System.out.println("add professor");
		tx.commit();
		session.close();
		return;
	}
	
	public void updateProfessor(Professor professor){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Professor professor0;
		professor0 = (Professor ) session.createCriteria(Professor.class)
		                    .add(Restrictions.eq("PID", professor.getPID())).uniqueResult();
		session.delete(professor0);
		session.save(professor);
		tx.commit();
		session.close();		
	}
	public void updateStudent(Student student){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student student0;
		student0 = (Student ) session.createCriteria(Student.class)
		                    .add(Restrictions.eq("SID", student.getSID())).uniqueResult();
		session.delete(student0);
		session.save(student);
		tx.commit();
		session.close();
	}
	
	public void delStudent(String SID){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student student;
		student = (Student ) session.createCriteria(Student.class)
		                    .add(Restrictions.eq("SID", SID)).uniqueResult();
		session.delete(student);
		tx.commit();
		session.close();		
	}
	public void delProfessor(String PID){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Professor professor;
		professor = (Professor ) session.createCriteria(Professor.class)
		                    .add(Restrictions.eq("PID", PID)).uniqueResult();
		session.delete(professor);
		tx.commit();
		session.close();		
	}
	
	public List<Student> getStudents(){
		Session session = sessionFactory.openSession();
		List<Student> list = session.createCriteria(Student.class).list();
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		session.close();
		return list;
	}
	public List<Professor> getProfessor(){
		Session session = sessionFactory.openSession();
		List<Professor> list = session.createCriteria(Professor.class).list();
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		session.close();
		return list;
	}
	
	public List<Choose> getRegisterStatus(){
		Session session = sessionFactory.openSession();
		List<Choose> list = session.createCriteria(Choose.class).list();
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		session.close();
		return list;
	}
	public void closeRegister()//set IsRegisting
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Registrar registrar;
		registrar = (Registrar ) session.createCriteria(Registrar.class)
		                    .list().get(0);
		registrar.setIsRegistering("1");
		session.save(registrar);
		tx.commit();
		session.close();		
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
