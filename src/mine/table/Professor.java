package mine.table;

public class Professor {
	private String PID;
	private String PSSN;
	private String PName;
	private String PBirthday;
	public Professor(){}
	public Professor(String pID, String pSSN, String pName, String pBirthday,
			String pStatus, String departmentID, String pPwd) {
		super();
		PID = pID;
		PSSN = pSSN;
		PName = pName;
		PBirthday = pBirthday;
		PStatus = pStatus;
		DepartmentID = departmentID;
		PPwd = pPwd;
	}
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
	public String getPSSN() {
		return PSSN;
	}
	public void setPSSN(String pSSN) {
		PSSN = pSSN;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getPBirthday() {
		return PBirthday;
	}
	public void setPBirthday(String pBirthday) {
		PBirthday = pBirthday;
	}
	public String getPStatus() {
		return PStatus;
	}
	public void setPStatus(String pStatus) {
		PStatus = pStatus;
	}
	public String getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(String departmentID) {
		DepartmentID = departmentID;
	}
	public String getPPwd() {
		return PPwd;
	}
	public void setPPwd(String pPwd) {
		PPwd = pPwd;
	}
	private String PStatus;
	private String DepartmentID;
	private String PPwd;
}
