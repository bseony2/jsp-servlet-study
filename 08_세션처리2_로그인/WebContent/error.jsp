<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String mesg = (String) request.getAttribute("mesg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>에러 페이지</h1>
잘못된 요청입니다.
확인후 다시 요청하세요
<%= mesg %>
<a href="LoginFormServlet"> 회원가입하기 </a>
</body>
</html>