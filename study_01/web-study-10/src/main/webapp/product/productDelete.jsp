<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/shopping.css">
<script type="text/javascript" src="script/product.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>상품 삭제 - 관리자 페이지</h1>
		<form method="post" name="frm">
			<input type="hidden" name="code" value="${product.code }">
			<table>
				<tr>
					<td>
						<c:choose>
							<c:when test="${empty product.pictureUrl }">
								<img alt="no" src="upload/noimage.gif">
							</c:when>
							<c:otherwise>
								<img alt="${product.pictureUrl }" src="upload/${product.pictureUrl }">
							</c:otherwise>
						</c:choose>
					</td>
					<td>
						<table>
							<tr>
								<th style="width: 80px">상품명</th>
								<td>
									<input type="text" name="name" value="${product.name }" readonly size="80">
								</td>
							</tr>
							<tr>
								<th>가 격</th>
								<td>
									<input type="text" name="price" value="${product.price }" readonly>원
								</td>
							</tr>
							<tr>
								<th>설 명</th>
								<td>
									<textarea rows="10" cols="90" name="description" readonly>${product.description }</textarea>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="삭제" onclick="return productCheck()"> 
			<input type="button" value="목록" onclick="location.href='productList.do'">
		</form>
	</div>
</body>
</html>