<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Bb</title>
</head>
<body>
<h1>PageBB</h1><br>
<form action="PageAA.jsp">
<input type="text" name="t2" value=""><input type="submit" value="PageAA">
<%
if(request.getParameter("t1")!=null){
	out.println(request.getParameter("t1"));
}
%>
</form>
</body>
</html>