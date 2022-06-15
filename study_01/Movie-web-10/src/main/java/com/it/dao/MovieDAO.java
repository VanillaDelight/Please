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
	
	public int insertMovie(MovieVO mVo) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			String sql = "insert into movie(code, title, price, director, actor, poster, synopsis) "
					+ "values(movie_seq.nextval, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getTitle());
			pstmt.setInt(2, mVo.getPrice());
			pstmt.setString(3, mVo.getDirector());
			pstmt.setString(4, mVo.getActor());
			pstmt.setString(5, mVo.getPoster());
			pstmt.setString(6, mVo.getSynopsis());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt);
		}
		
		return result;
	}
	
	public MovieVO getMovieDetail(int code) {
		MovieVO mVo = new MovieVO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			String sql = "select code, title, price, director, actor, poster, synopsis "
					+ "from movie where code=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, code);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				mVo.setCode(rs.getInt(1));
				mVo.setTitle(rs.getString(2));
				mVo.setPrice(rs.getInt(3));
				mVo.setDirector(rs.getString(4));
				mVo.setActor(rs.getString(5));
				mVo.setPoster(rs.getString(6));
				mVo.setSynopsis(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt, rs);
		}
		
		return mVo;
	}
	
	public int updateMovie(MovieVO mVo) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			String sql = "update movie set title=?, price=?, director=?, actor=?, poster=?, synopsis=? "
					+ "where code=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getTitle());
			pstmt.setInt(2, mVo.getPrice());
			pstmt.setString(3, mVo.getDirector());
			pstmt.setString(4, mVo.getActor());
			pstmt.setString(5, mVo.getPoster());
			pstmt.setString(6, mVo.getSynopsis());
			pstmt.setInt(7, mVo.getCode());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt);
		}
		
		return result;
	}
	
	public int deleteMovie(int code) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			String sql = "delete from movie where code=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, code);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt);
		}
		
		return result;
	}
}
