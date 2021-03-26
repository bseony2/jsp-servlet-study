<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
aaa에 해당하는 값이 존재 하냐?: ${!empty aaa}<br>
aaa에 해당하는 값이 존재하지 않냐?: ${empty aaa}<br>
aaa에 해당하는 값 출력: ${aaa}<br>
aaa가 bbb값 보다 크냐?: ${aaa>bbb}<br>
ccc 값이 30 이냐? : ${ccc==30}<br>


</body>
</html>