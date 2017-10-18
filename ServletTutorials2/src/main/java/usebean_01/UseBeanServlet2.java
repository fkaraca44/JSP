package usebean_01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UseBeanServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person2 person = new Myperson(23,"fahri","karaca",1);
		request.setAttribute("myperson", person);
		RequestDispatcher view = request.getRequestDispatcher("/jspUsebean/jspUsebeanExample.jsp");
		view.forward(request, response);
	}

	

}
