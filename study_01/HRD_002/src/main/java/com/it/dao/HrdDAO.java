package com.it.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.it.dto.HrdVO;

public class HrdDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	private final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	private final String USERNAME = "system";
	private final String PASSWORD = "1235";
	
	public HrdDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disConnection() {
		try {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getCustno() {
		int custno = 0;
		try {
			getConnection();
			String sql = "select LAST_NUMBER "
					+ "from USER_SEQUENCES "
					+ "where SEQUENCE_NAME = 'AUTONUM'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				custno = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return custno;
	}
	
	public boolean joinmember(HrdVO vo) {
		boolean chk = false;
		try {
			getConnection();
			String sql = "insert into hrd_001(custno, custname, phone, address, joindate, grade, city) "
					+ "values(autonum.nextval, ?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getCustname());
			ps.setString(2, vo.getPhone());
			ps.setString(3, vo.getAddress());
			ps.setString(4, vo.getJoindate());
			ps.setString(5, vo.getGrade());
			ps.setString(6, vo.getCity());
			ps.executeUpdate();
			chk = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return chk;
	}
	
	public List<HrdVO> getList() {
		List<HrdVO> list = new ArrayList<HrdVO>();
		try {
			getConnection();
			String sql = "select custno, custname, phone, address, to_char(joindate, 'YYYY-mm-dd'), grade, city "
					+ "from hrd_001 order by custno";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				HrdVO vo = new HrdVO();
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				switch (rs.getString(6)) {
				case "A":
					vo.setGrade("VIP");
					break;
				case "B":
					vo.setGrade("일반");
					break;
				case "C":
					vo.setGrade("직원");
					break;
				}
				vo.setCity(rs.getString(7));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	}
	
	public List<HrdVO> getRanking() {
		List<HrdVO> list = new ArrayList<HrdVO>();
		try {
			getConnection();
			String sql = "select h.CUSTNO, h.CUSTNAME, h.GRADE, sum(m.PRICE) as total "
					+ "from HRD_001 h, MON_001 m "
					+ "where h.CUSTNO = m.CUSTNO "
					+ "group by h.CUSTNO, h.CUSTNAME, h.GRADE "
					+ "order by total desc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				HrdVO vo = new HrdVO();
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				switch (rs.getString(3)) {
				case "A":
					vo.setGrade("VIP");
					break;
				case "B":
					vo.setGrade("일반");
					break;
				case "C":
					vo.setGrade("직원");
					break;
				}
				vo.setHowmuch(rs.getInt(4));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	}
	
	public HrdVO getDetail(int custno) {
		HrdVO vo = new HrdVO();
		try {
			getConnection();
			String sql = "select custno, custname, phone, address, to_char(joindate, 'YYYY-mm-dd'), grade, city "
					+ "from hrd_001 where custno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, custno);
			rs = ps.executeQuery();
			if (rs.next()) {
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				vo.setGrade(rs.getString(6));
				vo.setCity(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return vo;
	}
	
	public boolean updatemember(HrdVO vo) {
		boolean chk = false;
		try {
			getConnection();
			String sql = "update hrd_001 set custname=?, phone=?, address=?, joindate=?, grade=?, city=? "
					+ "where custno = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getCustname());
			ps.setString(2, vo.getPhone());
			ps.setString(3, vo.getAddress());
			ps.setString(4, vo.getJoindate());
			ps.setString(5, vo.getGrade());
			ps.setString(6, vo.getCity());
			ps.setInt(7, vo.getCustno());
			ps.executeUpdate();
			chk = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return chk;
	}
	
	
	
	
	
	
	
	
}