package com.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.it.dto.EmployeesVO;

import util.DBManager;

public class EmployeesDAO {
	private EmployeesDAO() {
	}

	private static EmployeesDAO instance = new EmployeesDAO();

	public static EmployeesDAO getInstance() {
		return instance;
	}

	public List<EmployeesVO> getAllList() {
		List<EmployeesVO> list = new ArrayList<EmployeesVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			String sql = "select id, pass, name, lev, enter, gender, phone " + "from employees order by enter desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeesVO vo = new EmployeesVO();
				vo.setId(rs.getString(1));
				vo.setPass(rs.getString(2));
				vo.setName(rs.getString(3));
				switch (rs.getString(4)) {
				case "A":
					vo.setLev("운영자");
					break;
				default:
					vo.setLev("일반회원");
					break;
				}
				vo.setEnter(rs.getTimestamp(5));
				switch (rs.getString(6)) {
				case "1":
					vo.setGender("남자");
					break;
				default:
					vo.setGender("여자");
					break;
				}
				vo.setPhone(rs.getString(7));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt, rs);
		}

		return list;
	}

	public void insertEmployees(EmployeesVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			String sql = "insert into employees (id, pass, name, lev, gender, phone) "
					+ "values (?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getLev());
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getPhone());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt);
		}
	}

	public EmployeesVO getDetailById(String id) {
		EmployeesVO vo = new EmployeesVO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			String sql = "select id, pass, name, lev, enter, gender, phone "
					+ "from employees where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				vo.setId(rs.getString(1));
				vo.setPass(rs.getString(2));
				vo.setName(rs.getString(3));
				switch (rs.getString(4)) {
				case "A":
					vo.setLev("운영자");
					break;
				default:
					vo.setLev("일반회원");
					break;
				}
				vo.setEnter(rs.getTimestamp(5));
				switch (rs.getString(6)) {
				case "1":
					vo.setGender("남자");
					break;
				default:
					vo.setGender("여자");
					break;
				}
				vo.setPhone(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt, rs);
		}
		
		return vo;
	}

	public void updateEmployees(EmployeesVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			String sql = "update employees set id=?, pass=?, name=?, lev=?, gender=?, phone=? "
					+ "where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getLev());
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getPhone());
			if (vo.getPre_id().equals(vo.getId())) {
				pstmt.setString(7, vo.getId());
			} else {
				pstmt.setString(7, vo.getPre_id());
			}
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt);
		}	
	}

	public void deleteEmployeesById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			String sql = "delete from employees where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.disConnection(conn, pstmt);
		}
	}
}
