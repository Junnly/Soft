package mine.DAO;

import java.util.List;

import mine.table.Choose;
import mine.table.Course;
import mine.table.Professor;
import mine.table.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProfessorDAOlmpl implements ProfessorDAO {
	private SessionFactory sessionFactory;
	public ProfessorDAOlmpl(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		sessionFactory = (SessionFactory) context.getBean("mysessionFactory");    						
	}
	public Professor login(String PID){
		Session session = sessionFactory.openSession();
		Professor professor =(Professor)session.createCriteria(Professor.class).add(Restrictions.eq("PID",PID)).uniqueResult();
		session.close();
		return professor;
	}
	public void updateProfessor(String PID, String pSSN, String pName, String pBirthday,
		String pStatus, String departmentID, String PPwd){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Professor professor0,professor1;
		professor0 = (Professor)session.createCriteria(Professor.class)
		                    .add(Restrictions.eq("PID", PID)).uniqueResult();
		//session.delete(professor0);
		//professor0  = new Professor(PID, pSSN, pName, pBirthday, pStatus, departmentID, PPwd);
		professor0.setPID(PID);
		professor0.setPSSN(pSSN);
		professor0.setPName(pName);
		professor0.setPBirthday(pBirthday);
		professor0.setPStatus(pStatus);
		professor0.setDepartmentID(departmentID);
		professor0.setPPwd(PPwd);
		session.save(professor0);
		tx.commit();
		session.close();
	}
	public List<Course> getCatalog(){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Course> list = session.createCriteria(Course.class).list();
		tx.commit();
		session.close();
		return list;
	}
	public void selectCourse(String CID,String PID)//setCourse(PID);
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Course course = (Course) session.createCriteria(Course.class).add(Restrictions.eq("CID", CID))
        .uniqueResult();
		//System.out.println(course.getCourseID());
		course.setPID(PID);
		session.save(course);
		tx.commit();
		session.close();
	}
	public void submitGrade(String SID,String CID,String Grade)//setChoose();
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Choose choose0 = (Choose) session.createCriteria(Choose.class).add(Restrictions.eq("SID", SID))
        .add(Restrictions.eq("CID", CID)).uniqueResult();
		session.delete(choose0);
		Choose choose = new Choose(SID,CID,Grade);
		session.save(choose);
		tx.commit();
		session.close();
	}
	public List<Choose> getRoster(String CID){//��ʦ��ѯѡ�����
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Choose> list = session.createCriteria(Choose.class).add(Restrictions.eq("CID",CID)).list();
		tx.commit();
		session.close();
		return list;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
