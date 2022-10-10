<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
 <meta name="description" content="" />
 <meta name="author" content="" />
 
<title>question</title>
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />

 <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
 <!-- Google fonts-->
 <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
 <link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
 <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
 <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css"/>
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.4.1.js"   
			integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="   
			crossorigin="anonymous">
</script>
<script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js">
</script>	
</head>
<body>

 <%@include file ="../includes/header.jsp" %>
        
	<h1>예약 조회하기</h1>
	<div class="login-body">
		<div class="login-form">
			<form action="NewFile.do" method="post" name="NewFile">
				<p class="labeled" align ="left">아이디</p>
				  <input type="card-number" class="form-control" id="exampleInput-id" placeholder="아이디를 입력해주세요" maxlength="8"><br>
				<p class="labeled" align="left">예약번호</p>
				<input type="reservation-number" class="form-control" id="exampleInput-reservation-number" placeholder="예약번호를 입력해주세요" maxlength="8"> <br>
				
				
				
				<a href="#"><button type="button" class="submit-btn">조회하기</button></a>
			</form>
			
		
		</div>
	</div>
	

 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<%@include file ="../includes/footer.jsp" %>