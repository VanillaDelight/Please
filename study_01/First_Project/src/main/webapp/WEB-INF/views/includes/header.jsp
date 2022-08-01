<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="navbar">
	<a href="main.do" id="logo"> <img alt="logo"
		src="../../resources/images/logo.png" width="149">
	</a>
	<ul id="menu">
		<li><a href="#">Contact</a></li>
		<li><a href="#">Shop</a></li>
		<li><a href="#">Cart</a></li>
		<c:if test="${ empty user }">
			<li><a href="join.do">Join</a></li>
			<li><a href="login.do">Login</a></li>
		</c:if>
		<c:if test="${ not empty user }">
			<li><a href="logout.do">Logout</a></li>
			<li><a href="#">${user.name }님 반갑습니다</a></li>
		</c:if>
	</ul>
</div>
