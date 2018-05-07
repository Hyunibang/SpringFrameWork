<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false"%>
<%@ include file="include/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>좌석 목록 확인</title>
 
<script>

$(document).ready(function(){
	$("#btnCreate").click(function(){
		location.href="/write.go";
	});
});

$(document).ready(function(){
	$("#btnUpdate").click(function(){
		location.href="/view.go";
	});
});
</script>

</head>
<body>
<h2>좌석 목록 확인</h2>
<div style="width:550px; text-align:center;">
<button type="button" id="btnCreate">좌석생성</button>
<button type="button" id="btnUpdate">좌석수정</button>
</div>
<table border="1" width="400px">
<tr>
<th>번호</th>
<th>좌석</th>
<th>열람실</th>
<th>층</th>
<th>시작시간</th>
<th>종료시간</th>
</tr>
<c:forEach items="${list}" var="LibVO">
<tr>
<td>${LibVO.id}</td>
<td>${LibVO.location}</td>
<td>${LibVO.name}</td>
<td>${LibVO.floor}</td>
<td>${LibVO.starttime}</td>
<td>${LibVO.endtime}</td>
</tr>
</c:forEach>
</table>
</body>
<%@ include file="include/footer.jsp"%>
</html>