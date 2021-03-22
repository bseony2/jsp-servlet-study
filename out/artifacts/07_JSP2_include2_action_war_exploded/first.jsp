<%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-18
  Time: 오전 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>first.jsp</title>
</head>
<body>
    <% //request에 값을 저장
        request.setAttribute("xxx", "홍길동"); //top.jsp 사용할 수 있음.
    %>
    <h1>first.jsp</h1>
    아래화면언 top.jsp의 내용입니다.<br>
    <%@ include file="include/top.jsp"%><br><br>

    아래 화면은 top.jsp를 jsp:include 시킨 내용입니다.
    <jsp:include page="include/top.jsp" flush="true"/><br>
    지금 화면은 first.jsp 내용입니다.
</body>
</html>
