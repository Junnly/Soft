package mine.view;

import java.util.List;

import mine.control.RegistrarControl;
import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

public class RegistrarViewlmpl implements RegistrarView {
	private RegistrarControl registrarControl;

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
	
	public void setSessionFactory(RegistrarControl registrarControl) {
		this.registrarControl = registrarControl;
	}

}
