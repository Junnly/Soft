package mine.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mine.control.ProfessorControl;
import mine.control.ProfessorControllmpl;
import mine.table.Choose;
import mine.table.Course;
import mine.table.Professor;

import org.apache.struts2.ServletActionContext;

public class ProfessorViewlmpl implements ProfessorView {
	private ProfessorControl professorControl;
	private HttpSession session;
	Professor professor;
	private String PID;
	private String CID;
	private String SID;
	private String Grade;
	private String PSSN;
	private String PName;
	private String PBirthday;
	private String PStatus;
	private String DepartmentID;
	private String PPwd;
	private List<Course> courseloglist;
	private List<Choose> Rosterlist;
	public ProfessorViewlmpl(){
		professorControl = (ProfessorControl) new ProfessorControllmpl();
		HttpServletRequest request=ServletActionContext.getRequest();
		session=request.getSession();
		System.out.println("PID*:"+PID);
	}
	
	public String execute(){
		menu();
		return "success";
	}
	
	public String menu(){
		PID = (String)session.getAttribute("PID");
		professor = professorControl.login(PID);
		System.out.println("professor:"+professor);
		PSSN = professor.getPSSN();
		PName = professor.getPName();
		PBirthday = professor.getPBirthday();
		PStatus = professor.getPStatus();
		DepartmentID=professor.getDepartmentID();
		getCatalog();		
		return "success";
	}
	
	public String login(){
		professor = professorControl.login(PID);
		if(professor.getPPwd().equals(PPwd)){
			session.setAttribute("PID", PID);
			return "success";
		}
		else{
			System.out.println("professor pew error");
			return "error";
		}
	}
	public String updateProfessor(){
		professorControl.updateProfessor(PID, PSSN, PName, PBirthday, PStatus, DepartmentID, PPwd);
		return "success";
	}
	public String getCatalog(){
		courseloglist=professorControl.getCatalog();
		return "success";
	}
	public String  selectCourse()//setCourse();
	{
		professorControl.selectCourse(CID, PID);
		return "success";
	}
	public String submitGrade()//setChoose();
	{
		professorControl.submitGrade(SID, CID, Grade);
		return "success";
	}
	public String  getRoster(){
		Rosterlist=professorControl.getRoster(CID);
		return "success";
	}

	public void setSessionFactory(ProfessorControl professorControl) {
		this.professorControl = professorControl;
	}
	public ProfessorControl getProfessorControl() {
		return professorControl;
	}
	public void setProfessorControl(ProfessorControl professorControl) {
		this.professorControl = professorControl;
	}
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
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
	public List<Course> getCourseloglist() {
		return courseloglist;
	}
	public void setCourseloglist(List<Course> courseloglist) {
		this.courseloglist = courseloglist;
	}
	public List<Choose> getRosterlist() {
		return Rosterlist;
	}
	public void setRosterlist(List<Choose> rosterlist) {
		Rosterlist = rosterlist;
	}	
	
}
