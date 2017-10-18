package servletConfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigClass
 */
@WebServlet("/ServletConfigClass")
public class ServletConfigClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config = getServletConfig();
		response.getWriter().write(config.getInitParameter("Fahrikaraca"));
		response.getWriter().write(config.getInitParameter("karaca"));
		response.getWriter().write("Servlet Adi : "+config.getServletName());

		 
		
	}

	

}
