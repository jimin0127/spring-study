<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
$(function() {
	$("#btnUpdate").click(function() {
		document.form1.action = "/member/update";
		document.form1.submit();

		})
	$("#btnDelete").click(function() {
		document.form1.action = "/member/delete";
		document.form1.submit();

		})
	
})
	
</script>
</head>
<body>
<h2>ȸ������</h2>
<form method="post" name="form1">
<table border='1'>
	<tr>
		<td>���̵�</td>
		<td><input type="text" value="${member.userid }" name="userid" readonly></td>
	</tr>
	<tr>
		<td>��й�ȣ</td>
		<td><input type="text" name="password"></td>
	</tr>
	<tr>
		<td>�̸�</td> 
		<td><input type="text" value="${member.name }" name="name"></td>
	</tr>
	<tr>
		<td>�̸���</td>
		<td><input type="text" value="${member.email }" name="email"></td>
	</tr>

</table>
	<input type="button" id="btnUpdate" value="����">
	<input type="button" id="btnDelete" value="����">
</form>
</body>
</html>