package mine.control;

import java.util.List;

import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;

public interface ProfessorControl {
	public Professor login();
	public void updateProfessor();
	public List<Course> getCatalog();
	public void selectCourse();//setCourse();
	public void submitGrade();//setChoose();
	public List<Student> getRoster();
}
