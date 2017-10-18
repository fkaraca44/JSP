<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<%--[] operatoru ile array ve list elemanlarina ulasabiliriz. 
	dot operatoru ile bunu yapamayiz! --%>
	
	<%--index 0 dan baslar. 0 , "1" ya da '2' seklinde yapabiliriz. --%>
	
	${myArray[0]} 
	${myArray["1"]}
        ${myArray['2']}

	<br> 
	
	<%--list elemanlarina da array elemanlari gibi ulasabiliriz. --%>
	
	${myList[0]} 
	${myList["1"]}
	
</body>
</html>