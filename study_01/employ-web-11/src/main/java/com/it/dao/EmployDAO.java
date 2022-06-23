package com.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.it.dto.EmployVO;

import util.DBManager;

public class EmployDAO {
	private EmployDAO() {
	}

	private static EmployDAO instance = new EmployDAO();

	public static EmployDAO getInstance() {
		return instance;
	}

	public List<EmployVO> getAllList() {
		List<EmployVO> list = new ArrayList<EmployVO>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			String sql = "select id, pass, name, lev, enter, gender, phone " + "from employ order by enter desc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				EmployVO vo = new EmployVO();
				vo.setId(rs.getString(1));
				vo.setPass(rs.getString(2));
				vo.setName(rs.getString(3));
				switch (rs.getString(4)) {
				case "A":
					vo.setLev("운영자");
					break;
				case "B":
					vo.setLev("일반회원");
					break;
				}
				vo.setEnter(rs.getTimestamp(5));
				switch (rs.getString(6)) {
				case "1":
					vo.setGender("남자");
					break;
				case "2":
					vo.setGender("여자");
					break;
				}
				vo.setPhone(rs.getString(7));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, ps, rs);
		}

		return list;
	}

	public int insertEmploy(EmployVO vo) {
		int result = -1;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBManager.getConnection();
			String sql = "insert into employ (id, pass, name, lev, gender, phone) "
					+ "values(?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPass());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getLev());
			ps.setString(5, vo.getGender());
			ps.setString(6, vo.getPhone());

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, ps);
		}
		return result;
	}

	public EmployVO getDetail(String id) {
		EmployVO vo = new EmployVO();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			String sql = "select id, pass, name, lev, enter, gender, phone from employ "
					+ "where id=?";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				vo.setId(rs.getString(1));
				vo.setPass(rs.getString(2));
				vo.setName(rs.getString(3));
				switch (rs.getString(4)) {
				case "A":
					vo.setLev("운영자");
					break;
				case "B":
					vo.setLev("일반회원");
					break;
				}
				vo.setEnter(rs.getTimestamp(5));
				switch (rs.getString(6)) {
				case "1":
					vo.setGender("남자");
					break;
				case "2":
					vo.setGender("여자");
					break;
				}
				vo.setPhone(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, ps, rs);
		}
		return vo;
	}

}
