package com.it.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.it.dto.BoardVO;

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String USERNAME = "root";
	private final String PASSWORD = "1235";
	
	// 드라이브 등록
	public BoardDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 메모리 할당
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// mysql 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// mysql 해제
	public void disConnection() {
		try {
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 1. 목록 출력
	// 게시물 정보 한개 : BoardVO, 게시물 여러개 : (List)
	public List<BoardVO> boardListData(int page) {
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			// 1. 연결
			getConnection();
			// 2. SQL 문장 작성
			int rowSize = 10;
			int start = (rowSize * page) - rowSize;
			// 10*1 - 10 = 0, 0 ...... 10*2 - 10 = 10, 10.... 10*3 - 10 = 20, 10....
			String sql = "select no, subject, name, DATE_FORMAT(regdate, '%Y-%m-%d'), hit"
					+ "from jspBoard order by no desc limit ?, ?";
			// 3. 전송
			conn.prepareStatement(sql);
			// 4. 데이터 채우기
			pstmt.setInt(1, start);
			pstmt.setInt(2, rowSize);
			// 5. 데이터 실행
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardVO bVo = new BoardVO();
				bVo.setNo(rs.getInt(1));
				bVo.setSubject(rs.getString(2));
				bVo.setName(rs.getString(3));
				bVo.setDbday(rs.getString(4));
				bVo.setHit(rs.getInt(5));
				list.add(bVo);
			}
			//6. 닫기
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	}
	
	// 2. 총 페이지()
	public int boardTotalPage() {
		int total = 0;
		
		try {
			getConnection();
			String sql = "select ceil(count(*)/10.0) from jspBoard";
			
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				total = rs.getInt(1);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		
		return total;
	}
}
