package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/SessionTimeOutExample"})
public class SessionTimeOutExample extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		Integer accesCount = (Integer)session.getAttribute("accesCount");
		if(accesCount==null){
			accesCount=1;
		}else{
			accesCount++;
		}
		session.setAttribute("accesCount", accesCount);
		String id = session.getId();
		Date creationTime = new Date(session.getCreationTime());
		Date lastAccessedTime = new Date(session.getLastAccessedTime());
		int maxInactiveInterval = session.getMaxInactiveInterval();
		session.setMaxInactiveInterval(10);
		int updateMax = session.getMaxInactiveInterval();
		session.setAttribute("name", "ilkay gunel");
		
		PrintWriter writer = response.getWriter();
		writer.println("Session ID"+id);
		writer.println("Creatþýb Time "+creationTime);
		writer.println("Last Accessed Time "+lastAccessedTime);
		writer.println("Default Max Ýnactive Internal"+maxInactiveInterval);
		writer.println("Updated MAx inactive Ýnternal "+updateMax);
		writer.println("Acces count "+accesCount);
		//Session kapatýr otomatik
		session.invalidate();
		
	}
	
}
