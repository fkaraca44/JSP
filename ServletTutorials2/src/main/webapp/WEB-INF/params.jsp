<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<jsp:useBean id="person" class ="usebean_02.Person" scope="request">
		<jsp:setProperty name="person" property="name" value='<%=request.getParameter("firstName") %>'/>
		<jsp:setProperty name="person" property="surname" value='<%=request.getParameter("lastName") %>'/>
		<jsp:setProperty name="person" property="age" value='<%=Integer.parseInt(request.getParameter("age")) %>'/>
	</jsp:useBean>
	
	<jsp:getProperty property="name" name="person"/>
	<jsp:getProperty property="surname" name="person"/>
	<jsp:getProperty property="age" name="person"/>
	

</body>
</html>