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
<table border="1">
    <tr>
        <td>사원번호</td>
        <td>사원이름</td>
        <td>월급</td>
        <td>입사일</td>
        <td>부서번호</td>
    </tr>

    <%
        for(EmpDTO dto: list){
            int empno = dto.getEmpno();
            String ename = dto.getEname();
            double sal = dto.getSal();
            String hiredate = dto.getHiredate();
            int deptno = dto.getDeptno();
    %>

    <tr>
        <td><%= empno%><%=dto.getEmpno()%></td>
        <td><%= ename%><%=dto.getEname()%></td>
        <td><%= sal%><%out.print(sal);%></td>
        <td><%=hiredate%></td>
        <td><%=deptno%></td>
    </tr>

    <%
        }
    %>
</table>
</body>
</html>
