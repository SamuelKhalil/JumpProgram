<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.sat.cls.MyTreeCls"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%! MyTreeCls tt=new MyTreeCls(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>
<select name="s11">
<%
Iterator itr= tt.getTm().entrySet().iterator();
while(itr.hasNext()){
	Entry en=(Entry)itr.next();
	out.println("<option value="+en.getKey().toString()+">"+en.getValue().toString()+"</option>");
}
%>
</select>
</body>
</html>