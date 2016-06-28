package mine.table;

public class CourseRecord {
	private String CID;
	private String CourseID;
	private String CourseName;
	private String PID;
	private String PName;
	private String TimeArray;
	public CourseRecord(){}
	public CourseRecord(String cID, String courseID,String courseName, String pID,String pName, String timeArray) {
		super();
		CID = cID;
		CourseID = courseID;
		CourseName=courseName;
		PID = pID;
		PName=pName;
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
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String toString(){
		return "";
	}
}
