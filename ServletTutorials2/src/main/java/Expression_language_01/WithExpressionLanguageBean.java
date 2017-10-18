package Expression_language_01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WithExpressionLanguageBean
 */
public class WithExpressionLanguageBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Department department = new Department(100, "Software Department");
		Employee employee = new Employee(1, "Levent Erguder", department);
		request.setAttribute("myemployee", employee);

		RequestDispatcher view = request.getRequestDispatcher("/jspExpression/withELBean.jsp");
		view.forward(request, response);
	}

	

}
