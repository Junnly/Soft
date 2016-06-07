package mine.control;

import java.util.List;

import mine.DAO.RegistrarDAO;
import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

public class RegistrarControllmpl implements RegistrarControl{
	private RegistrarDAO registrarDAO;
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

	public void setSessionFactory(RegistrarDAO registrarDAO) {
		this.registrarDAO = registrarDAO;
	}

}
