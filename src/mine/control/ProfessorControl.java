package mine.control;

import java.util.List;

import mine.table.Choose;
import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;

public interface ProfessorControl {
	public Professor login(String PID);
	public void updateProfessor(String PID, String PSSN, String pName, String pBirthday,
			String pStatus, String departmentID, String PPwd);
	public List<Course> getCatalog();
	public void selectCourse(String CID,String PID);//setCourse();
	public void submitGrade(String SID,String CID,String Grade);//setChoose();
	public List<Choose> getRoster(String CID);
}
