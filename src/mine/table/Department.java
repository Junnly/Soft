package mine.table;

public class Department {
	private String DepartmentID;
	private String DepartmentName;
	public Department(){}
	public Department(String departmentID, String departmentName) {
		super();
		DepartmentID = departmentID;
		DepartmentName = departmentName;
	}
	public String getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(String departmentID) {
		DepartmentID = departmentID;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String toString(){
		return DepartmentID+"\t"+DepartmentName;
	}
}
