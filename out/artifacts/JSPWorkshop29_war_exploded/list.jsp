<%@ page import="com.service.EmpService" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.dto.EmpDTO" %><%--
  Created by IntelliJ IDEA.
  User: bseon
  Date: 2021-03-18
  Time: 오후 4:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>

<%
    EmpService service = new EmpService();
    ArrayList<EmpDTO> list = service.selectAllEmp();
    for(int i=0; i<list.size();i++){
        System.out.println(list.get(i));
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
