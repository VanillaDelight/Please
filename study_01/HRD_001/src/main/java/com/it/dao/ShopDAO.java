package com.it.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.it.dto.ShopVO;

public class ShopDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	private final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	private final String USERNAME = "system";
	private final String PASSWORD = "1235";

	public ShopDAO() {
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
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getcustno() {
		int custno = 0;
		try {
			getConnection();
			String sql = "select max(custno) from member_tbl_02";
			ps = conn.prepareCall(sql);
			rs = ps.executeQuery();
			if (rs.next())
				custno = rs.getInt(1) + 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return custno;
	}

	public boolean addmember(ShopVO vo) {
		boolean isGood = false;
		try {
			getConnection();
			String sql = "insert into member_tbl_02(custno, custname, phone, address, joindate, grade, city) "
					+ "values(?, ?, ?, ?, ?, ?, ?)";
			ps = conn.prepareCall(sql);
			ps.setInt(1, vo.getCustno());
			ps.setString(2, vo.getCustname());
			ps.setString(3, vo.getPhone());
			ps.setString(4, vo.getAddress());
			ps.setString(5, vo.getJoindate());
			ps.setString(6, vo.getGrade());
			ps.setString(7, vo.getCity());
			ps.executeUpdate();
			isGood = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return isGood;
	}

	public List<ShopVO> getList() {
		List<ShopVO> list = new ArrayList<ShopVO>();
		try {
			getConnection();
			String sql = "select custno, custname, phone, address, to_char(joindate, 'YYYY-mm-dd'), grade, city "
					+ "from MEMBER_TBL_02 order by custno";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				ShopVO vo = new ShopVO();
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				switch (rs.getString(6)) {
				case "A":
					vo.setGrade("VIP");
					break;
				case "C":
					vo.setGrade("직원");
					break;
				default:
					vo.setGrade("일반");
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
	
	public List<ShopVO> getsearch(String search) {
		System.out.println(search);
		List<ShopVO> list = new ArrayList<ShopVO>();
		try {
			getConnection();
			String sql = "select custno, custname, phone, address, to_char(joindate, 'YYYY-mm-dd'), grade, city "
					+ "from MEMBER_TBL_02 "
					+ "where ADDRESS like '%?%'";
			ps = conn.prepareStatement(sql);
			ps.setString(1, search);
			rs = ps.executeQuery();
			while (rs.next()) {
				ShopVO vo = new ShopVO();
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				switch (rs.getString(6)) {
				case "A":
					vo.setGrade("VIP");
					break;
				case "C":
					vo.setGrade("직원");
					break;
				default:
					vo.setGrade("일반");
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

	public List<ShopVO> getRankingList() {
		List<ShopVO> list = new ArrayList<ShopVO>();
		try {
			getConnection();
			String sql = "select A.CUSTNO, A.CUSTNAME, A.GRADE, sum(B.PRICE) " + "from MEMBER_TBL_02 A, MONEY_TBL_02 B "
					+ "where A.CUSTNO = B.CUSTNO " + "group by A.CUSTNO, A.CUSTNAME, A.GRADE "
					+ "order by sum(B.PRICE) desc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				ShopVO vo = new ShopVO();
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				switch (rs.getString(3)) {
				case "A":
					vo.setGrade("VIP");
					break;
				case "C":
					vo.setGrade("직원");
					break;
				default:
					vo.setGrade("일반");
					break;
				}
				vo.setSum(rs.getInt(4));

				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}

		return list;
	}

	public ShopVO getDetail(int custno) {
		ShopVO vo = new ShopVO();

		try {
			getConnection();
			String sql = "select custno, custname, phone, address, to_char(joindate, 'YYYY-mm-dd'), grade, city "
					+ "from MEMBER_TBL_02 where custno = ?";
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

	public boolean memberUpdate(ShopVO vo) {
		boolean isGood = false;
		try {
			getConnection();
			String sql = "update MEMBER_TBL_02 set custname=?, phone=?, address=?, joindate=?, grade=?, city=? "
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
			isGood = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return isGood;
	}

}
