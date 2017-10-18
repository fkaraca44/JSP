package servletConfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name ="›nitParamsWithNotation" , urlPatterns = {"/initParamsWithNotation"},
		initParams={@WebInitParam(name = "fahrihoca",value="FahriKARACA"),
					@WebInitParam(name = "karaca",value="karaca44")})
public class ›nitParamsWithNotation extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException{
		PrintWriter writer = response.getWriter();
		ServletConfig config = getServletConfig();
		Enumeration<String> initParameterList = config.getInitParameterNames();
			
		while (initParameterList.hasMoreElements()) {
			String string = (String) initParameterList.nextElement();
			writer.write(" "+string+ " ");
		}
		
		writer.write(config.getInitParameter("fahrihoca"));
		writer.write(config.getInitParameter("karaca"));
		
		
	}
	
}
