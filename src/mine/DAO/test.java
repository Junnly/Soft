package mine.DAO;

import mine.table.Student;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorDAO lmpl = new ProfessorDAOlmpl();
		//RegistrarDAO lmpl = new RegistrarDAOlmpl();
		//Student student = new Student("13","4300","John","1994-12-12","in school","2017-06-02","123");
		//Professor professor = new Professor("22","45645","Penhui","1994-12-4","½²Ê¦","1","123");
		//System.out.println(professor);
		//lmpl.updateProfessor(professor);		
		//lmpl.updateStudent(student);
		//lmpl.delStudent("13");
		//lmpl.delProfessor("20");
		//lmpl.getProfessor();
		//lmpl.getStudents();
		//lmpl.getRegisterStatus();
		//lmpl.closeRegister();
		System.out.println(lmpl.login("22"));
		
	}

}
