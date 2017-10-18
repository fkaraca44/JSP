package MVC;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestAttributeServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
	   PersonPojo personPojo1 = new PersonPojo("fahri", "karaca", 1, "0535");
	   PersonPojo personPojo2 = new PersonPojo("bekir", "gungor", 2, "359");
	   PersonPojo personPojo3 = new PersonPojo("fatih", "ka", 3, "0587");
	   
	   
	   List <PersonPojo> list = new ArrayList<PersonPojo>();
	   list.add(personPojo1);
	   list.add(personPojo2);
	   list.add(personPojo3);
	   
	   request.setAttribute("personlist", list);
	   
	   RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
	   requestDispatcher.forward(request,response);
	   
	}

	

}
