<%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-18
  Time: 오후 3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
    <%
        request.setCharacterEncoding("utf-8");
        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");
    %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    redirect되어서 옴

    사용자id: <%= userid%>
    패스워드 : <%=passwd%>
</body>
</html>
