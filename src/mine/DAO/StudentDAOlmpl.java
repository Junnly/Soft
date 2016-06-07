package mine.DAO;

import java.util.List;

import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;

import org.hibernate.SessionFactory;

public class StudentDAOlmpl implements StudentDAO{
	private SessionFactory sessionFactory;
	
	public Student login(){
		return null;
	}
	public void updateStudent(){
		
	}
	public List<Course> getCatalog(){
		return null;
	}
	public void chooseCourse()	//addChoose();
	{
		
	}
	public List<Choose> viewReport()//getChoose();
	{
		return null;	
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
