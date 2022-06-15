package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.BoardVO;

import util.DBManager;

public class BoardDAO {
	private BoardDAO() {}
	private static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstace() {
		return instance;
	}

	public List<BoardVO> selectAllBoards() {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			String sql = "select num, pass, name, email, title, content, readcount, writedate from board order by num desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardVO bVo = new BoardVO();
				bVo.setNum(rs.getInt(1));
				bVo.setPass(rs.getString(2));
				bVo.setName(rs.getString(3));
				bVo.setEmail(rs.getString(4));
				bVo.setTitle(rs.getString(5));
				bVo.setContent(rs.getString(6));
				bVo.setReadcount(rs.getInt(7));
				bVo.setWritedate(rs.getTimestamp(8));
				
				boardList.add(bVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.closeConnection(conn, pstmt, rs);
		}
		
		return boardList;
	}
	
	public void insertBoard(BoardVO bVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			String sql = "insert into board (num, name, email, pass, title, content) "
					+ "values(board_seq.nextval, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bVo.getName());
			pstmt.setString(2, bVo.getEmail());
			pstmt.setString(3, bVo.getPass());
			pstmt.setString(4, bVo.getTitle());
			pstmt.setString(5, bVo.getContent());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.closeConnection(conn, pstmt);
		}
	}
}
