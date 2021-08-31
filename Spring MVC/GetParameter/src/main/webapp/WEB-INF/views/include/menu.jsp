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
	<a href ="/test1?a=100&b=200&c=300"/>GET TEST1 |
	<a href="/test2?a=100&b=200&c=400&c=500"/> GET TEST2 |
	<a href="/test3"/> GET TEST3 |
	<a href="/test4?a=100&b=200"/> GET TEST4 |
	<a href="/test5/1000/2000/3000"/>GET TEST5 @PathVariable |     
	<a href="/test6?a=300&b=300&c=500"/>GET TEST6 @RequestParam
	<a href="/test7?a=300&b=400&c=500&c=200"/>GET TEST7 @RequestParam <br>
	<a href="/test8?a=100&b=200&c=300"/>GET TEST8 @RequestParam |
	<a href="/test9?a=100&b=200&c=300&c=400"/>GET TEST9 object map  |
	<a href="/test10?a=100&b=200&c=300&c=400"/>GET TEST9 object map list }|
	<a href="/test11?a=100&b=200&c=300"/>GET TEST11 @ModelAndAttribute |
	
	
</body>
</html>