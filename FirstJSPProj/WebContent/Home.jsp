<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second Home Page</title>
</head>
<body>
	<%@include file="MyMenu.html"%>
	<h1 class="pure-button pure-button-primary">Home</h1>
	<%
		ArrayList<String> list = new ArrayList<String>();
		for (int y = 0; y < 10; y++) {
			String u = "Sqrt(" + y + ")=" + Math.sqrt(y);
			list.add(u);
		}
	%>
	<center>
		<table class="pure-table">
			<thead>
				<tr>
					<th>#</th>
				</tr>
			</thead>
			<%
				for (Object a : list) {
					out.println("<tr><td>" + a + "</td></tr>");
				}
			%>
		</table>
	</center>
</body>
</html>