package servlet.context.example;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.InputStream;
import java.io.PrintWriter;

import com.sun.corba.se.spi.orbutil.fsm.Input;

@WebServlet(name = "ReadingFileWithServletContext", urlPatterns = {"/ReadingFileWithServletContext"})

public class ReadingFileWithServletContext extends HttpServlet{
	
	public void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException{
	
		ServletContext context = getServletContext();
		
		InputStream txtStream = context.getResourceAsStream("/WEB-INF/Fahri.txt");
		
		int content;
		/*ServletOutputStream servletOutputStream = response.getOutputStream();
		
		while((content = txtStream.read())!=-1)
		{
			servletOutputStream.write(content);
			
		}*/
		
		PrintWriter writer = response.getWriter();
		writer.write(" "+context.getRealPath("/WEB-INF/Fahri.txt"));
		writer.write(" "+context.getContextPath()+" ");
		writer.write(" "+context.getServletContextName()+" ");
	}
	
	
	
}
