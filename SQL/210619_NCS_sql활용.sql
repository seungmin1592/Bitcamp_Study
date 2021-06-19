-- 2021.06.09

-- NCS
-- SQL활용


-- 1. 아래 조건에 맞는 DDL을 작성하시오.
create table Contact (
    pIdx number(6) constraint Contact_pIdx_pk primary key,
    pName varchar2(20) constraint Contact_pName_nn not null,
    pPhoneN varchar2(20) constraint Contact_pPhoneN_nn not null,
    pAddress varchar2(30) default '서울시' constraint Contact_pAddress_nn not null ,
    pEmail varchar2(30) default '미입력' constraint Contact_pEmail_nn not null,
    pType varchar2(4) constraint Contact_pType_ck check(pType in ('univ', 'com', 'cafe')) not null,
    
    pMajor varchar2(20),
    pGrade number(2),
    pCompanyN varchar2(20),
    pDname varchar2(20),
    pMgr varchar2(20),
    pMeetN varchar2(20),
    pNickname varchar2(20)
);


-- 2. DEPT 테이블에 데이터를 삽입하는 SQL을 작성하시오. 입력 데이터는 임의로 작성하시오.
insert into dept values (50, 'DEV', 'SEOUL');

-- 3. DEPT 테이블에 위에서 삽입한 데이터의 dname, loc 데이터를 변경하는 SQL을 작성하시오.
--    입력 데이터는 임의로 작성하시오.
update dept
set dname = 'DESIGN', loc = 'ANSAN'
where deptno = 50
;

-- 4. DEPT 테이블에 위에서 삽입한 데이터를 deptno 컬럼의 값을 기반으로 삭제하는 SQL을 작성하시오.
delete from dept
where deptno = 50
;

-- 5. 사용자가 보유한 테이블 목록을 확인하는 SQL문을 작성하시오.
select *
from tab
;

-- 6. EMP 테이블의 구조를 확인하는 SQL을 작성하시오.
desc emp;


-- 7. 사용자가 정의한 제약조건들을 확인하는 SQL문을 작성하시오.
SELECT * 
FROM ALL_CONSTRAINTS
WHERE TABLE_NAME = 'contact';


-- #2 아래 요구사항에 맞도록 고급 SQL 문을 작성하시오.
-- 1. EMP 테이블의 ename 컬럼에 인덱스를 생성하는 SQL을 작성하시오. 인덱스의 이름은 emp_index
