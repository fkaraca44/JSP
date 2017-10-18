package Expression_language_01;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BracketBeanAndMapEL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Department department = new Department(100, "Software Department");
		Employee employee = new Employee(1, "Levent Erguder", department);
		request.setAttribute("myemployee", employee);
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");

		request.setAttribute("mymap", map);

		RequestDispatcher view = request.getRequestDispatcher("/jspExpression/bracketBeanAndMapEL.jsp");
		view.forward(request, response);

	}


}
