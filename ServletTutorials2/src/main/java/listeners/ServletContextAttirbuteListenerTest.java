package listeners;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletContextAttirbuteListenerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		getServletContext().setAttribute("name", "fahri");
		getServletContext().setAttribute("name", "bekir");
		getServletContext().setAttribute("name", "osman");
		
	}


}
