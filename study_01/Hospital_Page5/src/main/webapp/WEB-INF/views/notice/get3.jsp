
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
							<div class="from-group">
								<label>제목</label>
								<input class="form-control"  name="title"  readonly="readonly"
								value="병원 진료 시 환자 확인 안내"><br>
							</div>
<div class="from-group">
<label>공지사항 내용</label>
<textarea class="form-control"   rows="10"  name="content"  readonly="readonly">
- 안녕하세요. 오늘도 all in one care 홈페이지를 이용해주시는 여러분들에게 다시 한 번 감사의 말씀을 드립니다.
최근 들어서 병원 대리 진료 신청이나 사칭 등으로 인해 환자 진료 과정에서 혼란이 발생하는 일이 잦아지고 있습니다.
								
그렇기 때문에, 혹시나 all in one care로 병원 진료를 신청하시는 고객님들이 계시다면, 다소 번거롭게 느껴질 수 있더라도 
병원의 부서를 방문할 때마다 고객님의 개인 정보(성명과 생년 월일 또는 등록 번호)를 정확하게 알려주시면 감사하겠습니다.  
								
의료진이 확인한 환자의 개인정보는 오로지 환자 본인 확인을 위해서만 사용되는 것이므로 안심하셔도 됩니다.
고객님들께서도 조금은 불편하시더라도 정확한 환자 확인을 위해 너그러운 마음으로 협조해주시면 감사하겠습니다.
								
all in one care 또한, 언제나 고객님들에게 더 좋은 서비스를 제공하기 위해 최선을 다하겠습니다.
</textarea><br>
</div>
							<div class="from-group">
								<label>작성자</label>
								<input class="form-control"  name="symptom2"  readonly="readonly"
								value="all in one care 드림"><br>
							</div>
						   <a href="list.do">
						   <button class="btn btn-info" >목록으로 돌아가기</button></a>
						   
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->

            
  <script>
  		
  </script>       
  
  
  
  
  
  
  
  
  
  
   
<%@ include file="../includes/footer.jsp"%>