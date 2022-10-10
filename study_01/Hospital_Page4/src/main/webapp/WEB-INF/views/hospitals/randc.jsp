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
   <summary>결제수단 및 할부결제 궁금해요</summary>
   <p>현재 신용카드(체크카드)를 통한 일시불 결제만 가능하며, 신용카드 결제 외 다른 결제수단은 제공 드리지 않는 점 양해 부탁 드립니다.
	<p>1. 본인카드 등록</p>

	<p>휴대폰 본인인증 명의자의 본인 소유 카드 등록이 가능합니다.</p>

<p>2. 타인카드 등록</p>

<p>휴대폰 본인인증 명의자 외 타인 소유 카드도 등록이 가능합니다.</p>
<p> 다만, 이 경우 카드사에 따라 등록 거절될 수 있는점 참고 부탁드립니다. 타인카드 등록시 등록실패될 경우 다른 카드사를 이용해주세요.</p>

 

<p>[All-in-one-care 홈페이지 로그인] > [마이페이지] > [카드정보] > [결제 수단 추가]에서 카드 등록 및 등록된 카드 삭제 가능합니다.</p>

 

<p>[📌 카드 등록 불가 ]</p>

<p>법인카드 등록할 경우</p>

<p>해외발급 카드인 경우</p>

<p>비밀번호 3회 이상 오류 발생 등 카드정보가 불일치한 경우</p>
 
  
</details>

<details>
   <summary>카드 등록하려는데 '결제 정보 등록에 실패했습니다' 라고 떠요</summary>
   <p>카드 소유자의 정보가 일치하지 않을 경우 카드등록은 불가합니다.</p>
	<p>카드 비밀번호 누적 3회 이상  불일치 발생된 경우 카드사의 요청으로 카드 등록이 임시 중지되오니, </p>

	<p>카드사로 비밀번호 오류 해제 문의 부탁 드립니다.</p>

<p>(비밀번호 오류 해제 후에도 자정 이후부터 다시 등록 가능합니다.)</p>

</details>

<details>
   <summary>카드만 등록했는데 100원이 결제 됐어요</summary>
   <p>등록된 카드가 실제로 결제 가능한 카드인지 확인하기 위해 100원이 결제되고 즉시 취소 됩니다.</p>
	<p>※ 체크카드의 경우 잔액이 100원 이상 있어야 가능합니다</p>
</details>

<details>
   <summary>의료비 공제 가능한가요?</summary>
   <p>All-in-one-care를 통해 결제된 진료비/조제비는 연말정산 시 의료비 공제 가능합니다.</p>

</details>
 </div>
 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<script>


</script>
<%@include file ="../includes/footer.jsp" %>