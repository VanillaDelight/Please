<!-- notice/get -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<link href="../../resources/css/pagi.css" rel="stylesheet" />

<%@include file="../includes/header.jsp"%>

		           <div class="container">
					<h2 class="title">공지사항</h2>
			<!-- /.panel-heading -->
					<div class="detail">
							<input type="hidden" name="bno" value='<c:out value="${notice.bno}"/>'><br>
							<div class="from-group">
								<label>제목</label>
								<input class="form-control"  name="title"  readonly="readonly" value='<c:out value="${notice.title}"/>' ><br>
							</div>
<div class="from-group">
<label>등록 내용</label>
<textarea class="form-control"   rows="10"  name="content" readonly="readonly" ><c:out value="${notice.content}"/></textarea><br>
</div>
							 <div class="hi-btn">
<!-- 							 	<button data-oper='modify' class="hi hi-info">글 수정</button> -->
						    	<button data-oper='list'  class="hi hi-info" >목록으로 돌아가기</button>
						    </div>
						    <!-- 7/20 -->
						    <form id='operForm'  action = "/notice/modify" method="get">
						    	<input type="hidden"  id="bno"  name="bno"  value='<c:out value="${notice.bno }"/>' >
						    			<!-- Criteria 클래스의 인스턴스 명과 일치 => 자동 바인딩 -->
						  		<input type="hidden" name="pageNum" value='<c:out value="${cri.pageNum}"/>'>
						    	<input type="hidden" name="amount" value='<c:out value="${cri.amount}"/>'>
						    	<input type="hidden" name="type" value='<c:out value="${cri.type}"/>'>
						    	<input type="hidden" name="keyword" value='<c:out value="${cri.keyword}"/>'>
						    </form>
						   
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
 
  <script>
  		var operForm = $("#operForm");
  		
  		$("button[data-oper='modify']").on("click", function(e){
  			operForm.attr("action", "/notice/modify").submit();
  		});
  		$("button[data-oper='list']").on("click", function(e){	// button[data-oper=' list']	=> 띄어쓰기도 에러로 인식
  			operForm.find("bno").remove();
  			operForm.attr("action", "/notice/list").submit();
  		});
  		
  </script>       
  
  
  
  
  
  
  
  
  
  
   
<%@ include file="../includes/footer.jsp"%>