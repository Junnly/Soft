/**
 * 
 */
package com.table;

/**
 * @author yuanzhen
 *
 */
public class Student {

	/**
	 * 
	 */
	private String Name;
	private String Birthday;
	private String SSN;
	private String GraduationDate;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){return Name+"\t"+Birthday+"\t"+SSN +"\t"+GraduationDate;}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return Birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	/**
	 * @return the sSN
	 */
	public String getSSN() {
		return SSN;
	}
	/**
	 * @param sSN the sSN to set
	 */
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	/**
	 * @return the graduationDate
	 */
	public String getGraduationDate() {
		return GraduationDate;
	}
	/**
	 * @param graduationDate the graduationDate to set
	 */
	public void setGraduationDate(String graduationDate) {
		GraduationDate = graduationDate;
	}
	/**
	 * @param name
	 * @param birthday
	 * @param sSN
	 * @param graduationDate
	 */
	public Student(String name, String birthday, String sSN,
			String graduationDate) {
		super();
		Name = name;
		Birthday = birthday;
		SSN = sSN;
		GraduationDate = graduationDate;
	}

}
