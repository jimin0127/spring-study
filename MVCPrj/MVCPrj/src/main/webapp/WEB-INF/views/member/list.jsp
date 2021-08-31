<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr><td>아이디</td><td>이름</td><td>이메일</td><td>가입날짜</td></tr>
	<c:forEach var="test" items="${list }">
		<tr>
			<td>${test.userid }</td>
			<td><a href="/member/read?userid=${test.userid }">${test.name }</a></td>
			<td>${test.email }</td>
			<td>${test.join_date }</td>
		</tr>
		</c:forEach>
</table>
</body>
</html>