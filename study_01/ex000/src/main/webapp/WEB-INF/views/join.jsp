<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../resources/css/join.css" rel="stylesheet" />
</head>
<body>
  <form method="post" action="">
      <div class="container">
    <div class="insert">
    
        <table>
    <caption><h2>회원가입 양식</h2></caption>
    <tr>
        <td class="col1">이름</td>
        <td class="col2"><input type="text" name="name" maxlength="5"></td>
    </tr>
    <tr>
        <td class="col1">아이디</td>
        <td class="col2">
            <input type="text" name="id" maxlength="10">
            <input class='but1' type="button" value="중복확인" onclick="">
        </td>
    </tr>
    <tr>
        <td class="col1">비밀번호</td>
        <td class="col2">
            <input type="password" name="pwd" maxlength="16">
            <p>※비밀번호는 <span class="num">문자, 숫자, 특수문자(~!@#$%^&*)의 조합
            10 ~ 16자리</span>로 입력이 가능합니다.</p>
        </td>
    </tr>
    <tr>
        <td class="col1">비밀번호 확인</td>
        <td class="col2"><input type="password" name="pwdCheck" maxlength="16"></td>
    </tr>
    <tr>
        <td class="col1">이메일</td>
        <td class="col2">
            <input type="text" name="mailid">
            <span class="a">@</span>
            <input type="text" name="email">
            <select name="mailslc">
                <option value="self" selected>직접입력</option>
                <option value="naver">naver.com</option>
                <option value="gm">gmail.com</option>
                <option value="da">daum.com</option>
                <option value="yah">yahoo.com</option>
            </select>
            <input class='but2' type="button" value="이메일 중복확인" onclick="">
        </td>
    </tr>
   
    </table>
    
  </div>
 
  <div class="create">	
	<a href="main"> <button type = "button"  class="btn_1" style="margin:10px;">가 입 취 소</button></a>	
	<a href="main"> <button type = "button"  class="btn_1" style="margin:10px;">회 원 가 입</button></a>	
  </div>
  </div>
  </form>
 </body>
<script>
	
	
	
	$("#home").on("click", function(){
		self.location = "/home";
	});
	
	</script>

