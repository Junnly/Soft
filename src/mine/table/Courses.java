package mine.table;

public class Courses {
	private String CourseID;
	private String CourseName;
	private String Cost;
	public Courses(){}
	public Courses(String courseID, String courseName, String cost) {
		super();
		CourseID = courseID;
		CourseName = courseName;
		Cost = cost;
	}
	public String getCourseID() {
		return CourseID;
	}
	public void setCourseID(String courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCost() {
		return Cost;
	}
	public void setCost(String cost) {
		Cost = cost;
	}
}
