<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music</title>

<link href="css/index.css?i=1" rel= "stylesheet"/>

</head>
<body>
<nav>
	<div class="di"><a href="/music_list">목록보기</a></div>
	<div class="di"><a href="/music_add">음악 추가 </a></div>
	<form class="search" action="/music_search" method="POST">
		<input type="text" name="title" placeholder="제목으로 곡 검색">
	<input type="submit" value="검색">
	</form>
</nav>

</body>
</html>