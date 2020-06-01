<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.sat.cls.BankAccount"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My JSON Page</title>
</head>
<body>
<%
BankAccount ba=new BankAccount();
ba.setId(1);
ba.setBname("Bank Of America");
Gson so=new Gson();
String u=so.toJson(ba, BankAccount.class);
out.println("<textarea rows=20 cols=20>"+u+"</textarea>");
List<String> ll=new ArrayList();
Map<Integer,String> mm=new HashMap<>();
for(int i=0;i<10;i++){
	//ll.add("String-"+(i+1));
	mm.put(i, "Candidate-"+(i+1));
}
//String o=so.toJson(ll,List.class);
//out.println("<br><hr><br><textarea rows=10 cols=30>"+o+"</textarea>");
String o1=so.toJson(mm,Map.class);
out.println("<br><hr><br><textarea rows=10 cols=30>"+o1+"</textarea>");


%>
</body>
</html>