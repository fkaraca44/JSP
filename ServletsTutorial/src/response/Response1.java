package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/response1"})

public class Response1 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request ,HttpServletResponse response)
	{
		try {
			//response.setCharacterEncoding("ISO-8859-9");
			//response.setContentType("text/html;charset=ISO-8859-9");
			response.setContentType("text/html;charset=UTF-8");

			PrintWriter writer = response.getWriter();
			writer.write("<html>");
			writer.write("<head><meta charset='UTF-8'></head>");
			writer.write("<body>");
			writer.write("akkuþ,keþtemur");
			writer.write("</body></html>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// content-type : text/html , application/pdf/ image/jpeg,
			System.out.println("Hata " + e);
		}
		
		
	}
	
	
}
