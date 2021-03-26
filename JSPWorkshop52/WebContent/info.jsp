<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 이름1: ${list[0]}<br>
 이름2: ${list[1]}<br>
 이름3: ${list[2]}<br>
 <% ArrayList<String> list= (ArrayList<String>)request.getAttribute("list"); 
	for(String s: list){
 		out.print(s+"<br>");
 	}
 %>
</body>
</html>