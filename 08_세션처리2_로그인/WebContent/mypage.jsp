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
	String userid=(String)session.getAttribute("userid");
	String passwd=(String)session.getAttribute("passwd");
	String email=(String)session.getAttribute("email");
	if(userid!=null){//회원인 경우 
%>
<h1>회원정보</h1>
회원아이디 <%= userid %><br>
회원비번 <%= passwd %><br>
이메일주소 <%= email %><br>
<a href="LogoutServlet">로그아웃</a>
<%
}else{ //인증이 안된 경우 
	response.sendRedirect("MyPageFormServlet");

} %>
</body>
</html>