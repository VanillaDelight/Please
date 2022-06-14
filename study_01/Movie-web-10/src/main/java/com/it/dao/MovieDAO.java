package com.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.it.dto.MovieVO;

import util.DBManager;

public class MovieDAO {
	private MovieDAO() {}
	
	private static MovieDAO instance = new MovieDAO();
	
	public static MovieDAO getInstance() {
		return instance;
	}
	
	public List<MovieVO> getMovieList() {
		List<MovieVO> list = new ArrayList<MovieVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			String sql = "select code, title, price, director, actor, poster, synopsis from movie order by code desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MovieVO mVo = new MovieVO();
				mVo.setCode(rs.getInt(1));
				mVo.setTitle(rs.getString(2));
				mVo.setPrice(rs.getInt(3));
				mVo.setDirector(rs.getString(4));
				mVo.setActor(rs.getString(5));
				mVo.setPoster(rs.getString(6));
				mVo.setSynopsis(rs.getString(7));
				list.add(mVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt, rs);
		}
		
		return list;
	}
}
