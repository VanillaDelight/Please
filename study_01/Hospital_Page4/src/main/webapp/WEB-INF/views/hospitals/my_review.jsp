<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />

<link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/findCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css"
	rel="stylesheet">
	<link href="../../resources/css/pagi.css" rel="stylesheet" />

<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous">
	
</script>
<script src="../../resources/js/joinScript.js"></script>
<script src="../../resources/js/doubleChk.js"></script>
<script type="text/javascript"
	src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js">
	
</script>
<title>Insert title here</title>
</head>
<body>

	<%@include file="../includes/header.jsp"%>
	<c:if test="${ empty list }">
		<form action="my_review.do" method="post" name="my_page">
			<h2 style="margin-top: 70px;">
				<p style="text-align: center";>내가 쓴 리뷰</p>
			</h2>
			<div style="text-align: center;">

				<img class="my_review_image"
					src="${pagaContext.request.contextPath}/resources/assets/img/review.jpg"
					width="400px" height="300px" /></i> <br> <a href="my_page.do"><button
						type="button" class="submit-btn">돌아가기</button></a> <br>
			</div>
		</form>
	</c:if>
	<c:if test="${ not empty list }">
		<div class="container">
			<h2 class="title">내가 쓴 리뷰</h2>
			<table class="table table-condensed">
				<thead>
					<tr>
						<th>병원 번호</th>
						<th>리뷰 내용</th>
						<th>작성 일시</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list }" var="review">
						<tr class="odd gradeX">
							<td><c:out value="${review.bno}" /></td>

							<td>
								<a href='/hospitals/get?bno=<c:out value="${review.bno}"/>'>
								<c:out value="${review.reply}"/></a>
							</td>

							<td><fmt:formatDate pattern="yyyy-MM-dd"
									value="${review.replyDate}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:if>
</body>
</html>
<%@include file="../includes/footer.jsp"%>