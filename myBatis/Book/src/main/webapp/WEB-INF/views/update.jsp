<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/update">
	Title <input type="text" name="title" value="${dto.title }"/> <br>
	Author <input type="text" name="author" value="${dto.author }"/> <br>
	Price <input type="text" name="price" value="${dto.price }"/> <br>
	<input type="submit" value="Log IN" />
</body>
</html>