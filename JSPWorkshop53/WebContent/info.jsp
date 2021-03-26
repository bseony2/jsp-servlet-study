<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
    <%@page import="com.dto.EmpDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
사원1: ${list[0].empno}&nbsp;${list[0].ename}&nbsp;${list[0].sal}<br>
사원2: ${list[1].empno}&nbsp;${list[1].ename}&nbsp;${list[1].sal}<br>
<% ArrayList<EmpDTO> list= (ArrayList<EmpDTO>)request.getAttribute("list"); 
	System.out.println(list.size());
	 for(int i=0; i< list.size(); i++){
		out.print(list.get(i).getEname()+"\t"+ list.get(i).getEmpno()+"<br>");
	} 	
 %>

</body>
</html>