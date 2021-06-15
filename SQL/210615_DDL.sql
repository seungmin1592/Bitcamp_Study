-- 2021.06.15

-- DDL : 데이터정의어

-- 테이블 생성 : create table 
-- 테이블 수정 : alter table
-- 테이블 삭제 : drop table

-- create table (
--      컬럼이름 타입(사이즈) 제약조건 정의,
--      ...
-- )

-- create table (
--      컬럼이름 타입(사이즈) ,
--      ...
--      제약조건 정의,
--      ...
-- )


-- 사원 테이블과 유사한 구조의 
-- 사원번호, 사원이름, 급여 3개의 칼럼으로 수성된
-- EMP01 테이블을 생성해 봅시다.

create table emp01(
    empno number(4), -- 사원번호
    ename varchar2(20), -- 사원 이름
    sal number(6,2) -- 사원 급여
);

-- 서브 쿼리를 이용해서 기존 테이블의 구조를 복사하고 해당 튜플도 복사
create table emp02
as
select * from emp
;

select * from emp02;


create table emp03
as
select empno, ename, sal from emp
;

select *
from emp03
;


create table emp04
as
select * from emp where deptno = 30
;

select * from emp04;

create table emp05 
as 
select * from emp 
where 1 = 2
;

select * from emp05;


-- 테이블의 변경 : alter table
-- alter table {테이블 이름} add
-- alter table {테이블 이름} modify
-- alter table {테이블 이름} drop 

-- emp01 테이블에 job 컬럼을 추가해보자
alter table emp01 
add(job varchar2(9))
;
desc emp01;

-- emp01 테이블에 job 컬럼을 수정해보자
-- 9 -> 30
alter table emp01
modify (job varchar2(130) not null)
;


-- emp01 테이블의 job 컬럼을 삭제
alter table emp01
drop column job
;


-- 테이블 삭제
drop table emp06;
drop table emp02;


create table emp02
as
select * from emp
;

select * from emp02;

-- 모든 행을 삭제 truncate : 롤백이 안된다
truncate table emp02;


-- 테이블의 이름 변경 -> rename 현재 이름 to 새로운 이름
rename emp01 to test;
desc emp01;
desc test;


drop table emp02;

create table emp02 
as
select empno, ename, sal, job from emp where 1 = 0;


-- 컬럼 레벨에서 제약 사항 정의
create table emp02(
    empno number(4)constraint emp02_empno_pk primary key,   --not null unique,
    ename varchar2(20) constraint emp02_ename_nn not null,
    sal number(6,2) constraint emp02_sal_ck check (sal > 500 and sal < 5000),
    job varchar(20) default '미지정',
    deptno number constraint emp02_deptno_fk references dept(deptno)
);


desc dept;

insert into emp02 (empno, ename, sal, job, deptno) values (1000, 'SON', 7000, 'MANAGER', 40);

select * from emp02;

-- 테이블 레벨에서 제약 사항 정의
create table emp03(
    empno number(4),  -- constraint emp02_empno_pk primary key,   --not null unique,
    ename varchar2(20) constraint emp03_ename_nn not null,
    sal number(6,2) constraint emp03_sal_ck check (sal > 500 and sal < 5000),
    job varchar(20), -- default '미지정',
    deptno number -- constraint emp02_deptno_fk references dept(deptno),
    ----------------------------------------------------------------
    -- 제약 정의
    constraint emp03_empno_pk primary key (empno), -- pk 제약
    constraint emp03_deptno foreign key (deptno) reference dept(deptno)
);