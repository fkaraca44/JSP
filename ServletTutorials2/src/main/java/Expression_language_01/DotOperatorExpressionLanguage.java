package Expression_language_01;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DotOperatorExpressionLanguage extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// . operatoru Expression Language icin kullanilabilir.
				// Bu durumda request scope a eklenen Map'e jsp dosyamizdan ulasabiliriz.
				
				Map<String, String> map = new LinkedHashMap<String, String>();
				map.put("key1", "value1");
				map.put("key2", "value2");
				map.put("key3", "value3");

				request.setAttribute("mymap", map);
				
				RequestDispatcher view = request.getRequestDispatcher("/jspExpression/dotOperatorEL.jsp");
				view.forward(request, response);


	}


}
