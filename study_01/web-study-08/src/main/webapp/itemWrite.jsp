<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "scott";
	String pass = "TIGER";
	String sql = "select * from item";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="100%" style="text-align: center;">
		<tr>
			<th>상품명</th><th>가격</th><th>설명</th>
		</tr>
<%
try {
	// 1. 드라이브 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	// 2. 연결
	conn = DriverManager.getConnection(url, uid, pass);
	// 3. sql 문장 작성
	stmt = conn.createStatement();
	// 4. sql 문장 실행
	rs = stmt.executeQuery(sql); // 실행 버튼 누르는것이라고 보면 됨. rs가 첫번째 데이타의 주소값을 가지고있음..
	// 5. 실행된 결과물을 rs를 통해서 출력
	while (rs.next()) {
		out.println("<tr>");
		out.println("<td>" + rs.getString("name") + "</td>");
		out.println("<td>" + rs.getString("price") + "</td>");
		out.println("<td>" + rs.getString("description") + "</td>");
		out.println("</tr>");
	} // while의 끝
} catch(Exception e) {
	e.printStackTrace();
} finally {
	try {
		if (rs != null) rs.close();
		if (stmt != null) stmt.close();
		if (conn != null) conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
} // finally의 끝
%>
	</table>
<a href="itemWriteForm.jsp">더 등록하기</a>
</body>
</html>