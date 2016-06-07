package mine.table;

public class Registrar {
	private String RID;
	private String RPwd;
	public Registrar(){}
	public Registrar(String rID, String rPwd) {
		super();
		RID = rID;
		RPwd = rPwd;
	}
	public String getRID() {
		return RID;
	}
	public void setRID(String rID) {
		RID = rID;
	}
	public String getRPwd() {
		return RPwd;
	}
	public void setRPwd(String rPwd) {
		RPwd = rPwd;
	}
}
