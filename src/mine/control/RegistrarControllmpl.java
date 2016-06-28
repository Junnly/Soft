package mine.control;

import java.util.List;

import mine.DAO.RegistrarDAO;
import mine.DAO.RegistrarDAOlmpl;
import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

public class RegistrarControllmpl implements RegistrarControl{
	private RegistrarDAO registrarDAO;
	public RegistrarControllmpl(){
		registrarDAO = new RegistrarDAOlmpl(); 
	}
	public Registrar login(String username,String userpass){
		return registrarDAO.login(username, userpass);
	}
	
	public void addStudent(Student student){
		registrarDAO.addStudent(student);
	}
	public void addProfessor(Professor professor){
		registrarDAO.addProfessor(professor);
	}
	
	public void updateProfessor(Professor professor){
		registrarDAO.updateProfessor(professor);
	}
	public void updateStudent(Student student){
		registrarDAO.updateStudent(student);
	}
	
	public void delStudent(String SID){
		registrarDAO.delStudent(SID);
	}
	public void delProfessor(String PID){
		registrarDAO.delProfessor(PID);
	}
	
	public List<Student> getStudents(){
		return registrarDAO.getStudents();
	}
	public List<Professor> getProfessor(){
		return registrarDAO.getProfessor();
	}
	
	public List<Choose> getRegisterStatus(){
		return registrarDAO.getRegisterStatus();
	}
	public void closeRegister()//set IsRegisting
	{
		registrarDAO.closeRegister();
	}	
}
