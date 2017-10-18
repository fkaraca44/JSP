package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class URLRewritingTest
 */
public class URLRewritingTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.setAttribute("name", "fahri");
		PrintWriter writer = response.getWriter();
		String url = "GetSessionAttribute;jessionid="+request.getSession().getId();
		
		writer.write("<html><head><title>URLRewritingTest</title></head>");
		writer.write("<body> GÝRÝÞ - <a href =\""+url+"\">Buraya Tikla </a>");
		writer.write("</body></html>");
		writer.close();
	}


}
