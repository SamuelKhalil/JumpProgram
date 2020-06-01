<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.str.cls.MyCls"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Us</title>
</head>
<body>
<%@include file="MyMenu.html" %>
<h1 class="pure-button pure-button-primary">Contact Us</h1>
	<center>
		<table class="pure-table">
			<thead>
				<tr>
					<th>#</th>
					<th>KEY</th>
					<th>VALUE</th>
				</tr>
			</thead>
			<%
				MyCls cls = new MyCls();
				HashMap<Integer, String> hm = new HashMap<>();
				hm = cls.retMap();
				Iterator it = hm.entrySet().iterator();
				int i = 0;
				while (it.hasNext()) {
					Entry en = (Entry) it.next();
					if (i % 2 == 0) {
						out.println("<tr><td><a class=\"pure-button pure-button-primary\" href=\"#\">" + i + "</a></td><td>"
								+ en.getKey() + "</td><td>" + en.getValue() + "</td></tr>");
					} else {
						out.println(
								"<tr class=\"pure-table-odd\"><td><a class=\"pure-button pure-button-primary\" href=\"#\">"
										+ i + "</a></td><td>" + en.getKey() + "</td><td>" + en.getValue() + "</td></tr>");
					}
					i++;
				}
			%>
		</table>
	</center>
</body>
</html>