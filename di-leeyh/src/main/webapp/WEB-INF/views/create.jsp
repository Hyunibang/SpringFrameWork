<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>좌석 생성</title>
<%@ include file="include/header.jsp" %>
<script>
$(document).ready(function(){
	$("#btnSave").click(function(){
		var id = $("#id").val();
		var name = $("#name").val();
		var floor = $("#floor").val();
		var location = $("#location").val();
		var starttime = $("#starttime").val();
		var endtime = $("#endtime").val();
		
		if(id == ""){
			alert("식별 숫자 입력할것 : 1~999");
			document.seat.id.focus();
			return;
		}
		if(name == ""){
			alert("열람실 입력할것 : 1열람실 or 2열람실");
			document.seat.name.focus();
			return;
		}
		if(floor == ""){
			alert("층 입력할것 : 2층 or 3층");
			document.seat.floor.focus();
			return;
		}
		if(location == ""){
			alert("좌석 위치 입력할것 : 1-1 ~ 2-10");
			document.seat.location.focus();
			return;
		}
		if(starttime == ""){
			alert("시작 시간 입력할것 : 08:00 ~ 21:00");
			document.seat.starttime.focus();
			return;
		}
		if(endtime == ""){
			alert("종료 시간 입력할것 : 08:30 ~ 22:00");
			document.seat.endtime.focus();
			return;
		}
		document.seat.submit();
	});
});
</script>
</head>
<body>
<h2>좌석 생성</h2>
<form name="seat" method="post" action="/create.go">
<div>
식별 숫자
<input name ="id" id="id" size="60" placeholder="식별 숫자 입력할것">
</div>
<div>
열람실
<input name ="name" id="name" size="60" placeholder="열람실 입력할것">
</div>
<div>
층
<input name ="floor" id="floor" size="60" placeholder="층 입력할것">
</div>
<div>
좌석 위치
<input name ="location" id="location" size="60" placeholder="좌석 위치 입력할것">
</div>
<div>
시작 시간
<input name ="starttime" id="starttime" size="60" placeholder="시작 시간 입력할것">
</div>
<div>
종료 시간
<input name ="endtime" id="endtime" size="60" placeholder="종료 시간 입력할것">
</div>
<div style="width:550px; text-align:center;">
<button type="button" id="btnSave">확인</button>
<button type="reset">취소</button></div>
</form>
</body>
<%@include file="include/footer.jsp" %>
</html>