package com.javatpoint;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class Login implements SessionAware{
private String SID,SPwd;
SessionMap<String,String> sessionmap;

public String execute(){
	if(LoginDao.validate(SID, SPwd)){
		return "success";
	}
	else{
		return "error";
	}
}

public String getSID() {
	return SID;
}

public void setSID(String sID) {
	SID = sID;
}

public String getSPwd() {
	return SPwd;
}

public void setSPwd(String sPwd) {
	SPwd = sPwd;
}

public void setSession(Map map) {
	sessionmap=(SessionMap)map;
	//sessionmap.put("login","true");
	sessionmap.put("SID",SID);
}

public String logout(){
	sessionmap.invalidate();
	return "success";
}

}
