<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%	 System.out.println("Java Fahri KARACA");
	for(int i =0; i< 5 ;i++){
		System.out.println("i:"+i);
		out.println("i:"+i);
	}
	List<String> testlist = new ArrayList<String>();
	
    
    String name = "Levent";
    int age = 24;
    out.println(name);
    out.println(age);
    %>
    

    <!--JSP Expression -->

   <%=name%>
   <%=age%>

   <br>
   <%=addNumber(5, 5)%>

   <!-- JSP Declaration -->

   <%!public int addNumber(int n1, int n2) {
      sum = n1 + n2;
      return sum;
   }

   private int sum = 0;%>

   <br>
   <%=addNumber(5, 10)%>

   <%--JSP yorum satiri --%>
	
%>




</body>
</html>