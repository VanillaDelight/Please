<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<div class="navbar">
	<a href="../hospitals/hospitalMain.do" id="logo"> <img alt="logo"
		src="../../resources/assets/img/logoimg.png" width="90">
	</a>
	<ul id="menu">
		<c:if test="${ empty user }">
			<li><a href="../hospitals/terms.do">회원가입</a></li>
			<li><a href="../member/login.do">로그인</a></li>
			<li><a href="../inquiry/list.do">무엇이든 물어보세요</a></li>
		</c:if>
		<c:if test="${ not empty user }">
			<li><a href="../member/logout.do">로그아웃</a></li>
			<li><a href="../member/my_page.do?id=${user.id }">${user.name }님 반갑습니다</a></li>
		</c:if>
	</ul>
</div>