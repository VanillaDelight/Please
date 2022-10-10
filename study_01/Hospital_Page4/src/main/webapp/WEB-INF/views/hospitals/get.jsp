<!-- hospital/get -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<link href="../../resources/css/pagi.css" rel="stylesheet" />
<link href="../../resources/css/review.css" rel="stylesheet" />
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/resources/js/reply.js"></script> 

<%@include file="../includes/header.jsp"%>

<div class="container">
	<h2 class="title">병원 상세 정보</h2>
	<!-- /.panel-heading -->
	<div class="detail">
		
			 <input type="hidden" name="bno" value='<c:out value="${hospitals.bno}"/>'><br>
		
		<div class="from-group">
			<label>병원 이름</label> <input class="form-control" name="hosname"
				readonly="readonly" value='<c:out value="${hospitals.hosname}"/>'><br>
		</div>
		<div class="from-group">
			<label>주소 </label> <input class="form-control" name="address"
				readonly="readonly" value='<c:out value="${hospitals.address}"/>'><br>
		</div>
		<div class="from-group">
			<label>전화번호 </label> <input class="form-control" name="phone"
				readonly="readonly" value='<c:out value="${hospitals.phone}"/>'><br>
		</div>
		<div class="from-group">
			<label>진료과목 </label> <input class="form-control" name="subject"
				readonly="readonly" value='<c:out value="${hospitals.subject}"/>'><br>
		</div>
		<div class="from-group">
			<label>진료일 </label> <input class="form-control" name="workday"
				readonly="readonly" value='<c:out value="${hospitals.workday}"/>'><br>
		</div>
		<div class="from-group">
			<label>진료 시간(시작) </label> <input class="form-control" name="opentime"
				readonly="readonly" value='<c:out value="${hospitals.opentime}"/>'><br>
		</div>
		<div class="from-group">
			<label>진료 시간(마감) </label> <input class="form-control"
				name="closetime" readonly="readonly"
				value='<c:out value="${hospitals.closetime}"/>'><br>
		</div>
		<div class="from-group">
			<label>휴무 </label> <input class="form-control" name="holiday"
				readonly="readonly" value='<c:out value="${hospitals.holiday}"/>'><br>
		</div>
		<div class="from-group">
			<label>휴진 안내 </label> <input class="form-control" name="holisubject"
				readonly="readonly"
				value='<c:out value="${hospitals.holisubject}"/>'><br>
		</div>
		<div class="hi-btn">
			<button data-oper='list' class="hi hi-info">목록으로</button>
			<a href="../hospital_address/hosaddress.do"><button class="hi hi-road">길찾기</button></a>
			<!-- <button data-oper='checkout' class="hi hi-road">결제하기</button> -->
			 <button data-oper='reservation' class="hi hi-road">예약하기</button>
		</div>
		<!-- 7/20 -->
		<form id='operForm' action="/hospitals/modify" method="get">
			<input type="hidden" id="bno" name="bno"
				value='<c:out value="${hospitals.bno }"/>'>
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
<!-- /.panel -->
	<form class="detail" name="myform" id="myform" method="post">
		<fieldset>
			<span class="text-bold">별점을 선택해주세요</span>
			<input type="radio" class="reviewStar" name="rate" value="5" id="rate5"><label
				for="rate5">★</label>
			<input type="radio" class="reviewStar" name="rate" value="4" id="rate4"><label
				for="rate4">★</label>
			<input type="radio" class="reviewStar" name="rate" value="3" id="rate3"><label
				for="rate3">★</label>
			<input type="radio" class="reviewStar" name="rate" value="2" id="rate2"><label
				for="rate2">★</label>
			<input type="radio" class="reviewStar" name="rate" value="1" id="rate1"><label
				for="rate1">★</label>
		</fieldset>
		<div class="right">
			<textarea class="col-auto form-control" type="text" id="reviewContents"
					  placeholder="리뷰를 남겨주세요~"></textarea> <input type="button" value="등록" id="registerBtn">
		</div>
	</form>		
	<div id="chat-box">
      <div class=" bubble friend-bubble">
        첫 리뷰를 남겨주세요!
      </div>
    </div>
</div>

