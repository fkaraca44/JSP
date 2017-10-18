<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%--tek tirnak ya da cift tirnak kullanilabilir ! --%>
		${myemployee["empId"]} 
		${myemployee['name']}
		${myemployee['department']["departmentId"]}
		${myemployee["department"]["departmentName"]}
		
		<%--
			yukaridaki ifaleler nokta(dot) operatoru ile su ifadelere karsilik gelmektedir. 
			
			${myemployee.empId} 
			${myemployee.name}
			${myemployee.department.departmentName }
			${myemployee.department.departmentId }
		
		 --%>
		
		
		<br/>
		
		${mymap["key1"]}
		${mymap["key2"]}
		${mymap["key3"]}
		
		<%--
		    yukaridaki mymap ifadeleri nokta(dot) operatoru ile su ifadelere karsilik gelmektedir.
			
		    ${mymap.key1}
		    ${mymap.key2} 
		    ${mymap.key3}
		
		 --%>
			
</body>
</html>