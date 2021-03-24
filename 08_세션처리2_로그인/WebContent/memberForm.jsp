<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 폼 </h1>
<form action="MemberRegiServlet">
아이디:<input type="text" name="userid"><br>
비번:<input type="text" name="passwd"><br>
이메일 : <input type="text" name="email"><br>
<input type="submit" value="로그인">
</form>
<a href="LoginFormServlet">로그인화면으로 </a>
</body>
</html>