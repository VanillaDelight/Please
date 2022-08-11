<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../includes/header.jsp" %>

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">병원 목록</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           병원 상세 정보
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
							<div class="from-group">
								<label>번호</label>
								<input class="form-control"  name="bno"  readonly="readonly"  value='<c:out value="${board.bno}"/>' ><br>
							</div>
							<div class="from-group">
								<label>병원 이름</label>
								<input class="form-control"  name="hosname"  readonly="readonly" value='<c:out value="${board.hosname}"/>' ><br>
							</div>
							<div class="from-group">
								<label>주소 </label>
								<input class="form-control"  name="address"  readonly="readonly" value='<c:out value="${board.address}"/>' ><br>
							</div>
							<div class="from-group">
								<label>전화번호 </label>
								<input class="form-control"  name="phone"  readonly="readonly" value='<c:out value="${board.phone}"/>' ><br>
							</div>
							<div class="from-group">
								<label>진료과목 </label>
								<input class="form-control"  name="subject"  readonly="readonly" value='<c:out value="${board.subject}"/>' ><br>
							</div>
							<div class="from-group">
								<label>진료일 </label>
								<input class="form-control"  name="workday"  readonly="readonly" value='<c:out value="${board.workday}"/>' ><br>
							</div>
							<div class="from-group">
								<label>진료 시간(시작) </label>
								<input class="form-control"  name="opentime"  readonly="readonly" value='<c:out value="${board.opentime}"/>' ><br>
							</div>
							<div class="from-group">
								<label>진료 시간(마감) </label>
								<input class="form-control"  name="closetime"  readonly="readonly" value='<c:out value="${board.closetime}"/>' ><br>
							</div>
							<div class="from-group">
								<label>휴무 </label>
								<input class="form-control"  name="holiday"  readonly="readonly" value='<c:out value="${board.holiday}"/>' ><br>
							</div>
							<div class="from-group">
								<label>휴진 안내 </label>
								<input class="form-control"  name="holisubject"  readonly="readonly" value='<c:out value="${board.holisubject}"/>' ><br>
							</div>
				
						    <button data-oper='list'  class="btn btn-info" >목록으로 돌아가기</button>
						    <button data-oper='list'  class="btn btn-info" >길찾기</button>
						    
						    <!-- 7/20 -->
						    <form id='operForm'  action = "/board/modify" method="get">
						    	<input type="hidden"  id="bno"  name="bno"  value='<c:out value="${board.bno }"/>' >
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
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
  <script>
  		var operForm = $("#operForm");
  		
  		$("button[data-oper='modify']").on("click", function(e){
  			operForm.attr("action", "/board/modify").submit();
  		});
  		$("button[data-oper='list']").on("click", function(e){	// button[data-oper=' list']	=> 띄어쓰기도 에러로 인식
  			operForm.find("bno").remove();
  			operForm.attr("action", "/board/list").submit();
  		});
  		
  </script>       
  
  
  
  
  
  
  
  
  
  
   
 <%@ include file="../includes/footer.jsp" %>