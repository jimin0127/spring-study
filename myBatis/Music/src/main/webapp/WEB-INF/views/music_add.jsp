<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
<h2>음악 추가하기</h2>
<form style="padding-left: 30px" action="/music_add" method="post"><br>
	제목 : <input type="text" name="song_title"/><br>
	가수 : <input type="text" name="song_singer"/><br>
	장르 : <input type="text" name="song_genre"/><br>
	가격 : <input type="text" name="song_price"/><br>
	비밀번호 : <input type="text" name="song_passwd"/><br>
	발매년도 : <input type="text" name="song_date"/><br>
	<input type="submit" value="추가하기">
</form>
</body>
</html>