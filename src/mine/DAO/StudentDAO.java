package mine.DAO;

import java.util.List;

import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;

public interface StudentDAO {
	public Student login();
	public void updateStudent();
	public List<Course> getCatalog();
	public void chooseCourse();	//addChoose();
	public List<Choose> viewReport();//getChoose();
}
