package mine.control;

import java.util.List;

import mine.DAO.ProfessorDAO;
import mine.DAO.ProfessorDAOlmpl;
import mine.table.Choose;
import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;


public class ProfessorControllmpl implements ProfessorControl{
	private ProfessorDAO professorDAO;
	public ProfessorControllmpl(){
		professorDAO=new ProfessorDAOlmpl();
	}
	public Professor login(String PID){
		return professorDAO.login(PID);
	}
	public void updateProfessor(String PID, String PSSN, String pName, String pBirthday,
			String pStatus, String departmentID, String PPwd){
		professorDAO.updateProfessor(PID, PSSN, pName, pBirthday, pStatus, departmentID, PPwd);
	}
	public List<Course> getCatalog(){
		return professorDAO.getCatalog();
	}
	public void selectCourse(String CID,String PID)//setCourse();
	{
		professorDAO.selectCourse(CID, PID);
	}
	public void submitGrade(String SID,String CID,String Grade)//setChoose();
	{
		professorDAO.submitGrade(SID, CID, Grade);
	}
	public List<Choose> getRoster(String CID){
		return professorDAO.getRoster(CID);}
	public void setSessionFactory(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}
}
