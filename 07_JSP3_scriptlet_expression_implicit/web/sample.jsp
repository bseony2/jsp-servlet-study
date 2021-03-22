<%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-18
  Time: 오후 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<!--hrml 주석-->
<%--jsp 주석--%>
    <%!
        int num=10;
        public void a(int tt){
            System.out.println("a==========" + tt);
        }
    %>

    <%
        Date d;
        ArrayList x;
        a(10);
        String name = "홍길동";
    %>

    <%
        String str = "홍길동";
        System.out.println(str);
        System.out.println(name);
    %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%= str%>

    <% if(name.equals("홍길동")){%>홍길동입니다.

    <% }else{%>
    홍길동이 아닙니다.
    <% } %>
    <% for(int i=0; i<10; i++) {%>

        <%= i+"홍길동<br>"%>
    <%}%>
</body>
</html>
