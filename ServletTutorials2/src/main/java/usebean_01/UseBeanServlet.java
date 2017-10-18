package usebean_01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/UseBeanServlet"})
public class UseBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person person = new Person(23,"fahri","karaca");
		request.setAttribute("myperson", person);
		RequestDispatcher view = request.getRequestDispatcher("/jspUsebean/jspUsebeanExample.jsp");
		view.forward(request, response);
	}	


}
