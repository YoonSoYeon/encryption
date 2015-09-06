<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<body background="resources/info.jpg">

	<script>
		function go(gnum) {
			var url = "newPlan.ps?";
			var title = "일정 추가";
			window.open(
							'newPlan.ps?gnum='+gnum,
							"일정 추가",
							"width=509,height=227, scrollbars=no,toolbar=no,location=no,directories=no,top=300,left=550,noresize,resizeable=no");
		/* 	frm.target = title; //form.target 이 부분이 빠지면 form값 전송이 되지 않습니다. 
			frm.action = url;
			frm.method = "post";
			frm.submit(); */
		}
	</script>
	
		<script>
		function click1(frm) {
			var url = "groupinfo.ps";
			var title = "그룹 정보";
			window.open(
							'groupinfo.ps',
							"그룹 정보",
							"width=509,height=227, scrollbars=no,toolbar=no,location=no,directories=no,top=300,left=550,noresize,resizeable=no");
			frm.target = title; //form.target 이 부분이 빠지면 form값 전송이 되지 않습니다. 
			frm.action = url;
			frm.method = "post";
			frm.submit();
		}
	</script>
	
	
	<script>

function button_event(){
if (confirm("정말 탈퇴하시겠습니까?") == true){    //확인
//	document.getElementById("f").action = "group_main_top.ps";
//	alert(gnum)
//	document.getElementById("gnum").value = gnum;
	alert("탈퇴되었습니다.");
//  document.form.submit();
}else{   //취소
	alert("취소되었습니다!")
	return;
}
}

</script>

	<div style="font-family: 나눔고딕" align="center">
	 ${login }님,<br>
	 반갑습니다 !</div> <br>
	<br>
	<form method="post" action="group_secession.ps?gnum=${g.gnum }" target="_parent">
		<img src="resources/addplan.png" border="0" style="cursor: pointer;" onclick="go(${g.gnum})">
		
		<br>
		<br>
		<a href="javascript:click1();"><img src="resources/ginfo.png" border="0" style="cursor: pointer;"></a>
		<br>
		<br>
		<img src="resources/gout.png" border="0" style="cursor: pointer;" onclick="button_event();">
		</form>
		<br>
		<a href = "deletegroup.ps?gnum=${g.gnum }" target="_parent"><img src="resources/gdel.png" border="0" style="cursor: pointer;"></a>
		<br>
		<br>
		<a href = "main.ps" target="_parent"><img src="resources/gohome.png" border="0" style="cursor: pointer;"></a>
	
</body>
</html>