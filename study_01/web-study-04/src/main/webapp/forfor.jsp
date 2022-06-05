<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num = Integer.parseInt(request.getParameter("end"));
		String sum = "";
		int all = 0;
	%>

	<h1>1부터 <%=num %>까지 자연수 합 구하기</h1>
	<%
		for (int i = 1; i <= num; i++) {
			if (i == num) {
				sum += i + "=";
				all += i;
				sum += all;
				break;
			}
			sum += i + "+";
			all += i;
		}
	%>
	<b><%=sum %></b>
</body>
</html>