<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	List<String> ls = new ArrayList();
	for (int i = 10; i < 101; i += 10) {
		ls.add(String.valueOf(i));
	}
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>

	<%
		int i = 0;
		for (String j : ls) {
			if (i % 2 == 0) {
				out.println("<a class=\"btn-floating btn-large cyan pulse\"><i class=\"material-icons\">" + j
						+ "</i></a>Person ID<br><hr><br>");
			} else {
				out.println("<a class=\"btn-floating pulse\"><i class=\"material-icons\">" + j
						+ "</i></a>Person ID<br><hr><br>");
			}
			i++;
		}
	%>



</body>
</html>