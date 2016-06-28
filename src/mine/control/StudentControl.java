package mine.control;

import java.util.List;

import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;

public interface StudentControl {
	public Student login(String SID);
	public void updateStudent(String SID,String SSSN,String SName,String SBirthday,String SStatus,String SGraduationDate,String SPwd);
	public List<Course> getCatalog();
	public void chooseCourse(String SID,String CID,String Grade);	//addChoose();
	public List<Choose> viewReport(String SID);//getChoose();
}
