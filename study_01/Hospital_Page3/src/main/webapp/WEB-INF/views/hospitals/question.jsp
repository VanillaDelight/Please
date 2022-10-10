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
<style>
        #test_btn1{
           width:15%; height:15% margin-right:-4px;
        }
        #test_btn2{
            width:15%; height:15% margin-left:-3px;
        }
        #test_btn3{
           width:15%; height:15%  margin-left:-6px;
        }
        #test_btn4{
           width:15%; height:15%  margin-left:-7px;
        }
        #btn_group button{
            border: 1px solid skyblue;
            background-color: rgba(0,0,0,0);
            color: skyblue;
            padding: 5px;
            text-align:center;
        }
		
		#btn_group button:hover{
            color:white;
            background-color: skyblue;
        }
        
		details { margin:5px 0 10px;}
		details > summary { background:#444; color:#fff; padding:10px; outline:0; border-radius:5px; cursor:pointer; transition:background 0.5s; text-align:left; box-shadow: 1px 1px 2px gray; width:791px; height:25%;  margin-left : 308px;}
		details > summary::-webkit-details-marker { background:#444; color:#fff; background-size:contain; transform:rotate3d(0, 0, 1, 90deg); transition:transform 0.25s;}
		details[open] > summary::-webkit-details-marker { transform:rotate3d(0, 0, 1, 180deg);}
		details[open] > summary { background:skyblue;}
		details[open] > summary ~ * { animation:reveal 0.5s;}
		.tpt { background:#444; color:#fff; margin:5px 0 10px; padding:5px 10px; line-height:25px; border-radius:5px; box-shadow: 1px 1px 2px gray;}

@keyframes reveal {
    from { opacity:0; transform:translate3d(0, -30px, 0); }
    to { opacity:1; transform:translate3d(0, 0, 0); }
}

    </style>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body>
 <!-- Navigation-->
<%@include file ="../includes/header.jsp" %>

<div class="container">
        <!-- 수평선 긋기 -->
        <p></p>
 <h3><span style="text-align:left;">FAQ </span></h3><h6><span style="color:#A2A2A2">: 자주 묻는 질문들</span></h6>
        <!-- 수평선 긋기 -->
        <hr class="my-2">
        <div id="btn_group">
        <div style="text-align:center;">
       <a href="question.do"><button id="test_btn1">이용문의</button></a>
        <a href="randc.do"><button id="test_btn2">결제</button></a>
        <a href="delivery.do"><button id="test_btn3">배달</button></a>
        <a href="clinic.do"><button id="test_btn4">진료문의</button></a>
    </div>
	</div>
</div>

	<div style="text-align:center;" >
<details>
   <summary>처방전은 어디서 확인할 수 있나요?</summary>
   <p>[진료내역] > [처방전]을 통해 [약국제출용 처방전] 확인이 가능하며, 처방전 하단 사용기간을 꼭 확인해주세요.</p>
   <p>환자보관용 처방전은 비대면 진료기관으로 별도 문의 부탁드립니다.</p>
   
</details>

<details>
   <summary>All-in-one-care 병원/약국 제휴 하고싶어요</summary>
   <p>홈페이지 [제휴신청]으로 신청해주시면 순차적으로 회신 드리도록 하겠습니다. 🙏</p>
   <p>최대한 빠른 연락 드리겠으나, 접수량 폭증으로 응대 지연될 수 있습니다.
최대 2~3주 정도 소요되는 점 양해 부탁 드립니다. 😃</p>
   
   <p>제휴신청 : </p>
   
</details>

<details>
   <summary>진료 없이 일반약 배달 가능한가요?</summary>
   <p>닥터나우는 비대면 진료 후 발행된 처방전 기반으로 약 조제 및 배송 서비스를 이용하실 수 있습니다.</p>
   <p>비대면 진료없이 약만 수령하실 수 없는 점 양해 부탁드립니다. 🙏</p>
   
</details>

<details>
   <summary>휴대폰 번호를 변경하고 싶어요</summary>
   <p>최초 1회에 한하여 휴대폰 본인인증이 진행됨에 따라</p>
   <p>휴대폰번호 변경은 [상담원 연결] > 성함, 기존 휴대폰 번호와 함께 문의 부탁 드립니다.😃</p>
   
</details>
 </div>
 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<script>


</script>
<%@include file ="../includes/footer.jsp" %>