<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/table.css?i=1" rel= "stylesheet"/>

</head>
<body>
<jsp:include page="index.jsp"></jsp:include>

<table style="border: 1px black solid;">
	<tr>
		<td>순번</td>
		<td>제목</td>
		<td>가수</td>
		<td>장르</td>
		<td>가격</td>
		<td>발매년도</td>
		<td>비고</td>
	</tr>
	
	<c:forEach var="song" items="${list }">
	<tr>
		<td>${song.id }</td>
		<td>${song.song_title }</td>
		<td>${song.song_singer }</td>
		<td>${song.song_genre}</td>
		<td>${song.song_price}</td>
		<td>${song.song_date }</td>
		<td><a href="/edit?id=${song.id }">수정</a> &nbsp;&nbsp;
			<a href="/delete?id=${song.id}">삭제</a>
		</td>
		
	</tr>
	</c:forEach>
</table>
	
</body>
</html>