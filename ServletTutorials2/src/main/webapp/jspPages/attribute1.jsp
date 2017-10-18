<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%	
	Integer num1=1;
	Integer num2=2;
	Integer num3=3;
	Integer num4=4;
	Integer num5=5;
	
	pageContext.setAttribute("num1", num1);
	pageContext.setAttribute("num2", num2, PageContext.SESSION_SCOPE);
	pageContext.setAttribute("num2", num2, PageContext.APPLICATION_SCOPE);
	
	session.setAttribute("num4", num4);
	application.setAttribute("num5", num5);
	
	System.out.println("Page context "+pageContext.getAttribute("num1"));
	System.out.println("Session GetAttribute "+pageContext.getAttribute("num4",pageContext.SESSION_SCOPE));
	System.out.println(session.getAttribute("num2"));

	System.out.println(pageContext.findAttribute("num4"));

%>
	
</body>
</html>