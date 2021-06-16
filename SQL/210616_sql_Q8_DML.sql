-- 2021.06.16
-- DDL 문제풀이


-- 앞에서 생성한 전화번호부 테이블을 기준으로 DML 을 작성해봅시다.

-- 1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
desc phoneInfo_basic;

-- phoneInfo_basic select
select *
from phoneInfo_basic
;

-- phoneInfo_basic insert
insert into phoneInfo_basic values(1, '홍길동', '010-0000-0000', null, '서울시', sysdate);
insert into phoneInfo_basic values(2, '김승민', '010-0000-0000', 'qwe@qwe.com', '안산시', sysdate);

-- phoneInfo_basic update
update phoneInfo_basic
set fr_address = '안산'
;

-- phoneInfo_basic delete
delete from phoneInfo_basic
where fr_name = '홍길동';


-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
-- phoneInfo_univ select
select *
from phoneInfo_univ
;

-- phoneInfo_univ insert
insert into phoneInfo_univ (idx, fr_u_major, fr_ref) values (1, '미술', (select idx from phoneInfo_basic where fr_name = '홍길동'));

-- phoneInfo_univ update
update phoneInfo_univ
set fr_u_major = '체육'
where idx = 1
;

-- phoneInfo_univ delete
delete from phoneInfo_univ;

select *
from phoneInfo_basic pb, phoneinfo_univ pu
where pb.idx = pu.fr_ref
;


-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL

-- phoneInfo_com select
select *
from phoneInfo_com
;

-- phoneInfo_com insert
insert into phoneInfo_com (idx, fr_ref) values (1, (select idx from phoneInfo_basic where idx = 2));

-- phoneInfo_com update
update phoneInfo_com
set fr_c_company = '네이버'
where fr_ref = 2
;

-- phoneInfo_com delete
delete from phoneInfo_com;

select *
from phoneinfo_basic pb, phoneinfo_univ pu, phoneinfo_com pc
where pb.idx = pu.fr_ref and pb.idx = pc.fr_ref
;