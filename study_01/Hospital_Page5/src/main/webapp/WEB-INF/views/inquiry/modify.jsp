<!-- inquiry/modify -->

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
							<h2 class="title">등록글 수정</h2>
					<!-- /.panel-heading -->
							<div class="detail">
                        
                        	<form role="form"  action="/inquiry/modify"  method="post">
                        	
                        		<input type="hidden" name="pageNum" value='<c:out value="${cri.pageNum}"/>'   >
						    	<input type="hidden" name="amount" value='<c:out value="${cri.amount}"/>'   >
						    	<input type="hidden" name="type" value='<c:out value="${cri.type}"/>'   >
						    	<input type="hidden" name="keyword" value='<c:out value="${cri.keyword}"/>'   >
								
								<div class="from-group">
									<label>번호</label>
									<input class="form-control"  name="bno"  readonly="readonly"  value='<c:out value="${inquiry.bno}"/>' ><br>
								</div>
								
								<div class="from-group">
									<label>제목</label>
									<input class="form-control"  name="title"  value='<c:out value="${inquiry.title}"/>' ><br>
								</div>
								
								<div class="from-group">
									<label>이름</label>
									<input class="form-control"  name="nickname" readonly="readonly" value='<c:out value="${inquiry.nickname}"/>' ><br>
								</div>
								
								<div class="from-group">
									<label>증상</label>
									<input class="form-control"  name="symptom2"  value='<c:out value="${inquiry.symptom2}"/>' ><br>
								</div>
							
								<div class="from-group">
								<label>등록 내용</label>
								<textarea class="form-control"   rows="3"  name="text"><c:out value="${inquiry.text}"/></textarea><br>
								</div>
							
								<div class="from-group">
									<label>등록 시간</label>
									<input class="form-control"  name='regdate'  readonly="readonly" 
									value='<fmt:formatDate pattern="yyyy/MM/dd" value="${inquiry.regdate }"/>' ><br>
								</div>
								
								<div class="from-group">
									<label>수정 시간</label>
									<input class="form-control"  name='updatedate'  readonly="readonly" 
									value='<fmt:formatDate pattern="yyyy/MM/dd" value="${inquiry.updatedate }"/>' ><br>
								</div>
								<div class="hi-btn">
								<button type="submit"  data-oper='modify' class="hi hi-info">글 수정</button>												    
								<button type="submit"   data-oper='remove' class="hi hi-info">글 삭제</button>												    
								<button type="submit"  data-oper='list' class="hi hi-info">목록으로 돌아가기</button>												    
							    </div>
						    </form>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
             
            
 <script type="text/javascript">
 		$(document).ready(function(){
 			
 			var formObj = $("form");
 			
 			$('button').on("click", function(e){
 				e.preventDefault();
 				
 				var operation = $(this).data('oper');
 				console.log(operation);
 				
 				if(operation === 'remove'){
 					formObj.attr("action", "/inquiry/remove");
 				}else if(operation === 'list'){
	 				formObj.attr("action", "/inquiry/list").attr("method","get");
	 			   var pageNumTag = $("input[name='pageNum']").clone();
	 				var amountTag = $("input[name='amount']").clone(); 
	 				var typeTag = $("input[name='type']").clone(); 
	 				var keywordTag = $("input[name='keyword']").clone(); 
	 				formObj.empty();
	 			    formObj.append(pageNumTag);
	 				formObj.append(amountTag); 
	 				formObj.append(typeTag); 
	 				formObj.append(keywordTag); 
 				}
 				formObj.submit();
 			});
 		});
 </script>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 <%@ include file="../includes/footer.jsp"%>