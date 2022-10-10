<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>reservation</title>
<meta charset="utf-8">

<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/findCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="../../resources/css/reservation.css" rel="stylesheet" />

<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="../../resources/js/joinScript.js"></script>
<script src="../../resources/js/doubleChk.js"></script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.2/css/bootstrap-responsive.css">

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.js"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
 <!-- Navigation-->
 <%@include file ="../includes/header.jsp" %>
 
<h1>예약 현황</h1>
<div class="container-fluid px-0 px-sm-4 mx-auto">
  <div class="row justify-content-center mx-0">
    <div class="col-lg-10">
      <div class="card border-0">
        <form autocomplete="off">
          <div class="card-header bg-dark">
            <div class="mx-0 mb-0 row justify-content-sm-center justify-content-start px-1">
              <input type="text" id="dp1" class="datepicker" placeholder="Pick Date" name="date" readonly><span class="fa fa-calendar"></span>
            </div>
          </div>
          <div class="card-body p-3 p-sm-5">
            <div class="row text-center mx-0">
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">9:00AM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">9:30AM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">9:45AM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">10:00AM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">10:30AM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">10:45AM</div></div>
            </div>
            <div class="row text-center mx-0">
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">11:00AM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">11:30AM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">11:45AM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">12:00PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">12:30PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">12:45PM</div></div>
            </div>
            <div class="row text-center mx-0">
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">1:00PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">1:30PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">1:45PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">2:00PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">2:30PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">2:45PM</div></div>
            </div>
            <div class="row text-center mx-0">
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">3:00PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">3:30PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">4:15PM</div></div>
              <div class="col-md-2 col-4 my-1 px-2"><div class="cell py-1">5:00PM</div></div>
            </div>
          </div>
        </form>
      </div>
<div style=" text-align: center;">
 <a href="#"><button type="button" class="submit-btn">예약하기</button></a>
 </div>
    </div>
  </div>
</div>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
<script>
$(document).ready(function(){

	$('.datepicker').datepicker({
	    format: 'dd-mm-yyyy',
	    autoclose: true,
	    startDate: '0d'
	});

	$('.cell').click(function(){
	    $('.cell').removeClass('select');
	    $(this).addClass('select');
	});

	});
</script>
</html>
<%@include file ="../includes/footer.jsp" %>