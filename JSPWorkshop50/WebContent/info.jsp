<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dto.EmpDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 사원번호: ${empDTO.empno}<br>
 사원이름: ${empDTO.ename}<br>
 월급: ${empDTO.sal}<br>
 ${requestScope.empDTO} <br>
 <% EmpDTO dto= (EmpDTO)request.getAttribute("empDTO"); %>
 <%= dto.getEname() %>
</body>
</html>