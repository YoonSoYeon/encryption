<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action = "newPlan.ps">
<center><h3>일정추가</h3></center>
기간 : <input type="text" name=sdate> - <input type="text" name=edate><br><br>
이름 : <input type="text" name=title><br><br>
내용 : <input type="text" name=content><br>
<br>
<center><input type="reset" value="취소"  onClick="window.close();"><input type="submit" value="확인"  onClick="window.close();">
</center>
</form>
</body>
</html>