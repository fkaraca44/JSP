<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="Expression_language_01.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--Employee sinifinda Department tipinde instance variable yer almaktadir. (Employee HAS-A Department)
		departmentId ve departmentName alanlarina ulasmak icin request scope'tan myemployee objesini aldik.
	  -->
	  
	<%=((Employee) request.getAttribute("myemployee")).getDepartment().getDepartmentId()%>
	<%=((Employee) request.getAttribute("myemployee")).getDepartment().getDepartmentName()%>
	
	<!-- jsp:useBean ile Employee icerisinden department uzerinden Department beane ulasamayiz!
		jsp:useBean action'i bu konuda yetersiz kalmaktadir. 
	  -->
	 <jsp:useBean id="myemployee"
		class="Expression_language_01.Employee" scope="request">
	</jsp:useBean>

	<jsp:getProperty property="department" name="myemployee" /> 
	
</body>
</html>