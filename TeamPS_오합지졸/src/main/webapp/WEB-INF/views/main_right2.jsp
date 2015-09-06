<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
a:link {color: black;}
a:VISITED {color:black;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<script>

function button_event(gnum){
if (confirm("그룹에 가입하시겠습니까?") == true){    //확인
	document.getElementById("gnum").value = gnum;
	alert("가입되었습니다.");
    document.form.submit();
}else{   //취소
	alert("취소되었습니다!")
	return;
}
}

</script>

<body background="resources/info.jpg">
	<div align="center" style="font-size: 25px; font-family: 나눔고딕; color: white; text-shadow: 2px 2px 2px #9FCCEC;" >검색결과</div>
	<form method="post" action="entergroup.ps" id="f" target="_parent">
		<input type="hidden" name="search" value="${search }" /> <input
			type="hidden" name="gnum" id="gnum">
		<TABLE align="center" CELLSPACING=1 CELLPADDING=10 style="font-family: 나눔고딕">
			<TR>
				<th width=100 bgcolor=#9FCCEC><font color=#ffffee size=2>그룹이름</th>
				<th width=100 bgcolor=#9FCCEC><font color=#ffffee size=2>시작일</th>
				<th width=150 bgcolor=#9FCCEC><font color=#ffffee size=2>종료일</th>
				<th width=200 bgcolor=#9FCCEC><font color=#ffffee size=2>그룹가입하기</th>
			</TR>


			<c:forEach items="${list1 }" var="se">
				<tr bgcolor=#e0e1f3>
					<td align=center bgcolor=#e0e1f3><a
						href="group_main.ps?gnum=${se.gnum }" target="_parent">${se.gname }</a></td>
					<td align=center bgcolor=e0e1f3>${se.spdate }</td>
					<td align=center bgcolor=e0e1f3>${se.epdate }</td>
					<td align=center bgcolor=e0e1f3><input
							type="image" src="resources/join.png"
							onclick="button_event(${se.gnum });"></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>