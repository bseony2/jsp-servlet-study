<%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-18
  Time: 오후 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<String> list = Arrays.asList("홍길동", "이순신", "유관순");
        for(String s : list){
    %>
    이름: <%= s%><br>
    <% }%>
</body>
</html>
