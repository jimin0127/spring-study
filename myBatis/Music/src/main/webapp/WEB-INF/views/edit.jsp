<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<script type="text/javascript">
	var pw = parseInt(prompt("비밀번호를 입력해주세요"));
	if(pw != ${dto.song_passwd}){
		alert("비밀번호가 일치하지 않습니다.");
		location.href="music_list";		}
</script>
<jsp:include page="index.jsp"></jsp:include>
<h2>수정하기</h2>
<form style="padding-left: 30px" action="/edit?id=${dto.id }" method="post"><br>
	제목 : <input type="text" name="song_title" value="${dto.song_title }"/><br>
	가수 : <input type="text" name="song_singer" value="${dto.song_singer }"/><br>
	장르 : <input type="text" name="song_genre" value="${dto.song_genre }"/><br>
	가격 : <input type="text" name="song_price" value="${dto.song_price }"/><br>
	발매년도 : <input type="text" name="song_date" value="${dto.song_date }"/><br>
	<input type="submit" value="수정하기">
</form>
</body>

</html>