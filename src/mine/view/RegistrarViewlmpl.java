package mine.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mine.control.RegistrarControl;
import mine.control.RegistrarControllmpl;
import mine.table.Choose;
import mine.table.Professor;
import mine.table.Registrar;
import mine.table.Student;

import org.apache.struts2.ServletActionContext;

public class RegistrarViewlmpl implements RegistrarView {
	private RegistrarControl registrarControl;
	private HttpSession session;
	private Student student;
	private List<Student> studentlist;
	private Professor professor;
	private List<Professor> professorlist;
	private Registrar registrar;
	private Choose choose;
	private List<Choose> chooselist;
	private String RID;
	private String RPwd;
	private String SID;
	private String PID;
	//private String SID;
	private String SSSN;
	private String SName;
	private String SBirthday;
	private String SStatus;
	private String SGraduationDate;
	private String SPwd;
	//private String PID;
	private String PSSN;
	private String PName;
	private String PBirthday;
	private String PStatus;
	private String DepartmentID;
	private String PPwd;
	public RegistrarViewlmpl(){
		registrarControl = (RegistrarControl) new RegistrarControllmpl();
		HttpServletRequest request=ServletActionContext.getRequest();
		session=request.getSession();
	}	
	public String execute(){
//		login();
//		getStudents();
//		getProfessor();
//		getRegisterStatus();
		return "success";
	}
	public String menu(){
		getStudents();
		getProfessor();
		getRegisterStatus();
		return "success";
	}
	public String login(){
		registrar = registrarControl.login(RID,RPwd);
		return "success";
	}
	
	public String addStudent(){
		student = new Student(SID, SSSN, SName, SBirthday, SStatus, SGraduationDate, SPwd);
		System.out.println("new student");
		registrarControl.addStudent(student);
		System.out.println("success");
		return "success";
	}
	public String addProfessor(){
		professor = new Professor(PID, PSSN, PName, PBirthday, PStatus, DepartmentID, PPwd);
		registrarControl.addProfessor(professor);
		return "success";
	}
	
	public String updateProfessor(){
		professor = new Professor(PID, PSSN, PName, PBirthday, PStatus, DepartmentID, PPwd);
		registrarControl.updateProfessor(professor);
		return "success";
	}
	public String updateStudent(){
		student = new Student(SID, SSSN, SName, SBirthday, SStatus, SGraduationDate, SPwd);
		registrarControl.updateStudent(student);
		return "success";
	}
	
	public String delStudent(){
		System.out.println("delStudent");
		registrarControl.delStudent(SID);
		return "success";
	}
	public String delProfessor(){
		registrarControl.delProfessor(PID);
		return "success";
	}
	
	public String getStudents(){
		studentlist = registrarControl.getStudents();
		for(int i=0;i<studentlist.size();i++){
			System.out.println("*"+studentlist.get(i));
		}
		return "success";
	}
	public String getProfessor(){
		professorlist = registrarControl.getProfessor();
		return "success";
	}
	
	public String getRegisterStatus(){
		chooselist = registrarControl.getRegisterStatus();
		return "success";
	}
	public String closeRegister()//set IsRegisting
	{
		registrarControl.closeRegister();
		return "success";
	}
	
	public RegistrarControl getRegistrarControl() {
		return registrarControl;
	}

	public void setRegistrarControl(RegistrarControl registrarControl) {
		this.registrarControl = registrarControl;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudentlist() {
		return studentlist;
	}
	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}
	public List<Professor> getProfessorlist() {
		return professorlist;
	}
	public void setProfessorlist(List<Professor> professorlist) {
		this.professorlist = professorlist;
	}
	public List<Choose> getChooselist() {
		return chooselist;
	}
	public void setChooselist(List<Choose> chooselist) {
		this.chooselist = chooselist;
	}
	public Registrar getRegistrar() {
		return registrar;
	}

	public void setRegistrar(Registrar registrar) {
		this.registrar = registrar;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Choose getChoose() {
		return choose;
	}

	public void setChoose(Choose choose) {
		this.choose = choose;
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

	public String getSID() {
		return SID;
	}

	public void setSID(String sID) {
		SID = sID;
	}

	public String getPID() {
		return PID;
	}

	public void setPID(String pID) {
		PID = pID;
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
	
}
