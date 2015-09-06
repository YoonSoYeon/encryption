<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<script>
 function click()
 {
  window.open('uselogin.ps', "로그인 후 사용", "width=509,height=227,scrollbars=no,toolbar=no,location=no,directories=no,top=300,left=550,noresize,resizeable=no");
 }
</script>

<body background="resources/info.jpg">

<form method="post" action="login.ps">
	<table> 
		<tr>
			<td colspan="3">ID : <input type="text" name="id" style="width: 190px"></td>
		</tr>
		<tr>
			<td colspan="3">PW : <input type="password" name="pass" style="width: 180px"></td>
		<tr>
		<td colspan="3" align="right"><input type="image" src="resources/login.png"></td>
		</tr>
		<tr>
			<td colspan="3"><select style="width: 225px"><option>가입된클럽</option></select></td>
		</tr>
		<tr>
			<td colspan="3"><a href="javascript:click();"><img src="resources/gmake.png" border = "0" style="cursor: pointer"></a></td>
		</tr>
		<tr>
			<td colspan="2"><input type="text" name="search" placeholder="검색어를 입력하세요" style="width: 194px"></td>
			<td><img src="resources/ico_search.gif"></td>
		</tr>
	</table>
		</form>
</body>
</html>