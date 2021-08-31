<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css"/>

</head>
<body>
	<a href ="/test1?a=100&b=200&c=300">param으로 받기</a>
	<a href ="/test2">Model로 받기</a>
	<a href ="/test3">Login</a>
	<a href = "/test4">ModelAndView</a>
	<a href = "/test5?a=100&b=200&c=300">@ModelAttribute 1</a> <!-- ModelAttribute로 받아서 model로 출력 -->
	<a href = "/test6?a=1000&b=2000&c=3000">@ModelAttribute 자동주입</a>
	<a href = "/test7?a=1000&b=2000&c=3000">@ModelAttribute 클래스 이름 지정</a>
	
</body>
</html>