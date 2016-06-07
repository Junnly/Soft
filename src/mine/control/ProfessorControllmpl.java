package mine.control;

import java.util.List;

import mine.DAO.ProfessorDAO;
import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;


public class ProfessorControllmpl implements ProfessorControl{
	private ProfessorDAO professorDAO;
	public Professor login(){
		return null;
	}
	public void updateProfessor(){}
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
		return null;}
	public void setSessionFactory(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}
}
