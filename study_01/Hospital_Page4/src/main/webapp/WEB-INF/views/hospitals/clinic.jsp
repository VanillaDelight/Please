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
   <summary>진단서, 세부내역서등 서류 발급 가능한가요?</summary>
   <p>진료에 관한 각종 서류발급은 비대면 진료를 담당했던 병원에 직접 필요한 서류를 말씀하신 후, 이메일과 팩스 등을 통해 수령하실 수 있습니다.</p>
   <p>단, 원내 규정에 따라 발급이 불가 할 수 있습니다.</p>
   
   	<p>※ 꼭 알아두세요! </p>
   	<p>서류 내 병원 직인은 생략하는 경우도 있어 서류 제출처로 병원 도장날인 있어야 하는 서류인지 확인 후 도장날인이 필요할 경우 병원측으로 문의 부탁 드립니다. </p>
   	<p>추후 저희 All-in-one-care서비스 내에서도 서류 발급을 지원할 수 있도록 노력하겠습니다 </p>
   
   
</details>

<details>
   <summary>가족 대리진료 접수 가능한가요?</summary>
   <p>가족 대리 접수는 부모님, 배우자, 자녀에 한하여 가능합니다</p>
   <p>(형제, 자매의 경우 둘 중 하나로 선택 후 진료 접수)</p>
   <p>가족 대리 접수 진료요청서에 실제 진료를 받으실 환자분의 인적사항 입력 후 진료요청 부탁드리며,</p>
   <p>실제 비대면 진료시 병/의원측으로 가족 대리진료임을 한번 더 말씀 부탁드립니다.</p>
   
   
   	<p>👨‍👩‍👧‍👦[가족 대리 접수 방법]👨‍👩‍👧‍👦</p>
   	<p>① All-in-one-care 홈페이지 실행> 진료 대상 선택> 비대면 진료 병원 선택> 진료요청하기 선택> 환자 주민등록번호 뒷자리 기재 및 증상 입력</p>
   	<p>② 가족 대리 접수 선택>가족 인적사항 기재 (연락처, 주민등록번호 뒤 첫째 자리만 입력)> 가족 대리 접수 동의 선택> 가족 추가하기 선택</p>
   
   
</details>

<details>
   <summary>왜 진료가 취소되는 건가요?</summary>
   <p>병원의 운영상황, 응급한 환자 등 병원의 사정에 의해 진료접수가 취소될 수 있는 점 양해 부탁드립니다.</p>
   
</details>

<details>
   <summary>비대면 진료와 진료비 차이가 있나요?</summary>
   <p>비대면 진료비와 대면 진료비는 동일하며, 대면진료와 같이 처방전 발행이 없는 전화상담도 진료비가 발생합니다.</p>
   <p>다만, 비급여 진료의 경우 의료기관에서 책정한 자율금액으로 금액은 상이할 수 있습니다.</p>
   
</details>


 </div>
 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<script>

</script>
<%@include file ="../includes/footer.jsp" %>