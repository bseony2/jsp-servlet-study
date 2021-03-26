<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${names}<br>
 이름1: ${names[0]}<br>
 이름2: ${names[1]}<br>
 이름3: ${names[2]}<br>
 <%  String[] names= (String[])request.getAttribute("names");
  for(String s: names){
 	out.print(s+"<BR>");
  }
 %>
</body>
</html>