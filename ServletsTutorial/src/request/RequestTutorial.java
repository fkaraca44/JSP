package request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="RequestTutorial",urlPatterns={"/requestTutorial"})
public class RequestTutorial extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException{
		
		PrintWriter writer = response.getWriter();
		
		
		writer.write(request.getParameter("firstName"));
		writer.write(request.getParameter("surName"));
		writer.write(request.getParameter("marialStatus"));
	
		// checkbox da dizi kullanmak gerekiyor.
		
		String [] parameters = request.getParameterValues("progLang");
		for (int i = 0; i < parameters.length; i++) {
			writer.write(" "+parameters[i]+"");
		}
		
		Map<String, String[]> parameterMap = request.getParameterMap();

		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey() + " " + Arrays.asList(entry.getValue()));
		}
	}
	
}
