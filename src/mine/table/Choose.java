package mine.table;

public class Choose implements java.io.Serializable{
	private String SID;
	private String CID;
	private String Grade;
	public Choose(){}
	public Choose(String sID, String cID, String grade) {
		super();
		SID = sID;
		CID = cID;
		Grade = grade;
	}
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String toString(){
		return SID+"\t"+CID+"\t"+Grade;
	}
}
