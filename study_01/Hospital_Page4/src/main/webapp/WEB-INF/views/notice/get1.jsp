
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
								value="all in one care 서비스 런칭"><br>
							</div>
<div class="from-group">
<label>공지사항 내용</label>
<textarea class="form-control"   rows="10"  name="content"  readonly="readonly">
- 안녕하세요. all in one care입니다. 지난 8월, **약국 서비스가 오픈한 뒤, 많은 이용자분들과 의료진분들께서 자가 진단과 비대면 진료가 가능한 서비스를 부탁하셨습니다. 
								
이러한 이용자 분들과 의료진 분들의 요구에 맞춰서, 저희는 기존 배달 약국 앱이었던 **약국에서 '자가예상진단'및'비대면 의료 종합 플랫폼'인 all in one care를 새롭게 런칭하게 되었습니다.
								
all in one care을 사용하게 되는 고객님들께서는 기존의 **약국에서 제공했던 '의약품 안전 배달 서비스'뿐만 아니라 고객님들께서 겪고 계신 증상이나 신체적 불편함에 대해 스스로 진단해볼 수 있는 자가예상진단 서비스와
전문 의료진을 통한 비대면 진료 서비스, 병원 진료 신청 및 방문을 통한 대면 진료 서비스까지 제공받을 수 있습니다.
								
앞으로도 고객님들의 요구 사항에 언제나 부응할 수 있는 all in one care가 되겠습니다.
다시 한 번 감사합니다.   
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