package mine.control;

import java.util.List;

import mine.DAO.StudentDAO;
import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;

public class StudentControllmpl implements StudentControl{
	private StudentDAO studentDAO;
	public Student login(){
		return null;
		}
	public void updateStudent(){}
	public List<Course> getCatalog(){
		return null;
	}
	public void chooseCourse(){	//addChoose();
	
	}
	public List<Choose> viewReport(){//getChoose();	
		return null;
	}
	public void setSessionFactory(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
}
