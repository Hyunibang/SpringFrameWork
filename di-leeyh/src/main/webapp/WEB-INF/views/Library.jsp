<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main content -->
<section class="content">
	<div class="row">
	<!-- left column -->
	<div class="col-md-12">
	<!-- general form elements -->
	<div class="box">
	<div class="box-header with-border">
	<h3 class="box-title">열람실 좌석 배정 시스템</h3>
	</div>
	</div>
	<div class="box-footer">
	<button type="submit" class="btn btn-primary" style="height:100px;width:100px;font-size:16px;" onclick="location.href='/list.go'">1열람실<br> 6/10
	</button>
	</div>
	<div class="box-footer">
	<button type="submit" class="btn btn-primary" style="height:100px;width:100px;font-size:16px;" onclick="location.href='/list.go'">2열람실<br> 6/10</button>
	</div>
	</div>
	</div>
</section>
<%@include file="include/footer.jsp" %>