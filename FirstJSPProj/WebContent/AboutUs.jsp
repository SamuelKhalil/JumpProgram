<%@page import="java.util.Arrays"%>
<%@page import="com.str.cls.MyCls"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About Page</title>
</head>
<body>
	<%@include file="MyMenu.html"%>
	<h1 class="pure-button pure-button-primary">About us</h1>
	<center>
		<table class="pure-table">
			<thead>
				<tr>
					<th>#</th>
				</tr>
			</thead>
			<%
				MyCls cls = new MyCls();
				String[] u = cls.retStr().replace('[', ' ').replace(']', ' ').split(",");
				for (String y : u) {
					out.println("<tr><td><mark>" + y + "</mark></td></tr>");
				}
			%>
		</table>
	</center>
</body>
</html>