package mine.table;

public class Student {
	private String SID;
	private String SSSN;
	private String SName;
	private String SBirthday;
	private String SStatus;
	private String SGraduationDate;
	public Student(){}
	public Student(String sID, String sSSN, String sName, String sBirthday,
			String sStatus, String sGraduationDate, String sPwd) {
		super();
		SID = sID;
		SSSN = sSSN;
		SName = sName;
		SBirthday = sBirthday;
		SStatus = sStatus;
		SGraduationDate = sGraduationDate;
		SPwd = sPwd;
	}
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getSSSN() {
		return SSSN;
	}
	public void setSSSN(String sSSN) {
		SSSN = sSSN;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSBirthday() {
		return SBirthday;
	}
	public void setSBirthday(String sBirthday) {
		SBirthday = sBirthday;
	}
	public String getSStatus() {
		return SStatus;
	}
	public void setSStatus(String sStatus) {
		SStatus = sStatus;
	}
	public String getSGraduationDate() {
		return SGraduationDate;
	}
	public void setSGraduationDate(String sGraduationDate) {
		SGraduationDate = sGraduationDate;
	}
	public String getSPwd() {
		return SPwd;
	}
	public void setSPwd(String sPwd) {
		SPwd = sPwd;
	}
	private String SPwd;
	
}
