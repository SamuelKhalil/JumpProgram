<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page2</title>
</head>
<body>
	<%
		Enumeration emr = request.getHeaderNames();//KEYS
		while (emr.hasMoreElements()) {
			String j = emr.nextElement().toString();
			if (j.equals("user-agent")) {
				//out.println(j+"&nbsp;&nbsp;"+request.getHeader(j));
				String he = request.getHeader(j);
				//Netscape navigator
				if (he.indexOf("Chrome/81.0.4044.138") > 0) {
					out.println("<font color=blue>This is Chrome</font>");
				} else if (he.indexOf("Firefox") > 0) {
					out.println("<font color=red>This is Firefox</font>");
				} else if (he.indexOf("Edge") > 0) {
					out.println("<font color=green>This is Edge</font>");
				} else {
					out.print("Some other Browser");
				}
			}
		}
	%>
</body>
</html>