package sendReDirect;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/sendRedirectServlet"})

public class SendRedirectServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response){
		
		try {
			//response.sendRedirect("http://www.fahrikaraca.com");
			response.sendRedirect("index.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
		System.err.println("Eror:"+e);
		}
		
	}
	
}
