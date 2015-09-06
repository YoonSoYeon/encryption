<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>그룹 가입하기</title>
</head>

<body>
	<form method="post" action="ginsert.ps">
		<table id="tt">
			<tr>
				<td>그룹명 : <input type="text" size="52" name='gname'></td>
				<td></td>
			</tr>
			<tr>
				<td>프로젝트 기간 : <input type="text" name='spdate'
					placeholder="2015/08/03"> - <input type="text"
					name='epdate' placeholder="2015/08/03"></td>
					<td></td>
			</tr>
			<tr>
		
			<tr>
				<td align="right"><br> <input type="submit" value="확인"
					onClick="window.close();">&nbsp;&nbsp;&nbsp; <input
					type="reset" value="취소" onClick="window.close();"></td>
					<td></td>
			</tr>
		</table>
	</form>
</body>
</html>