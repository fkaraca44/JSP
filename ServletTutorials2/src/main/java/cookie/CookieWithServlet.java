package cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/cookieWithServlet"})
public class CookieWithServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		
		Cookie userNameCookie = new Cookie("userName", "levent");
		Cookie passwordCookie = new Cookie("password", "123456");

		response.addHeader("Set-Cookie","testName=testValue");

		response.addCookie(userNameCookie);
		response.addCookie(passwordCookie);

		
		
	}
}
