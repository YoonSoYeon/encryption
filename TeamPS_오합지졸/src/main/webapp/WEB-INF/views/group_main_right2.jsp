<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%!
boolean y = false;
%>
<%
  
   Calendar cal =Calendar.getInstance();

  int nowYear = cal.get(Calendar.YEAR);
  int nowMonth = cal.get(Calendar.MONTH)+1; // +1
  int nowDay = cal.get(Calendar.DAY_OF_MONTH);
  
  request.setCharacterEncoding( "utf-8");
  String strYear = request.getParameter( "year");//select문 year
  String strMonth = request.getParameter( "month");//select문 month
 
    int year = nowYear; // 현재의 년을 받아옴.
    int month = nowMonth; // 현재의 월을 받아옴.
    int i;
    
    if(strYear != null)
    {
     year = Integer.parseInt(strYear); 
    }
  
    if(strMonth != null)
    {
     month = Integer.parseInt(strMonth);
    }
   
    cal.set(year,month-1,1);//년월일
    
    int startDay = 1;
   
    int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//자동
    int week = cal.get(Calendar.DAY_OF_WEEK);//자동
   
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function window_onload()//현재 년과 월을 받아와서 select로 출력
 {
    for ( i=2015;i<=2016 ; i++)
   {
        var op= new Option(i+ "년",i);
         syear.options[i -2015]=op; 
         if(i== <%=year %> )
         {
            syear.options[i -2015].selected ="selected" ;
         }
   }
     for ( i=1;i<=12 ; i++)
     {
        var op= new Option(i+ "월",i);
         smonth.options[i -1]=op;
         if(i== <%=month %>)
         {
             smonth.options[i -1].selected = "selected";
         }
     }
 }
function month_onchange()
{   
     var month = smonth.value;
     var year = syear.value;
     var addr = "group_main_right.ps?year=" + year +"&month=" + month;
    // alert(addr);
    //addr 이 가지는 주소값으로  페이지를 이동시킨다.       
   location.href = addr;
   
}
function year_onchange()
{
     var year = syear.value;
     var month = smonth.value;
     var addr = "group_main_right.ps?year=" + year +"&month=" + month;
    
        location.href = addr;
    
}

</script>
<title>Insert title here</title>
</head>
<body>
<body onload="window_onload()">

	<table align="center" cellspacing="1" cellpadding="2" bgcolor=#bbccdd>
		<tr>
			<td width="730" colspan="7"
				style="color: #bbccdd; border: solid 1px #B5B2FF;"><b>&nbsp;
					<select id="syear" onchange="year_onchange()">
						<option></option>
				</select>
			</b> <b>&nbsp; <select id="smonth" onchange="month_onchange()">
						<option></option>
				</select></b></td>
	</table>

	<table align="center" cellspacing="1" cellpadding="2" bgcolor="#cccccc">
		<tr align="center" style="font-family: 나눔고딕;">
			<td bgcolor="#cfe8ff" width="100" height="100" style="color: red;">
				일</td>
			<td bgcolor="#cfe8ff" width="100" height="100">월</td>
			<td bgcolor="#cfe8ff" width="100" height="100">화</td>
			<td bgcolor="#cfe8ff" width="100" height="100">수</td>
			<td bgcolor="#cfe8ff" width="100" height="100">목</td>
			<td bgcolor="#cfe8ff" width="100" height="100">금</td>
			<td bgcolor="#cfe8ff" width="100" height="100" style="color: black;">
				토</td>

		</tr>
		<tr>
			<%
   
   
   
      int newLine=0;
      for(i=1; i<week; i++)
      {%>
			<td width='100' height='100' bgcolor='#ffffff'>&nbsp;${row.sdate }</td>
			<%newLine++;
      }
     
      for(i=startDay; i<=endDay; i++)
      {
    	  y = true;
    	   
       String fontColor=(newLine==0)?
                "red":(newLine==6)? "blue": "black";//토 파 일 빨
       String bgColor=(nowYear==year)&&(nowMonth==month)//현재 날짜 배경색 바뀜
                &&(nowDay==i)? " #d8e8ff": "#ffffff";
    	  %>
			<c:forEach items="${list}" var="row" varStatus="status">
				<c:set var="pg" value="${row.sdate}" scope="request" />
				<c:set var="pg_title" value="${row.title}" scope="request" />

				<%
    		String sdate = (String)request.getAttribute("pg");
    	   String title = (String)request.getAttribute("pg_title");
    	   String getyear2 = sdate.substring(0,4);
    	   String getmonth2 = sdate.substring(5,7);
    	   
    	   if(getmonth2.substring(0,1).equals("0")){
    		   getmonth2 = getmonth2.substring(1,2);
    	   }
    	   String getday2 = sdate.substring(8,10);
    	   
    	   int year2 = Integer.parseInt(getyear2);
    	   int month2 = Integer.parseInt(getmonth2);
    	   int day2 = Integer.parseInt(getday2);
                if(year==year2&&month==month2&&i==day2){
                	
                	y=true;
                	if(y==true){
                	%>
				<td width='100' height='100' bgcolor="<%=bgColor %>"><font
					color="<%=fontColor%>"><%=i %></font>${row.title }</td>
				<%
				
				y=false;
                }
                }
                %>
				<c:if test="${status.index eq 0}">
					<%
               
                	
                newLine++;
                System.out.println(i+"ii");

                %>
					<c:if test="${i eq day2 }">
						<td width='100' height='100' bgcolor="<%=bgColor %>"><font
							color="<%=fontColor%>"><%=i %></font></td>
					</c:if>
				</c:if>
				<%
                
     
           if(newLine ==7 &&i!=endDay)
           {%>

				<tr></tr>
				<%
            newLine=0;
           }
           y = false;
           %>
			</c:forEach>
			<%
      }
     while(newLine>0 && newLine<7)
     {%>
			<td width='100' height='100' bgcolor='#ffffff'>&nbsp;</td>
			<%
      newLine++;
     }
  
   %>
		</tr>
	</table>

</body>
</html>