package mine.view;

import java.util.List;

import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

public interface RegistrarView {
	public String login();
	
	public String addStudent();
	public String addProfessor();
	
	public String updateProfessor();
	public String updateStudent();
	
	public String delStudent();
	public String delProfessor();
	
	public String getStudents();
	public String getProfessor();
	
	public String getRegisterStatus();
	
	public String menu();
	
	public String closeRegister();//set IsRegisting
}
