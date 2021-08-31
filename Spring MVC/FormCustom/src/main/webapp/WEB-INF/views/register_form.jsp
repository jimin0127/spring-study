<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="/register" method ="post">
	이름 : <input type="text" name="user_name"><br>
	아이디 : <input type="text" name="user_id"><br>
	비밀번호 : <input type="password" name="user_pw"><br>
	이메일 : <input type="text" name="user_email"><br>
	주소 : <input type = "text" name="user_addr1"><br>
	상세 주소 : <input type="text" name="user_addr2"><br>
	<input type="submit" value = "확인">
</form>
</body>
</html>