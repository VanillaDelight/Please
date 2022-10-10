**************환경
1. windows10
2. sts (Version:5.2.7.RELEASE)
3. tomcat 9.0
4. oracle 1.8
5. lombok (1.18.24)
6. mybatis (3.5.10)
7. mybatis-spring (2.0.7)
8. HikariCP (5.0.1)
9. ojdbc8.jar (21.6.0.0.1)


-- 오라클 사용자 생성, 권한부여
create user First_Project identified by 1234;
grant connect, dba, resource to First_Project;

-- user 생성
create user First_Project identified by 1234;
grant connect, dba, resource to First_Project;

-- table 생성
create table member (
    id varchar2(50) not null, --아이디
    pwd varchar2(50) not null, --비밀번호
    name varchar2(50) not null, --이름
    email varchar2(50) not null, --이메일
    phone VARCHAR2(15) not null, --전화번호
    join_date date default sysdate, --가입날짜
    CONSTRAINT TEST_PK PRIMARY KEY(id, email)
);

insert into member (id, pwd, name, email, phone)
values ('test', '1234', '최종우', '2m5@naver.com', '01037630925');

select * from member;
commit;