<!-- notice/list -->

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
	<h2 class="title">공지사항 목록</h2>
	<!-- 	<button id="regBtn"  type="button" class="btn btn-primary">글 등록하기</button> -->
			<table class="table table-condensed">
					<thead>
						<tr>
							<!-- <th>번호</th> -->
							<th>제목</th>
							<td>작성자</td>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${list }" var="notice">
						<tr class="odd gradeX">
							<%-- <td><c:out value="${notice.bno}" /></td> --%>
							
							<%-- <td>
								<a href='/board/get?bno=<c:out value="${board.bno}"/>'>
								<c:out value="${board.title}"/></a>
							</td> --%>
							
							<td>
								<a class='move' href=<c:out value="${notice.bno}"/>>
								<c:out value="${notice.title}"/></a>
							</td>
							<td>
								<c:out value="${notice.writer}" />
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				
				<!-- 검색 조건 Start -->
				
				<%-- <form id="searchForm" action="/notice/list" method="get">
					<select name='type'>
						<option value="" <c:out value="${pageMaker.cri.type==null ? 'selected' : ''}"/> ></option>
						<option value="H" <c:out value="${pageMaker.cri.type eq 'H' ? 'selected' : ''}"/>>병원</option>
						<option value="A" <c:out value="${pageMaker.cri.type eq 'A' ? 'selected' : ''}"/>>주소</option>
						<option value="S" <c:out value="${pageMaker.cri.type eq 'S' ? 'selected' : ''}"/>>과목</option>
					</select>
					
					<input type="text" name="keyword"/>
					<input type="hidden" name="pageNum" value='${pageMaker.cri.pageNum}'/>
					<input type="hidden" name="amount" value='${pageMaker.cri.amount}'/>
					<button class="btn btn-default">Search</button>
				</form> --%>
				
				<!-- 검색 조건 end -->
				
				<!-- 페이지 처리 start -->

	<div class="pagi_center">
		<ul class="pagination">
			<c:if test="${pageMaker.prev}">
				<li class="paginate_button previous"><a
					href="${pageMaker.startPage-1}">Previous</a></li>
			</c:if>

			<!-- 		var actionForm = $("#actionForm")
		$(".paginate_button a").on("click", function(e) {
			e.preventDefault();
			console.log('click');
			actionForm.find("input[name='pageNum']").val($(this).attr("href"));		// .val() : value
																					// this : num
																					// .attr() : attribute
																					// href => startPage-1
			actionForm.submit();
				  	 -->

			<c:forEach var="num" begin="${pageMaker.startPage}"
				end="${pageMaker.endPage}">
				<li
					class='paginate_button ${pageMaker.cri.pageNum == num? "active":"" }'>
					<a href="${num}">${num}</a>
				</li>
			</c:forEach>

			<c:if test="${pageMaker.next}">
				<li class="paginate_button next"><a
					href="${pageMaker.endPage+1}">Next</a></li>
			</c:if>
		</ul>
	</div>

	<!-- 페이지 처리 end -->				
				
				<form id="actionForm" action="/notice/list" method="get">
			<!-- 		http://localhost:8181/board/list?pageNum=15&amount=10 -->
					<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">	<!-- pageNum=15 -->
					<input type="hidden" name="amount" value="${pageMaker.cri.amount}">		<!-- amount=10 -->
					<input type="hidden" name="type" value="${pageMaker.cri.type}">
					<input type="hidden" name="keyword" value="${pageMaker.cri.keyword}">
				</form>
				
				<!-- /.table-responsive -->
				<!--Modal 창 추가 -->
				
				<!--  <div id="myModal" class="modal" tabindex="-1" role="dialog">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title">Modal title</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body">
								처리가 완료됬습니다.
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-primary">Save
									changes</button>
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
							</div>
						</div>
					</div>
				</div>  -->
				<!--Modal 창 닫기 -->



			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->

<script>
	$(document).ready(function() {
		var result = '<c:out value="${result}"/>';
		console.log("result" + result);
		
		checkModal(result);
		
		//뒤로가기 모달창 문제 해결
		history.replaceState({},null,null);
		
		function checkModal(result){
			if(result === '' || history.state){
				return ;				
			}
			
			if(parseInt(result) > 0){
				$(".modal-body").html("게시글 " + parseInt(result) + "번이 등록되었습니다.");
			}
			
			$("#myModal").modal("show");
		}
		
		$("#regBtn").on("click",function(){
			self.location = "/notice/register";
		});
		
		var actionForm = $("#actionForm")
		$(".paginate_button a").on("click", function(e) {
			e.preventDefault();
			console.log('click');
			actionForm.find("input[name='pageNum']").val($(this).attr("href"));
			actionForm.submit();
		});
		
		$(".move").on("click",function(e){
			e.preventDefault();
			console.log('test-----------------');
		/*  actionForm.append("<input type = 'hidden' name = 'bno' value= '"+$(this).attr("href")+"'>");  => 작동 */
	/* 	 	actionForm.append("<input type='hidden' name='bno' value='"+$(this).attr("href")"'>"); => 오류 */
	
			actionForm.append("<input type = 'hidden' name = 'bno' value= '"+$(this).attr("href")+"'>");
			actionForm.attr("action", "/notice/get");
			actionForm.submit();
			})
		
			/* var searchForm = $("#searchForm");
		
			$("#searchForm button").on("click",function(e){
				e.preventDefault();
				
				if(!searchForm.find("option:selected").val()) {
					alert("검색 종류를 입력하세요.")
					return false;
				}
				if(!searchForm.find("input[name='keyword']").val()) {
					alert("키워드를 입력하세요.")
					return false;
				}
				searchForm.find("input[name='pageNum']").val("1");
				searchForm.submit();
			}); */
			
	});
</script>

<%@ include file="../includes/footer.jsp"%>










