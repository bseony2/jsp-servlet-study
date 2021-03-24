<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String userid = (String) session.getAttribute("userid");
	String mesg = (String) request.getAttribute("mesg");
	%>
	<h1>회원전용 페이지</h1>
	<%
		if (userid != null) {//인증됨
	%>
	<%=mesg%>
	<%=userid%><br>
	<a href="MyPageFormServlet">회원정보</a>
	<%
		} else {
	%>

	회원가입 후 사용하세요
	<a href="LoginFormServlet">회원가입 </a>
	<%
		}
	%>
</body>
</html>