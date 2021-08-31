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
	아이디 : <input type="text" name ="id"/><br>
	비밀번호 : <input type="password" name ="pw"/><br>
	이름 : <input type="text" name="name"/><br>
	취미<input type="checkbox" name="hobby" value="climbing">climbing
		<input type="checkbox" name="hobby" value="swim">swim
		<input type="checkbox" name="hobby" value="reading">reading
		<input type="checkbox" name="hobby" value="music">	music
	<br>
	성별 <input type="radio" name="sex" value="male">male
		<input type="radio" name="sex" value="female">female
	<br>
	job : <input type="text" name="job"><br>
	자기소개 : <input type="text" name="intro"><br>
	<button type="submit">Login</button>
	</form>
</body>
</html>