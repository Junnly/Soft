package mine.control;

import java.util.List;

import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

public interface RegistrarControl {
	public Registrar login(String username,String userpass);
	
	public void addStudent(Student student);
	public void addProfessor(Professor professor);
	
	public void updateProfessor(Professor professor);
	public void updateStudent(Student student);
	
	public void delStudent(String SID);
	public void delProfessor(String PID);
	
	public List<Student> getStudents();
	public List<Professor> getProfessor();
	
	public List<Choose> getRegisterStatus();
	public void closeRegister();//set IsRegisting
}
