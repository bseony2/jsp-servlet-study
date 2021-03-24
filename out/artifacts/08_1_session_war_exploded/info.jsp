<%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-23
  Time: 오후 3:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String username=(String)session.getAttribute("username");
        String passwd=(String)session.getAttribute("passwd");
    %>
<h1>세션정보</h1>
이름 : <%= username%><br>
비번 : <%= passwd%><br>
<a href="GetServlet">GetServlet가기</a>
</body>
</html>
