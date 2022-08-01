sql 설정(오라클)

create SEQUENCE seq_board;

create table tbl_board(
    bno number(10,0),
    title varchar2(200) not null,
    content varchar2(2000) not null,
    writer varchar2(50) not null,
    regdate date default sysdate,
    updatedate date default sysdate
);

alter table tbl_board add CONSTRAINT pk_board
primary key(bno);

desc tbl_board;

insert into tbl_board(bno,title,content,writer)
values(seq_board.nextval, '홍길동전', '도둑이야기', '허균');

<jdbc 연결>
.connection 연결하고 close 작업
.preparedstatement 생성 및 처리
.setXX() 처리
.select문 ResultSet 처리 동

<mybatis>
자동 연결 및 해제
Mybatis가 내부적으로 preparedstatement 처리
ResultSet 처리도 Mybatis 처리

*SQL문 처리만 신경쓴다.

*spring boot에서는 jpa를 사용



1. pom.xml 자바 버전, sts 버전 설정
2. 메이븐에서 롬복 설정 가져와서 pom.xml에 복사
3. 메이븐에서 오라클 jdb 설정 가져와서 pom.xml에 복사
4. src/test/java에 oracle.zerock.persistence 패키지 만들기
5. JDBCTests 클래스 만들기 / junit run
6. 메이븐에서 hikari 설정 가져와서 pom.xml에 복사
7. root-context에 hikari 설정

<bean id="hikariConfig" class="com.zaxxer.hikari.HikariConfig">	
	<property name="jdbcUrl" 	value="jdbc:log4jdbc:oracle:thin:@localhost:1521:xe"></property>
	<property name="username" value="book"></property>
	<property name="password" value="1234"></property>
</bean>
		
<bean id="dataSource" class="com.zaxxer.hikari.HikariDataSource" destroy-method="close">
		<constructor-arg ref="hikariConfig"></constructor-arg>
</bean>	

8. DataSourceTests 클래스 만들기(oracle.zerock.persistence)
9. pom.xml에서 junit 버전 4.12로 바꾸기 / log4j 1.2.17로 버전 바꾸기 / 코드 삭제
10. pom.xml 설정 추가
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-test</artifactId>
		<version>${org.springframework-version}</version>
	</dependency>
11. pom.xml 설정 추가(mybatis, mybatis-spring)

12. root-context.xml에 mybatis와 spring 연결 객체 설정 추가

<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource"></property>
</bean>

13. pom.xml에 설정 추가(jdbc, 트랜젝션)

<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-jdbc</artifactId>
		<version>${org.springframework-version}</version>
</dependency>
<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-tx</artifactId>
		<version>${org.springframework-version}</version>
</dependency>

14. src/main/java에 mapper 패키지 만들기
15. timeMapper 인터페이스 만들기

@Select("select sysdate from dual")
	public String getTime();
	
16. main/resources에 org/zerock/mapper 순서로 파일 만들기
17. TimeMapper.xml 만들기 (mybatis.org 페이지에서 코드 복사)

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="org.mybatis.example.BlogMapper">
  <select id="selectBlog" resultType="Blog">
    select * from Blog where id = #{id}
  </select>
</mapper>

=> 

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="org.zerock.mapper.TimeMapper">

  <select id="getTime2" resultType="string">
  	select sysdate from dual
  </select>
  
</mapper>

18. TimeMapperTests 클래스 만들기(.persistence)
19. root-context.xml namespace 설정(context, mybatis-spring 체크)
20. log4jdbc.log42.properties 파일 추가(main/test/resources)

21. root-context hikari 설정 추가

<bean id="hikariConfig" class="com.zaxxer.hikari.HikariConfig">
	<property name="driverClassName" 	value="net.sf.log4jdbc.sql.jdbcapi.DriverSpy"></property>	
	<property name="jdbcUrl" 	value="jdbc:log4jdbc:oracle:thin:@localhost:1521:xe"></property>
	<property name="username" value="book"></property>
	<property name="password" value="1234"></property>
</bean>

22. TimeMapperTests 설정

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

23. SampleController 클래스 만들기(src/main/java / controller 패키지)

@Controller
@RequestMapping("/sample/*")
@Log4j

24. tomcat path 경로 바꾸기 : /

25. 프로젝트 run(http://localhost:8181/sample/basic)

26. basic.jsp 파일 만들기(webapp/views)

27. 다시 프로젝트 run(http://localhost:8181/sample/basic)

28. org.zerock.domain 패키지 만들기(main/java)

29. SampleDTO 클래스 만들기

30. 프로젝트 run(http://localhost:8181/sample/basic?name=aaa&age=20)

31. sampleController 클래스 만들기

//	@GetMapping("/basic")
	public String basic(SampleDTO dto, Model model) {
		log.info("dto------- : " + dto);
		model.addAttribute("list", dto);
		return "basic";
	}
	
32. 프로젝트 다시 run(http://localhost:8181/sample/basic?name=aaa&age=20)





