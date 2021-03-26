<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 request 값:${requestScope.request}<br><!--  scope 지정 -->
 session 값:${sessionScope.session}<br>
 application 값:${applicationScope.application}<br>
 request 값:${request}<br><!-- 키값으로만  -->
 session 값:${session}<br>
 application 값:${application}<br>
 
 <%
 
 	System.out.println(request.getAttribute("request"));/*  일반 jsp태그 사용*/
 	System.out.println(session.getAttribute("session"));
 	System.out.println(application.getAttribute("application"));
 
 %>
</body>
</html>