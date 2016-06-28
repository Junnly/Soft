package mine.table;

public class Course {
	private String CID;
	private String CourseID;
	private String PID;
	private String TimeArray;
	public Course(){}
	public Course(String cID, String courseID, String pID, String timeArray) {
		super();
		CID = cID;
		CourseID = courseID;
		PID = pID;
		TimeArray = timeArray;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getCourseID() {
		return CourseID;
	}
	public void setCourseID(String courseID) {
		CourseID = courseID;
	}
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
	public String getTimeArray() {
		return TimeArray;
	}
	public void setTimeArray(String timeArray) {
		TimeArray = timeArray;
	}
	public String toString(){
		return CID+"\t"+CourseID+"\t"+PID+"\t"+TimeArray;
	}
}
