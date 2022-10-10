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
	<h2 class="title">자가예상진단(질환)</h2>
	<!-- /.panel-heading -->
	<div class="detail">
	
		<input type="hidden" name="bno" value='<c:out value="${disease.bno}"/>'><br>
		
		<div class="from-group">
			<label>질환명</label> <input class="form-control" name="dname"
				readonly="readonly" value='<c:out value="${disease.dname}"/>'><br>
		</div>
		<div class="from-group">
			<label>세부질환</label> <input class="form-control" name=" detail"
				readonly="readonly" value='<c:out value="${disease.detail}"/>'><br>
		</div>
		<div class="from-group">
			<label>이미지</label> <input class="form-control" name="image"
				readonly="readonly" value='<c:out value="${disease.image}"/>'><br>
		</div>
<div class="from-group">
<label>자세한 설명</label>
<textarea class="form-control"   rows="10"  name="symptoms" readonly="readonly" ><c:out value="${disease.symptoms}"/></textarea><br>
</div>		
		<div class="hi-btn">
			<button data-oper='list' class="hi hi-info">목록으로</button>
			<a href="../hospitals/list.do"><button class="hi hi-road">병원찾기</button></a>
		</div>
		
		<!-- 7/20 -->
		<form id='operForm' action="/disease/modify" method="get">
			<input type="hidden" id="bno" name="bno"
				value='<c:out value="${disease.bno }"/>'>
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
		operForm.attr("action", "/disease/modify").submit();
	});
	$("button[data-oper='list']").on("click", function(e) { // button[data-oper=' list']	=> 띄어쓰기도 에러로 인식
		operForm.find("bno").remove();
		operForm.attr("action", "/disease/list").submit();
	});
	/* $("button[data-oper='checkout']").on("click", function(e) {
		operForm.attr("action", "/hospitals/checkout.do").submit();
	}); */
	
</script>











<%@ include file="../includes/footer.jsp"%>