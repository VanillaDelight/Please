<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		if (${result} == 1) {
			alert("등록되었습니다.");
			location.href='EmployServlet?command=employ_list';
		} else {
			alert("다시 시도해주세요.");
			history.back();
		}
	</script>
</body>
</html>