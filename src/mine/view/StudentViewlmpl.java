package mine.view;

import java.util.List;

import mine.control.StudentControl;
import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;

public class StudentViewlmpl implements StudentView{
	private StudentControl studentControl;
	
	public Student login(){
		return null;
	}
	public void updateStudent(){
		
	}
	public List<Course> getCatalog(){
		return null;
	}
	public void chooseCourse()	//addChoose();
	{
		
	}
	public List<Choose> viewReport()//getChoose();
	{
		return null;	
	}

	public void setSessionFactory(StudentControl studentControl) {
		this.studentControl = studentControl;
	}

}
