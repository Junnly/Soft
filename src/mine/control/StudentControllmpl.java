package mine.control;

import java.util.List;

import mine.DAO.StudentDAO;
import mine.DAO.StudentDAOlmpl;
import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;

public class StudentControllmpl implements StudentControl{
	private StudentDAO studentDAO ;
	public StudentControllmpl(){
		studentDAO = (StudentDAO) new StudentDAOlmpl();
	}

	public Student login(String SID){
		return studentDAO.login(SID);
	}
	public void updateStudent(String SID,String SSSN,String SName,String SBirthday,String SStatus,String SGraduationDate,String SPwd){
		studentDAO.updateStudent(SID, SSSN, SName, SBirthday, SStatus, SGraduationDate, SPwd);
	}
	public List<Course> getCatalog(){
		return studentDAO.getCatalog();
	}
	public void chooseCourse(String SID,String CID,String Grade){	//addChoose();
		studentDAO.chooseCourse(SID, CID, Grade);
	}
	public List<Choose> viewReport(String SID){//getChoose();	
		return studentDAO.viewReport(SID);
	}
}
