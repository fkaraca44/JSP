package Expression_language_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BracketArrayAndListEL extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String[] strArray = { "str1", "str2", "str3" };
		request.setAttribute("myArray", strArray);

		List list = new ArrayList();
		list.add("list element1");
		list.add("list element2");
		request.setAttribute("myList", list);

		RequestDispatcher view = request.getRequestDispatcher("06_EL/bracketArrayAndListEL.jsp");
		view.forward(request, response);	
		}

}
