package mine.control;

import java.util.List;

import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

public interface RegistrarControl {
	public Registrar login();
	
	public void addStudent();
	public void addProfessor();
	
	public void updateProfessor();
	public void updateStudent();
	
	public void delStudent();
	public void delProfessor();
	
	public List<Student> getStudents();
	public List<Professor> getProfessor();
	
	public List<Choose> getRegisterStatus();
	public void closeRegister();//set IsRegisting
}
