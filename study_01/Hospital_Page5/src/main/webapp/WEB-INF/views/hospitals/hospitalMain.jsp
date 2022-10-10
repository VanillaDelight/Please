<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Landing Page - Start Bootstrap Theme</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
        <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css"/>
        <script src="https://code.jquery.com/jquery-3.4.1.js"   
			integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="   
			crossorigin="anonymous">
		</script>
		<script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js">
		</script>
    </head>
    <body>
        <!-- Navigation-->
<div class="navbar">
	<a href="../hospitals/hospitalMain.do" id="logo"> <img alt="logo"
		src="../../resources/assets/img/busan.jpg" width="90">
	</a>
	<ul id="menu">
		<c:if test="${ empty user }">
			<li><a href="../hospitals/terms.do">회원가입</a></li>
			<li><a href="../member/login.do">로그인</a></li>
		</c:if>
		<c:if test="${ not empty user }">
			<li><a href="../member/logout.do">로그아웃</a></li>
			<li><a href="../member/my_page.do?id=${user.id }">${user.id }님 반갑습니다</a></li>
		</c:if>
	</ul>
</div>
        
      <div class="nava">
      <ul id="menu">
         <li><a href="../selfDiagnosis/self_main.do">부산의 먹거리</a></li>
         <li><a href="../disease/list.do">부산사람들</a></li>
         <li><a href="list.do">부산의 명소</a></li>
         <li><a href="../pharmacy/list.do">부산 시장</a></li>
         <li><a href="../notice/list.do">부산의 역사</a></li>
         <li><a href=<c:if test="${ not empty user }">"../member/my_page.do?id=${user.id }"</c:if>
         <c:if test="${ empty user }">"../member/login.do"</c:if>>마이페이지</a></li>
      </ul>
   </div>
   
        <!-- Masthead-->
        <header>
            <div class="slide_div_wrap">
				<div class="slide_div">
					<div>
						<a href="../notice/get1.do">
							<img src="${pagaContext.request.contextPath}/resources/assets/img/busanpost.jpg" />
						</a>
					</div>
					<div>
						<a href="../notice/get2.do">
							<img src="${pagaContext.request.contextPath}/resources/assets/img/slide2.png" />
						</a>
					</div>		
					<div>
						<a href="../notice/get3.do">
							<img src="${pagaContext.request.contextPath}/resources/assets/img/slide4.png" />
						</a>
					</div>		
				</div>	
			</div>
        </header>
        
         <section class="features-icons bg-light text-center">
      <div class="container">
         <div class="row">
            <div class="col-lg-4">
               <a class="main-middle" href="../subject/list.do">
                  <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                     <div class="features-icons-icon d-flex">
                        <i id="fifi" class="m-auto text-primary">
                        <img class="middle_image" src="${pagaContext.request.contextPath}/resources/assets/img/251255.png" /></i>
                     </div><br><br>
                     <h3>후기 둘러보기</h3>
                     <p class="lead mb-0">여러 회원님들의 후기가 모두 모여있다!~!</p>
                  </div>
               </a>
            </div>
            <div class="col-lg-4">
               <a class="main-middle" href="reserverecord.do">
                  <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                     <div class="features-icons-icon d-flex">
                        <i class="m-auto text-primary">
                        <img class="middle_image" src="${pagaContext.request.contextPath}/resources/assets/img/789789789.JPG" /></i>
                     </div><br><br>
                     <h3>관광지 예매하기</h3>
                     <p class="lead mb-0">회원님께서 보다 신속하게 예약 현황 조회뿐만 아니라 변경 및 취소를 할 수 있도록 도와드립니다.</p>
                  </div>
               </a>
            </div>
            <div class="col-lg-4">
               <a class="main-middle" href="clinic.do">
                  <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                     <div class="features-icons-icon d-flex">
                        <i class="m-auto text-primary">
                        <img class="middle_image" src="${pagaContext.request.contextPath}/resources/assets/img/456456456.JPG" /></i>
                     </div><br><br>
                     <h3>무엇이든 물어보세요</h3>
                      <p class="lead mb-0">회원님께서 등록해주시는 모든 질문 사항에 대해 전문 가이드가 성심성의껏 답변해드립니다.</p>
                  </div>
               </a>
            </div>
         </div>
      </div>
   </section>

          <!-- Footer-->
   
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <!-- * *                               SB Forms JS                               * *-->
        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
        <%@include file ="../includes/footer.jsp" %>
    </body>
	<script>

	$(document).ready(function(){
		$(".slide_div").slick(
				{
					dots: true,
					autoplay : true,
					autoplaySpeed: 5000
				}		
		);
	});
	

	</script>














