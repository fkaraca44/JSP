<%@page import="usebean_01.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="myperson" class="usebean_01.Person" scope="request"></jsp:useBean>
<jsp:getProperty property="name" name="myperson"/>
<jsp:getProperty property="surname" name="myperson"/>
<jsp:getProperty property="age" name="myperson"/>

<jsp:useBean id="thereIsNoBean" class="usebean_01.Person" scope="request"></jsp:useBean>
<jsp:setProperty property="name" name="thereIsNoBean" value="Bekir"/>
<jsp:setProperty property="surname" name="thereIsNoBean" value="G�ng�r" />
<jsp:setProperty property="age" name="thereIsNoBean" value="23" />

<jsp:getProperty property="name" name="thereIsNoBean"/>
<jsp:getProperty property="surname" name="thereIsNoBean"/>
<jsp:getProperty property="age" name="thereIsNoBean"/>



<%-- <% Person person = (Person) request.getAttribute("myperson"); %>
	<%=person.getName() %>
	<%=person.getSurname() %>
	<%=person.getAge() %>
--%>
	
	
	
	
	
</body>
</html>