<script>
	var operForm = $("#operForm");

	$("button[data-oper='modify']").on("click", function(e) {
		operForm.attr("action", "/hospitals/modify").submit();
	});
	$("button[data-oper='list']").on("click", function(e) { // button[data-oper=' list']	=> 띄어쓰기도 에러로 인식
		operForm.find("bno").remove();
		operForm.attr("action", "/hospitals/list").submit();
	});
	/* $("button[data-oper='checkout']").on("click", function(e) {
		operForm.attr("action", "/hospitals/checkout.do").submit();
	}); */
	 $("button[data-oper='reservation']").on("click", function(e) {
		operForm.attr("action", "/hospitals/reservation.do").submit();
	}); 
	
	  
	  
	  $(document).ready(function(){
		  var reviewStar;
		  console.log($('#rate3'));
		  $('#rate1').click( function() {
			  reviewStar = 1;
	        } );
		  $('#rate2').click( function() {
			  reviewStar = 2;
	        } );
		  $('#rate3').click( function() {
			  reviewStar = 3;
	        } );
		  $('#rate4').click( function() {
			  reviewStar = 4;
	        } );
		  $('#rate5').click( function() {
			  reviewStar = 5;
	        } );
		  var bnoValue= '<c:out value= "${hospitals.bno}" />';
		  var replyer= '<c:out value= "${user.name}" />';
		  var replyDiv= $("#chat-box");
		  var reviewContents= $("#reviewContents");
		  var id= '<c:out value= "${user.id}"/>'
		  
		  showList();
		 var registerBtn = $("#registerBtn");
		  registerBtn.on("click", function(e){
		console.log(replyer);
			  if (replyer == ' ') {
				  alert("로그인 후 리뷰 작성 가능합니다.");
				  location.href="../member/login.do";
				  return;
			  }
			  var replys = {
					  reply : reviewContents.val(),
					  replyer : replyer,
					  bno : bnoValue,
					  rate : reviewStar,
					  id : id
					  }  //javascript 객체
			  
			  replyService.add(replys,  function(result){
				  alert("result : " + result);
				  reviewContents.val("");
				  showList();
			  });
			  
		  }); //Register 등록
		  function showList(){
			 
			  replyService.getList({bno:bnoValue},
				
					  function(data){
					
						var str="";
						if(data == null || data.length==0){
							console.log("데이터 없다");
							return ;
						}
						for(var i = 0, len = data.length || 0; i < len; i++){
							if (data[i].replyer == replyer) {
								str += "<div class='bubble my-bubble'>";
							} else {
								str += "<div class='bubble friend-bubble'>";
							}
							str += "<div class='re-replyer'>" + data[i].replyer + "</div>";
							if (data[i].rate == '1') {
								str += "<div class='re-stars'>★</div>";
							} else if(data[i].rate == '2') {
								str += "<div class='re-stars'>★★</div>";
							} else if(data[i].rate == '3') {
								str += "<div class='re-stars'>★★★</div>";
							} else if(data[i].rate == '4') {
								str += "<div class='re-stars'>★★★★</div>";
							} else {
								str += "<div class='re-stars'>★★★★★</div>";
							}
							str += "<div class='re-content'>" + data[i].reply + "</div>";
							str += "<div class='date'>"+ replyService.displayTime(data[i].replyDate) +"</div>";
							str += "</div>";
						}
						replyDiv.html(str);
					} 
			  ); //end Service
		  } //end showList
	  });
		 /* var modal = $("#myModal");    //$(".myModal");
		 var modalInputReply = modal.find("input[name='reply']");
		 var modalInputReplyer = modal.find("input[name='replyer']");
		 var modalInputReplyDate = modal.find("input[name='replyDate']");
		 
		 var modalModBtn = $("#modalModBtn");
		 var modalRemoveBtn = $("#modalRemoveBtn");
		 /* 
		 modalRemoveBtn.on("click", function(){
			 let rno = modal.data("rno");
			
			 replyService.remove(rno, function(result){
				 alert("result : " + result);
				 modal.modal("hide");
				 showList(pageNum);
			 });
		 }); //삭제하기
		 
		 modalModBtn.on("click", function(e){
			 var reply = {
					 rno : modal.data("rno"),
					 reply : modalInputReply.val()
			 };
			 
			 replyService.update(reply, function(result){
				 alert("result : " + result);
				 modal.modal("hide");
				 showList(pageNum);
			 });
		 }); //수정하기
		 
		  $("#addReplyBtn").on("click",function(){
			  
			  modal.find("input").val("");
			  modalInputReplyDate.closest("div").hide();
			  modal.find("button[id != 'modalCloseBtn']").hide();
			  
			  modalRegisterBtn.show();
			  $("#myModal").modal("show");
			  
		  });
		  
		   */
</script>

<%@ include file="../includes/footer.jsp"%>









