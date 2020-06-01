<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Material Cards</title>
<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body>
<%
String[] arr1={"Newton","Einstein","Rutherford","Pascal","Archimedes"};
String[] arr2={"I am a very simple scientist. I am good at containing small bits of information.I am convenient because I require little markup to use effectively"};
for(int i=0;i<5;i++){
%>
<div class="row">
    <div class="col s12 m6">
      <div class="card blue-grey darken-1">
        <div class="card-content white-text">
          <span class="card-title"><%=arr1[i] %></span>
          <p><%=arr2[0]%>+"&nbsp;"+<%=arr1[i]%></p>
        </div>
        <div class="card-action">
          <a href="#"><%=arr1[i]%></a>
          <a href="#"><%=arr1[i]%></a>
        </div>
      </div>
    </div>
  </div>
  <%} %>
</body>
</html>