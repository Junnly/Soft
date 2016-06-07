package mine.view;

import java.util.List;

import mine.control.ProfessorControl;
import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;

public class ProfessorViewlmpl implements ProfessorView {
	private ProfessorControl professorControl;
	
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

	public void setSessionFactory(ProfessorControl professorControl) {
		this.professorControl = professorControl;
	}	
}
