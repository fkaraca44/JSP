package helloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helloservlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
		
		PrintWriter printWriter = response.getWriter();
		
		
		
		printWriter.write("<html> <body>");
		
		String Message = "<h1>Hello Servlet ! My Name is Ýlkay</h1>";
		
		printWriter.write(Message);
		printWriter.write("</body></html>");
		
		
	}
	
	
	

}
