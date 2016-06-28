package mine.view;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mine.control.StudentControl;
import mine.control.StudentControllmpl;
import mine.table.Choose;
import mine.table.Course;
import mine.table.Student;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionSupport;

public class StudentViewlmpl extends ActionSupport implements StudentView {
	private StudentControl studentControl;
	private HttpSession session;
	private String SID;
	private String SSSN;
	private String SName;
	private String SBirthday;
	private String SStatus;
	private String SGraduationDate;
	private String SPwd;
	private String CID;
	private String Grade;
	private Student student;
	private List<Course> courselist;
	private List<Choose> chooselist;
	private List<String> courseRecordList;
	public String getCourseRecords(){
		System.out.println("sview");
		menu();
		getCatalog();
		viewReport();
		for(int i=0;i<courselist.size();i++){
			System.out.println(courselist.get(i));
		}
		for(int i=0;i<chooselist.size();i++){
			System.out.println(chooselist.get(i));
		}
		courseRecordList=new LinkedList<String>();
		List<String> tempList=new LinkedList<String>();
		for(int i=0;i<chooselist.size();i++){
			String ccid=chooselist.get(i).getCID();
			for(int j=0;j<courselist.size();j++){
				if(ccid.equals(courselist.get(j).getCID())){
					tempList.add(courselist.get(j).getTimeArray());
					break;
				}
			}
		}
		char []temp=new char[77];
		for(int j=0;j<77;j++){temp[j]='0';}
		for(int i=0;i<tempList.size();i++){
			for(int j=0;j<77;j++){
				if(tempList.get(i).charAt(j)=='1'){
					temp[j]='1';
				}
			}
		}
		courseRecordList.add(new String(temp));
		System.out.println("fsfsfsdfsdfds");
		System.out.println(SID);
		System.out.println(courseRecordList.size());
		for(int i=0;i<courseRecordList.size();i++){
			System.out.println(courseRecordList.get(i));
		}
		return "success";
	}
	public StudentViewlmpl(){
		studentControl = (StudentControl) new StudentControllmpl();
		HttpServletRequest request=ServletActionContext.getRequest();
		session=request.getSession();
	}
	
	
	
	
	
	public String execute(){
//			login();
//			SSSN = student.getSSSN();
//			SName = student.getSName();
//			SBirthday = student.getSBirthday();
//			SStatus = student.getSStatus();
//			SGraduationDate = student.getSGraduationDate();
//			getCatalog();
//			viewReport();
			return "success";
	}
	public String menu(){
		System.out.println("++");
		SID = (String)session.getAttribute("SID");
		System.out.println(SID+"____+++");
		student = studentControl.login(SID);
		SSSN = student.getSSSN();
		SName = student.getSName();
		SBirthday = student.getSBirthday();
		SStatus = student.getSStatus();
		SGraduationDate = student.getSGraduationDate();
		getCatalog();
		viewReport();
		return "success";		
	}
	public String login(){
		System.out.println("SID:"+SID+";");
		student = studentControl.login(SID);
		if(student.getSPwd().equals(SPwd)){
			session.setAttribute("SID", SID);
			return "success";	
		}else{
			return "error";
		}
	}
	public String updateStudent(){
		studentControl.updateStudent(SID, SSSN, SName, SBirthday, SStatus, SGraduationDate, SPwd);
		return "success";
	}
	public String getCatalog(){
		courselist =  studentControl.getCatalog();
		return "success";
	}
	public String chooseCourse()	//addChoose();
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		SID =request.getParameter("SID");
		CID =request.getParameter("CID");		
		Grade ="0";
		try{
		studentControl.chooseCourse(SID, CID, Grade);
		}catch(Exception e){
			System.out.println("choose Course error;");
		}
		execute();
		return "success";
	}
	public String viewReport()//getChoose();
	{
		System.out.println("SID:"+SID);
		chooselist =  studentControl.viewReport(SID);	
		return "success";
	}
	public StudentControl getStudentControl() {
		return studentControl;
	}
	public void setStudentControl(StudentControl studentControl) {
		this.studentControl = studentControl;
	}
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
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
	public List<Course> getCourselist() {
		return courselist;
	}
	public void setCourselist(List<Course> courselist) {
		this.courselist = courselist;
	}
	public List<Choose> getChooselist() {
		return chooselist;
	}
	public void setChooselist(List<Choose> chooselist) {
		this.chooselist = chooselist;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<String> getCourseRecordList() {
		return courseRecordList;
	}
	public void setCourseRecordList(List<String> courseRecordList) {
		this.courseRecordList = courseRecordList;
	}
	
	
}
