<%@page import="java.util.Set"%>
<%@page import="com.str.cls.MyCls"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Projects</title>
</head>
<body>
<%@include file="MyMenu.html" %>
<h1 class="pure-button pure-button-primary">Projects</h1>
<center>
<table class="pure-table">
			<thead>
				<tr>
					<th>#</th>
				</tr>
			</thead>
			<%
			MyCls cc=new MyCls();
			Set<String> set=cc.retSet();
			for(Object a:set){
				out.println("<tr><td>"+a+"</td></tr>");
			}
			
			
			%>

</table>

</center>
</body>
</html>