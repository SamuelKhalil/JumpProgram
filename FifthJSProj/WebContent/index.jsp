<%@page import="java.io.File"%>
<%@page import="java.io.FileWriter"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.cls.sat.Student"%>
<%@page import="java.util.Map"%>
<%@page import="com.cls.sat.UtilCls"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<jsp:useBean id="cls" class="com.cls.sat.UtilCls"></jsp:useBean>
	<%
		Map<Integer, Student> ms = null;
		ms = cls.retM();
		Gson so = new Gson().newBuilder().create();
		String u = so.toJson(ms, Map.class);
		//String op = "<textarea rows=10 cols=30>" + u + "</textarea>";
		File ff=new File("c://DelhiOfficeFiles//test.json");
		FileWriter writer=new FileWriter(ff);
		writer.write(u);
		writer.close();
		//out.println(op);
	%>
</body>
</html>