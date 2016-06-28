package mine.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;



public class LogOut {
	private HttpSession session;
	public String execute(){
		HttpServletRequest request=ServletActionContext.getRequest();
		session=request.getSession();
		//System.out.println(session.getAttribute("PID"));
		//System.out.println(session);
		session.invalidate();
		//System.out.println(session);
		//System.out.println(session.getAttribute("PID"));
		return "success";
	}
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}

	
}
