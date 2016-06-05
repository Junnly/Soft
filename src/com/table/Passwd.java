/**
 * 
 */
package com.table;

/**
 * @author yuanzhen
 *
 */
public class Passwd {

	/**
	 * 
	 */
	public Passwd() {
		// TODO Auto-generated constructor stub
	}
	private String UserName;
	private String Pwd;
	private String Level;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPwd() {
		return Pwd;
	}
	/**
	 * @param userName
	 * @param pwd
	 * @param level
	 */
	public Passwd(String userName, String pwd, String level) {
		super();
		UserName = userName;
		Pwd = pwd;
		Level = level;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
}
