-- 2021.06.16

-- view

-- 자주 사용되는
-- 30번 부서에 소속된 사원들의 사번과 이름과 부서번호를 출력하기 위한
-- select 문을 하나의 뷰로 정의해 봅시다.

create or replace view emp_view30
as 
select empno, ename, deptno
from emp
where deptno = 30
;

select *
from emp_view30
where ename = 'JAMES'
;

-- view 삭제
drop view emp_view30;

-- 인라인 뷰를 이용한 TOP3 구하기
select rownum, ename
from emp
order by hiredate
;

select rownum, ename, hiredate
from (select * from emp order by hiredate)
where rownum < 6
;


create or replace view view_HIR
as
select * from emp order by hiredate;

select rownum, ename, hiredate from view_hir;

select rownum, ename, hiredate 
from view_hir
where rownum < 6
;


-- sequence : 번호 재생기
create sequence pi_idx_pk;

select pi_idx_pk.nextval
from dual;

select pi_idx_pk.currval
from dual;