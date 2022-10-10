<!-- pharmacy/get -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<link href="../../resources/css/pagi.css" rel="stylesheet" />

<%@include file="../includes/header.jsp"%>

<div class="container">
	<h2 class="title">약국 상세 정보</h2>
	<!-- /.panel-heading -->
	<div class="detail">
		<input type="hidden" name="bno" value='<c:out value="${pharmacy.bno}"/>'><br>
		<div class="from-group">
			<label>약국 이름</label> <input class="form-control" name="name"
				readonly="readonly" value='<c:out value="${pharmacy.name}"/>'><br>
		</div>
		<div class="from-group">
			<label>주소 </label> <input class="form-control" name="address"
				readonly="readonly" value='<c:out value="${pharmacy.address}"/>'><br>
		</div>
		<div class="from-group">
			<label>전화번호 </label> <input class="form-control" name="phone"
				readonly="readonly" value='<c:out value="${pharmacy.phone}"/>'><br>
		</div>
		<div class="from-group">
			<label>진료일 </label> <input class="form-control" name="workday"
				readonly="readonly" value='<c:out value="${pharmacy.workday}"/>'><br>
		</div>
		<div class="from-group">
			<label>진료 시간(시작) </label> <input class="form-control" name="opentime"
				readonly="readonly" value='<c:out value="${pharmacy.opentime}"/>'><br>
		</div>
		<div class="from-group">
			<label>진료 시간(마감) </label> <input class="form-control"
				name="closetime" readonly="readonly"
				value='<c:out value="${pharmacy.closetime}"/>'><br>
		</div>
		<div class="from-group">
			<label>휴무 </label> <input class="form-control" name="holiday"
				readonly="readonly" value='<c:out value="${pharmacy.holiday}"/>'><br>
		</div>
		<div class="hi-btn">
			<button data-oper='list' class="hi hi-info">목록으로</button>
			<a href="../pharmacy_address/pharaddress.do"><button class="hi hi-road">길찾기</button></a>
			
		</div>
		<!-- 7/20 -->
		<form id='operForm' action="/pharmacy/modify" method="get">
			<input type="hidden" id="bno" name="bno"
				value='<c:out value="${pharmacy.bno }"/>'>
			<!-- Criteria 클래스의 인스턴스 명과 일치 => 자동 바인딩 -->
			<input type="hidden" name="pageNum"
				value='<c:out value="${cri.pageNum}"/>'> <input
				type="hidden" name="amount" value='<c:out value="${cri.amount}"/>'>
			<input type="hidden" name="type" value='<c:out value="${cri.type}"/>'>
			<input type="hidden" name="keyword"
				value='<c:out value="${cri.keyword}"/>'>
		</form>

	</div>
	<!-- /.panel-body -->
</div>
<!-- /.panel -->

<script>
	var operForm = $("#operForm");

	$("button[data-oper='modify']").on("click", function(e) {
		operForm.attr("action", "/pharmacy/modify").submit();
	});
	$("button[data-oper='list']").on("click", function(e) { // button[data-oper=' list']	=> 띄어쓰기도 에러로 인식
		operForm.find("bno").remove();
		operForm.attr("action", "/pharmacy/list").submit();
	});
	/* $("button[data-oper='checkout']").on("click", function(e) {
		operForm.attr("action", "/hospitals/checkout.do").submit();
	}); */
	 $("button[data-oper='reservation']").on("click", function(e) {
			operForm.attr("action", "/pharmacy/reservation.do").submit();
	}); 
</script>











<%@ include file="../includes/footer.jsp"%>