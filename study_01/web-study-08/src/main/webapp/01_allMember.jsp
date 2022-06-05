<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:XE"; // 암기해야됨!!!!!!!!!
	String uid = "scott";
	String pass = "TIGER";
	String sql = "select * from member";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="800" border="1">
		<tr>
			<th>이름</th><th>아이디</th><th>암호</th><th>이메일</th>
			<th>전화번호</th><th>권한(1:관리자, 0:일반회원)</th>
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
			out.println("<td>" + rs.getString("userid") + "</td>");
			out.println("<td>" + rs.getString("pwd") + "</td>");
			out.println("<td>" + rs.getString("email") + "</td>");
			out.println("<td>" + rs.getString("phone") + "</td>");
			out.println("<td>" + rs.getInt("admin") + "</td>");
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
</body>
</html>