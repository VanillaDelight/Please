<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>자가예상진단</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="../../resources/css/styles.css" rel="stylesheet" />
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
        <nav class="navbar navbar-light bg-light static-top">
            <div class="container nava">
                <a class="navbar-brand" href="#!">All in one Care</a>
                <ul id="menu">
                 <!-- <li><button type="button" id="login">로그인</button></li> -->
		         <li><a href="main">로그아웃</a></li>
		         <li><a href="#">병원 찾기</a></li>
		         <li><a href="#">약국 찾기</a></li>
		         <li><a href="#">고객센터</a></li>
		         <li><a href="#">마이페이지</a></li>
      			</ul>
            </div>
            
        </nav>
          
         <section class="features-icons bg-light text-center">
      <div class="container">
         <div class="row">
            <div class="col-lg-4">
               <a class="main-middle" href="#">
                  <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                     <div class="features-icons-icon d-flex">
                        <i id="fifi" class="m-auto text-primary">
                        <img class="middle_image" src="${pagaContext.request.contextPath}/resources/assets/img/머리.JPG" /></i>
                     </div><br><br>
                     <h3>머리</h3>
                  </div>
               </a>
            </div>
            <div class="col-lg-4">
               <a class="main-middle" href="#">
                  <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                     <div class="features-icons-icon d-flex">
                        <i class="m-auto text-primary">
                        <img class="middle_image" src="${pagaContext.request.contextPath}/resources/assets/img/눈.JPG" /></i>
                     </div><br><br>
                     <h3>눈</h3>
                  </div>
               </a>
            </div>
            <div class="col-lg-4">
               <a class="main-middle" href="#">
                  <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                     <div class="features-icons-icon d-flex">
                        <i class="m-auto text-primary">
                        <img class="middle_image" src="${pagaContext.request.contextPath}/resources/assets/img/귀.JPG" /></i>
                     </div><br><br>
                     <h3>귀</h3>
                  </div>
               </a>
            </div>
         </div>
      </div>
   </section>

          <!-- Footer-->
   <footer class="footer bg-light">
      <div class="container">
         <div class="row">
            <div class="col-lg-6 h-100 text-center text-lg-start my-auto">
               <ul class="list-inline mb-2">
                  <li class="list-inline-item"><a href="#!">인터넷 이용약관</a></li>
                  <li class="list-inline-item">⋅</li>
                  <li class="list-inline-item"><a href="#">위로가기</a></li>
               </ul>
               <p class="text-muted small mb-4 mb-lg-0">&copy; Your Website
                  2022. All Rights Reserved.</p>
            </div>
            <div class="col-lg-6 h-100 text-center text-lg-end my-auto">
               <ul class="list-inline mb-0">
                  <li class="list-inline-item me-4"><a href="#!"><i
                        class="bi-facebook fs-3 icon"></i></a></li>
                  <li class="list-inline-item me-4"><a href="#!"><i
                        class="bi-twitter fs-3 icon"></i></a></li>
                  <li class="list-inline-item"><a href="#!"><i
                        class="bi-instagram fs-3 icon"></i></a></li>
               </ul>
            </div>
         </div>
      </div>
   </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <!-- * *                               SB Forms JS                               * *-->
        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
    </body>
	<script>

	$("#main").on("click",function() {
		self.location = "/main";
	});
	
	</script>














