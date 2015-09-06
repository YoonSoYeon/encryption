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
<body background="resources/info.jpg">
	<script>
		function click(frm) {
			var url = "join_group.ps";
			var title = "그룹 가입하기";
			window.open(
							'join_group.ps',
							"그룹 가입하기",
							"width=500,height=175,scrollbars=no,toolbar=no,location=no,directories=no,top=300,left=550,noresize,resizeable=no");
			frm.target = title; //form.target 이 부분이 빠지면 form값 전송이 되지 않습니다. 
			frm.action = url;
			frm.method = "post";
			frm.submit();
		}
	</script>
	
	<script>
		function go() {
			
			
			var index = document.getElementById("sel").selectedIndex;
			var gnum = document.getElementById("sel").options[index].value;
			alert(gnum+"hihi")
		parent.location.href = 'group_main.ps?gnum='+gnum;
		
		}
	</script>
	


<form method="post" action="search.ps" target="right">
	<table>
		<c:if test="${!empty login }">
			<tr>
				<td colspan="3"> ${login } 님  &nbsp;&nbsp;</td>
			</tr>
			<tr style="font-size: 11px  " align="center">
				<td><a href="" style="text-decoration: none; ">정보수정</a></td>
				<td><a href="logout.ps" style="text-decoration: none;">로그아웃</a></td>
			</tr>
		</c:if>
		
		<tr>
			<td colspan="3" >
			
			<select id="sel" style="width: 225px"  onchange = "javascript:go();" ><option>가입된클럽</option>
			 <c:forEach items="${list2 }" var="se">
				<option value = "${se.gmnum }"  >${se.gname }</option>
			</c:forEach>
		</select>
			
			</td>
		</tr>
	
		<tr>
			<td colspan="3"><a href="javascript:click();"><img src="resources/gmake.png" border="0" style="cursor: pointer;"></a></td>
		</tr>
		<tr>
			<td colspan="2"><input type="text" name="search"
				placeholder="검색어를 입력하세요" style="width: 194px"></td>
			<td><input type="image" src="resources/ico_search.gif" style="cursor: pointer;"></td>
		</tr>
	</table>
</form>
</body>
</html>