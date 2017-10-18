package request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="MoreRequestMethods",urlPatterns={"/moreRequestMethods"})
public class MoreRequestMethods extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		PrintWriter writer = response.getWriter();
		
		writer.write("<html><body>");
		
		String serverName= request.getServerName();
		String hostHeaderInfo = request.getHeader("host");
		int localport = request.getLocalPort();
		int serverPort = request.getServerPort();
		int remotePort = request.getRemotePort();
		String method = request.getMethod();
		String contextPath = request.getContextPath();
		
		Enumeration<String> headerNames = request.getHeaderNames();
		
		
		writer.write(serverName+"<br/>");
		writer.write(hostHeaderInfo+"<br/>");
		writer.write(serverPort+"<br/>");
		writer.write(localport+"<br/>");
		writer.write(remotePort+"<br/>");
		writer.write(method+"<br/>");
		writer.write(contextPath+"<br/>");

		
		
		writer.write("</body></html>");

		while (headerNames.hasMoreElements()) {
			String string = (String) headerNames.nextElement();
			writer.write(string + "<br/>");
			
		}
		writer.close();
	}
	
	
}
