<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/ServletPrj/login">
	���̵� : <input type="text" name ="id"/><br>
	��й�ȣ : <input type="password" name ="pw"/><br>
	�̸� : <input type="text" name="name"/><br>
	���<input type="checkbox" name="hobby" value="climbing">climbing
		<input type="checkbox" name="hobby" value="swim">swim
		<input type="checkbox" name="hobby" value="reading">reading
		<input type="checkbox" name="hobby" value="music">	music
	<br>
	���� <input type="radio" name="sex" value="male">male
		<input type="radio" name="sex" value="female">female
	<br>
	job : <input type="text" name="job"><br>
	�ڱ�Ұ� : <input type="text" name="intro"><br>
	<button type="submit">Login</button>
	</form>
</body>
</html>