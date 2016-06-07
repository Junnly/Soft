package mine.DAO;

import java.util.List;

import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;

public interface ProfessorDAO {
	public Professor login();
	public void updateProfessor();
	public List<Course> getCatalog();
	public void selectCourse();//setCourse();
	public void submitGrade();//setChoose();
	public List<Student> getRoster();
}
