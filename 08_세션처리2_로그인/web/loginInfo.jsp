<%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-23
  Time: 오후 4:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginInfo</title>
</head>
<body>
    <h1>로그인, 안녕하세요</h1>
    <%
        String username=(String)session.getAttribute("username");
        String passwd=(String)session.getAttribute("passwd");
    %>

    <h1>세션정보</h1>
    이름 : <%= username%><br>
    비번 : <%= passwd%><br>

    <a href="LoginInfoServlet">회원정보보기</a>
</body>
</html>
