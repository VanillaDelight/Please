<!-- inquiry/register -->

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
							<h2 class="title">등록 페이지</h2>
					<!-- /.panel-heading -->
							<div class="detail">
                           <form role="form" action="/inquiry/register"  method="post">
								<div class="from-group">
									<label>제목</label><input class="form-control"  name="title"  ><br>
								</div>
								<div class="from-group">
									<label>작성자</label><input class="form-control"  name="nickname"  ><br>
								</div>
								<div class="from-group">
									<label>증상</label><input class="form-control"  name="symptom2"  ><br>
								</div>
							    <div class="from-group">
									<label>등록 내용</label><textarea class="form-control"   rows="3"  name="text"></textarea><br>
								</div>
								<div class="hi-btn">
							    <button type="submit" class="hi hi-info">등록</button>
							    <button type="reset" class="hi hi-info">다시 쓰기</button>
                           		</div>
                           </form>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->

 <!-- 여기부터 시작............ -->
<!--  <div class="modal" tabindex="-1" role="dialog" id="myModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        처리가 완료되었습니다.
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">Save changes</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
 -->
 <!-- <script>
 	$(document).ready(function(){
 		var result = '<c:out value="${result}" />'
 		
 		checkModal(result);
 		function checkModal(result){
 			if(result == ' '){
 				return;
 			}
 			if(parseInt(result) > 0 ){
 				$(".modal-body").html("게시글 " + parseInt(result) + " 번이 등록되었습니다.");
 			}
 			$("#myModal").modal("show");
 		}
 		
 		$("#regBtn").on("click", function(){
 			self.location = "/board/register";
 		});
 	});
 </script>    -->
 <%@ include file="../includes/footer.jsp"%>
