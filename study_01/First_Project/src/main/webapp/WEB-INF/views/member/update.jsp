<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
<meta charset="utf-8">
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/findCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="../../resources/js/joinScript.js"></script>
<script src="../../resources/js/doubleChk.js"></script>
</head>
<body>
<%@include file ="../includes/header.jsp" %>
	<h1>My Page Update</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="update.do" method="post" name="my_page">
				<p class="labeled">아이디</p>
				<input type="text" name="id" id="id" class="text-field" value='<c:out value="${member.id }"></c:out>' readonly><br>
				<p class="labeled">성함</p>
				<input type="text" name="name" id="name" class="text-field" value='<c:out value="${member.name }"></c:out>'><br>
				<p class="labeled">이메일</p>
				<input type="text" name="email" id="email" class="text-field" value='<c:out value="${member.email }"></c:out>'><br>
				<p class="labeled">전화번호</p>
				<input type="text" name="phone" id="phone" class="text-field" value='<c:out value="${member.phone }"></c:out>'><br>
				<p class="labeled">가입날짜</p>
				<input type="text" class="text-field" value='<fmt:formatDate value="${member.join_date }" pattern="yyyy-MM-dd"/>' readonly><br>
				<input type="submit" value="정보 수정하기" class="submit-btn" id='update_member'><br>
			</form>
		</div>
	</div>
<%@include file ="../includes/footer.jsp" %>
</body>
<script>
</script>
</html>