package mine.DAO;

import java.util.List;

import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

import org.hibernate.SessionFactory;

public class RegistrarDAOlmpl implements RegistrarDAO {
	private SessionFactory sessionFactory;

	public Registrar login(){
		return null;
	}
	
	public void addStudent(){
		
	}
	public void addProfessor(){
		
	}
	
	public void updateProfessor(){
		
	}
	public void updateStudent(){
		
	}
	
	public void delStudent(){
		
	}
	public void delProfessor(){
		
	}
	
	public List<Student> getStudents(){
		return null;
	}
	public List<Professor> getProfessor(){
		return null;
	}
	
	public List<Choose> getRegisterStatus(){
		return null;
	}
	public void closeRegister()//set IsRegisting
	{
		
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
