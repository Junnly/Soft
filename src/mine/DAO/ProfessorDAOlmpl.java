package mine.DAO;

import java.util.List;

import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;

import org.hibernate.SessionFactory;

public class ProfessorDAOlmpl implements ProfessorDAO {
	private SessionFactory sessionFactory;
	
	public Professor login(){
		return null;
	}
	public void updateProfessor(){
		
	}
	public List<Course> getCatalog(){
		return null;
	}
	public void selectCourse()//setCourse();
	{
		
	}
	public void submitGrade()//setChoose();
	{
		
	}
	public List<Student> getRoster(){
		return null;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}	
}
