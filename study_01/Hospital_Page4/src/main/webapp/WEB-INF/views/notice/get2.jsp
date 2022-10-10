
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
								value="코로나-19 관련 안과 공지사항"><br>
							</div>
<div class="from-group">
<label>공지사항 내용</label>
<textarea class="form-control"   rows="10"  name="content"  readonly="readonly">
- SARS-CoV-2는 다른 바이러스결막염과 구분이 어려운 경미한 여포결막염을 일으킬 수 있고 
결막염 증상을 보이는 코로나19 확진자의 눈물에서 SARS-CoV-2 RNA가 검출될 수 있으며, 
에어로졸 형태로 결막을 통한 감염 전파의 가능성이 있습니다.

- 결막염으로 의심되는 환자가 발열 혹은 호흡기 증상을 보이거나, 최근 코로나19 유행 지역을 여행했거나, 
코로나 19로 확진된 가족 구성원 혹은 밀접 접촉자가 있다면 그 환자는 이미 SARS-CoV-20에 감염되었을 
가능성이 있습니다.

- 코로나19가 의심되는 환자를 진료할 때 진료 의사는 눈, 코, 입을 보호할 것을 권유합니다.

- 안과용 기구 등을 소독할 때 흔히 쓰이는 알코올 혹은 표백제 기반 소독제가 SARS-CoV-2 살균에 
효과가 있기 때문에 다른 바이러스감염증 전파 예방을 위해 시행해 오던 기존의 진료실 소독 방법(예, 70% 알코올)을 환자 진료 전후에 그대로 시행할 것을 권유하며, 
특히 압평안압계와 같이 환자 신체부위에 접촉하는 기구 소독에 주의를 요합니다.
</textarea><br>
</div>
							<div class="from-group">
								<label>작성자</label>
								<input class="form-control"  name="symptom2"  readonly="readonly"
								value="all in one care 드림"><br>
							</div>
						   <a href="list.do"><button class="btn btn-info" >목록으로 돌아가기</button></a>
						      
                   	    </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->

            
  <script>
  		
  </script>       
  
  
  
  
  
  
  
  
  
  
   
<%@ include file="../includes/footer.jsp"%>