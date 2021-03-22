<%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-18
  Time: 오전 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<head>
    <title>top.jsp</title>
</head>
<body>
<%
    String mesg = (String)request.getAttribute("xxx");
%>
    <h1 style="color:red;">
        top.jsp
        안녕하세요 ? mesg===<%= mesg%>
    </h1><br>
</body>
</html>
