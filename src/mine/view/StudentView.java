package mine.view;

import java.util.List;

import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;

public interface StudentView {
	public String login();
	public String updateStudent();
	public String getCatalog();
	public String chooseCourse();	//addChoose();
	public String viewReport();//getChoose();
	public String menu();
}
