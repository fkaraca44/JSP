package servlet.context.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.glassfish.gmbal.ParameterNames;

public class ServletContextClass extends HttpServlet  {
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		
		ServletContext context = getServletContext();
		
		
		String emailAdress = context.getInitParameter("emailadress");
		
		Enumeration<String > parameterNames = context.getInitParameterNames();
		
		PrintWriter write = response.getWriter();
		write.write(emailAdress);
		
		while (parameterNames.hasMoreElements()) {
			write.write(" "+parameterNames.nextElement()+"");
		}
		
		write.close();
		
	}
	
	
	
}
