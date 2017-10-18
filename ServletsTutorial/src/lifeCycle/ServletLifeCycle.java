package lifeCycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.HttpResponse;



@WebServlet("/lifeCycyle")

public class ServletLifeCycle extends HttpServlet{
	
	@Override
	public void init(){
		System.out.println("Ýnit metodu cagrýldý");
	}
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse  response)throws IOException{
		PrintWriter writer = response.getWriter();
		writer.write("Yasam Döngüsü");
		
	}
	
	@Override
	public void destroy(){
		System.out.println("Servlet destroy edildi.");
	}
	
	
	
	
	
}
