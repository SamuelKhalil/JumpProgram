<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page B</title>
</head>
<body>
	<small>The Data Received from the other page is:</small>
	<br>
	<%
		String a1 = request.getParameter("uname");
		String a2 = request.getParameter("email");
		String fin = String.format("%s :User Name <br> %s is the Email For registration", a1, a2);
		out.println(fin);
	%>
	<form method="post" action="PageC.jsp">
		<input type="text" style="visibility: hidden;" name="aa"
			value="<%=a1%>"> <input type="text"
			style="visibility: hidden;" name="ab" value="<%=a2%>"> <input
			type="submit" value="GO">
	</form>
</body>
</html>