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
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/question.css" rel="stylesheet" />
 <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
 <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css"/>
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
		details > summary { background:#444; color:#fff; padding:10px; outline:0; border-radius:5px; cursor:pointer; transition:background 0.5s; text-align:left; box-shadow: 1px 1px 2px gray; width:791px; height:25%;  margin-left : 460px;}
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
   <summary>약 배달 어떻게 신청하나요?</summary>
   <p>[All-in-one-care 홈페이지] > [마이페이지] > [주소 등록]를 통해 집/회사 등 수령하실 주소 설정 후 약 수령 방법 확인이 가능합니다.</p>
   <p>각 배송비는 현재 50%~100% 범위 내 할인 제공되고 있으며,이용자분들의 편의를 위해 택배는 무료 배송 유지되고 있습니다. </p>
   <p>[배송비 안내]</p>
   <p>퀵 배송 : 8,000원 (16,000 → 50% 할인 제공)</p>
	<p>오늘 배송 : 3,000원 (10,000원 →70% 할인 제공)</p>
	<p>택배 배송 : 무료 (4,000원 → 100% 할인 제공)</p>
	
	<p>※ 꼭 알아두세요! </p>
	<p>각 배송비는 현재 위치와 시간에 따라 달라 질 수 있습니다.</p>
	<p>택배의 경우 주말 / 공휴일(연휴) 에는 택배사의 사정으로 인해 영업 개시일 이후 배송이 시작됩니다. </p>
	<p>약국 상황에 따라 일부 배송 방법 이용이 어려울 수 있습니다.</p>
</details>



<details>
   <summary>배달/배송 소요시간이 궁금해요</summary>
   <p>📦퀵 배송📦</p>
   <p>평일 저녁 9시, 주말 저녁 8시까지 약값 결제 시 당일 약 배송</p>
   <p>※ 꼭 알아두세요!</p> 

<p>배송비는 위치와 시간에 따라 달라질 수 있습니다.</p>
<p>제휴약국의 의약품 재고부족 등 운영 상황에 따라 변동이 있을 수 있습니다.</p>
<p>처방전 전송 후 결제 완료 시에만 정상적으로 접수됩니다.</p>

<p>🏍오늘 배송🏍</p>
<p>평일, 토요일 오후 3시30분까지 약값 결제 시 당일 약 배송</p>
<p>※ 꼭 알아두세요!</p> 
<p>제휴약국의 의약품 재고부족 등 운영 상황에 따라 변동이 있을 수 있습니다.</p> 
<p>처방전 전송 후 결제 완료 시에만 정상적으로 접수됩니다.</p> 
   



   <p>📦택배 배송📦</p>
   <p>평일 오전 9시 ~ 오후 9시까지 약값 결제 시 영업일 기준 2 ~ 3일 내 약 배송</p>
   <p>※ 꼭 알아두세요!</p> 
   <p>제휴약국의 의약품 재고부족 등 운영 상황에 따라 변동이 있을 수 있습니다.</p> 
   <p>처방전 전송 후 결제 완료 시에만 정상적으로 접수됩니다.</p> 
   <p>택배사 사정에 따라 배송이 지연될 수 있으며, 주말 및 공휴일 (연휴)의 경우 영업 개시일 이후 부터 배송이 시작됩니다.</p>
   
</details>

<details>
   <summary>계속 조제중이라고 떠요</summary>
   <p>설정된 주소를 기준으로 가까운 제휴약국에 연결되며, 제휴약국의 의약품 운영/재고 상황에 따라 조제가 불가한 경우 연결되는 반경은 넓어집니다.</p>
   <p>또한, 약국 운영 상황에 따라 약 조제 단계에서 시간이 다소 소요될 수 있습니다.</p>
   <p>약국 운영 상황에 따른 부분이므로 양해 부탁드립니다.</p>

</details>

<details>
   <summary>약국으로 직접 방문해서 조제 가능한가요?</summary>
   <p>All-in-one-care는 [보건복지부의 비대면 진료 한시적 허용 지침] 공고와 정부의 운영 지침에 따라 </p>
   <p>비대면 진료 및 처방전 약국 접수, 약 수령 서비스를 제공하고 있습니다.</p>
   <p>번거로우시겠지만,</p>
   <p>주변 약국에 전화해 처방전에 기입된 의약품의 조제가 가능한지 재고 여부를 확인해주시고 처방전을 프린트해서 방문접수 해주시거나, </p>
   <p>All-in-one-care 홈페이지에서 수령방법을 ‘방문수령’으로 선택하신 후 약국 팩스번호를 입력하여 처방전 전송 후 </p>
   <p>해당 약국으로 방문해주시기를 부탁 드립니다. </p>
</details>

<details>
   <summary>택배 운송장 번호 조회가 안돼요</summary>
   <p>택배 서비스의 경우 조제 완료일 다음날 약국에서 택배사로 인계되며,송장조회는 해당 일 자정 이후부터 확인 가능한 점 양해 부탁드립니다. </p>
   <p>택배사 사정에 따라 배송이 지연될 수 있으며,주말 및 공휴일 (연휴)의 경우 영업 개시일 이후부터 배송이 시작됩니다.</p>
   <p>만일, 이후에도 계속 조회가 안될 경우 고객센터를 통해 문의 부탁 드립니다.</p>
</details>


 </div>
 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<script>


</script>
<%@include file ="../includes/footer.jsp" %>