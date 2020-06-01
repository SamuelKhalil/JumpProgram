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
		String a1 = request.getParameter("aa");
		String a2 = request.getParameter("ab");
		String fin = String.format("%s :User Name <br> %s is the Email For registration", a1, a2);
		out.println(fin);
	%>
	<a href="PageA.jsp">GO</a>
</body>
</html>