package com.it.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.it.dto.EzenVO;

public class EzenDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;

	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String USERNAME = "root";
	private final String PASSWORD = "1235";

	public EzenDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<EzenVO> ezenListData(int page) {
		List<EzenVO> list = new ArrayList<EzenVO>();

		try {
			String sql = "select no, name, subject, content, DATE_FORMAT(regdate, '%Y년%m월%d일 %H시%i분%S초'), hit "
					+ "from ezenboard order by no desc limit ?, ?";

			int rowSize = 10;
			int start = (rowSize * page) - rowSize;

			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, rowSize);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				EzenVO vo = new EzenVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setDbday(rs.getString(5));
				vo.setHit(rs.getInt(6));
				list.add(vo);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}

		return list;
	}

	public int ezenTotalPage() {
		int total = 0;

		try {

			getConnection();
			String sql = "select ceil(count(*)/10.0) from ezenBoard";

			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

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
	
	public EzenVO getDetail(int no) {
		EzenVO vo = new EzenVO();
		
		try {
			getConnection();
			String sql = "update ezenBoard set hit = hit + 1 "
					+ "where no = ? ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ps.executeUpdate();
			
			sql = "select no, name, subject, content, DATE_FORMAT(regdate, '%Y년%m월%d일 %H시%i분%S초'), hit, DATE_FORMAT(moddate, '%Y년%m월%d일 %H시%i분%S초') "
					+ "from ezenBoard where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setDbday(rs.getString(5));
				vo.setHit(rs.getInt(6));
				if (rs.getString(7) == null)
					vo.setModday("*");
				else
					vo.setModday(rs.getString(7));
				
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		
		return vo;
	}
	
	public void addBoardEzen(EzenVO vo) {
		try {
			getConnection();
			String sql = "insert into ezenboard(name, subject, content, pwd, regdate) "
					+ "values(?, ?, ?, ?, now())";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getPwd());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		
		
	}
	
	public boolean ezenBoardUpdate(EzenVO vo) {
		boolean chk = false;
		try {
			getConnection();
			String sql = "select pwd from ezenBoard where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ResultSet rs = ps.executeQuery();
			String pwd_chk = "";
			if (rs.next()) {
				pwd_chk = rs.getString(1);
			}
			rs.close();
			
			if (pwd_chk.equals(vo.getPwd())) {
				chk = true;
				sql = "update ezenBoard set name=?, subject=?, content=?, moddate=now() "
						+ "where no=?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, vo.getName());
				ps.setString(2, vo.getSubject());
				ps.setString(3, vo.getContent());
				ps.setInt(4, vo.getNo());
				ps.executeUpdate();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		
		
		return chk;
	}
	
	public boolean deleteEzen(int no, String pwd) {
		boolean chk = false;
		try {
			getConnection();
			String sql = "select pwd from ezenBoard where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			String pwd_chk = "";
			if (rs.next())
				pwd_chk = rs.getString(1);
			rs.close();
			if (pwd_chk.equals(pwd)) {
				chk = true;
				sql = "delete from ezenBoard where no = ?";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, no);
				ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		
		
		return chk;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}