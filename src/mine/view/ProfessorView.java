package mine.view;

import java.util.List;

import mine.table.Choose;
import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;

public interface ProfessorView {
	public String login();
	public String updateProfessor();
	public String getCatalog();
	public String selectCourse();//setCourse();
	public String submitGrade();//setChoose();
	public String getRoster();
	public String menu();
}
