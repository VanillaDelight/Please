package com.ezen.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisMain {

	public static void main(String args[]) {
		String resource = "com/ezen/mybatis/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session = sqlSessionFactory.openSession();
			BoardMethod mapper = session.getMapper(BoardMethod.class);
			System.out.println("-----------------------------------");

			BoardVO vo = mapper.selectOne(1);
			System.out.println(vo.toString());
			
			System.out.println("-----------------------------------");
			
			List<BoardVO> list1 = mapper.selectAllMember();
			for (BoardVO vo1 : list1) {
				System.out.println(vo1.toString());
			}
			
			System.out.println("5번 삭제");
			
			mapper.deleteBoard(5);
			session.commit();
			
			System.out.println("삭제후------------------");
			
			List<BoardVO> list2 = mapper.selectAllMember();
			for (BoardVO vo2 : list2) {
				System.out.println(vo2);
			}
			
			BoardVO vo9 = new BoardVO();
			vo9.setId(6);
			vo9.setName("손흥민");
			vo9.setPhone("010-2222-6666");
			vo9.setAddress("영국");
			
			mapper.insertBoard(vo9);
			session.commit();
			
			System.out.println("6번 추가 후------------------------");

			List<BoardVO> list3 = mapper.selectAllMember();
			for (BoardVO vo3 : list3) {
				System.out.println(vo3);
			}
			session.commit();
			
			BoardVO vo5 = new BoardVO();
			vo5.setId(1);
			vo5.setName("손흥민");
			vo5.setPhone("010-2222-6666");
			vo5.setAddress("영국");
			
			System.out.println("update");
			mapper.updateBoard(vo5);
			session.commit();
			List<BoardVO> list4 = mapper.selectAllMember();
			for (BoardVO vo4 : list4) {
				System.out.println(vo4);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
