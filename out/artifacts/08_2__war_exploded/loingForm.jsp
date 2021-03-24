<%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-23
  Time: 오후 4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginForm</title>
</head>
<body>
    <h1>로그인</h1>
    <form action="LoginServlet" method="get">
        아이디:<input type="text" name="userid">
        패스워드:<input type="text" name="passwd">
        <input type="submit" value="로그인">
    </form>
</body>
</html>
