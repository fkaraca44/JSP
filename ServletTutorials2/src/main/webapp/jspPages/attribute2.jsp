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
	
		System.out.println("Page Context: " + pageContext.getAttribute("num1"));	
		System.out.println("Session GetAttribute with pageContext: " + pageContext.getAttribute("num4",PageContext.SESSION_SCOPE));	
		System.out.println(session.getAttribute("num2"));
		System.out.println(pageContext.findAttribute("num4"));	
		
		
	
	%>	
		
		
</body>	
</html>