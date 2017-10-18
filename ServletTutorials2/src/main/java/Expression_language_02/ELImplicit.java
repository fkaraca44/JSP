package Expression_language_02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Expression_language_01.*;

public class ELImplicit extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Employee employee = new Employee();
		employee.setName("request scope employee name");
		
		Employee employee2 = new Employee();
		employee2.setName("session scope employee name");
		
		request.setAttribute("employee", employee);
		request.setAttribute("test.attribute", employee);
		
		request.getSession().setAttribute("employee", employee2);
		
		String str1="request scope str";
		String str2="session scope str";
		String str3="context scope str";
		
		request.setAttribute("str", str1);
		request.getSession().setAttribute("str", str2);
		getServletContext().setAttribute("str", str3);
		
		
		Cookie userNameCookie = new Cookie("userName", "levent");
		response.addCookie(userNameCookie);
		
					
		RequestDispatcher view = request.getRequestDispatcher("jspExpression_02/implicitobject.jsp");
		view.forward(request, response);
	
	}

	

}
