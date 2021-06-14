-- 2021.06.14
-- 부속질의 문제풀이

-- 43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.

select e2.ename, e2.job
from (select * from emp where empno = 7788) e, emp e2
where e.job = e2.job
;

-- 44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 감당 업무
select e2.ename, e2.job
from (select * from emp where empno = 7499) e, emp e2
where e.sal < e2.sal
;


-- 45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
select ename, job, sal
from emp
where sal = (select min(sal) from emp)
;

-- 46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
select job, min(sal)
from emp e
where sal = (select avg(sal) from emp e2 group by job)
group by job
;


select job, e2.min(sal)
from emp e
where sal = (select avg(sal) from emp e2 group by job)
group by job
;


