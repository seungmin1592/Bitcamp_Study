-- 2021.06.10
-- function : 단일행 함수, 집합(다중행)함수
-- 단일행 함수 : 하나의 행이 포함하는 특정 컬럼의 값 하나를 처리하고 반환
-- 다중행(집합) 함수 : 여러행의 특정 컬럼 값들을 대상으로 연산하고 반환한다


-- 숫자 함수 
select abs(10), abs(-10)
from dual
;

select floor(15.7)
from dual
;

select ROUND(15.193,1), ROUND(15.193,-1)
from dual
;

select TRUNC(15.79,1), TRUNC(15.79)
from dual
;


select MOD(11,4)
from dual;


-- 사원들의 급여를 20% 금액을 표현
select sal, mod(sal,4)
from emp;

-- 사원들의 급여
select empno, ename
from emp
where mod(sal,2) = 1
;


-- 문자함수
-- concat (문자, 문자) -> '' || ''
select concat('abc','efg'),'abc' || 'efg'
from dual;

-- substr : 문자열 추출
-- substr(문자열,지가 위치, 길이) 

select substr('apple',1,3)
from dual;

select substr('apple', -3)
from dual;


-- replace : 특정 문자열(패턴) 다른 문자열(패턴)으로 변경
select REPLACE('JACK and JUE', 'J','**')
from dual;

-- sysdate : 오늘 날짜 출력
select sysdate
from dual;


-- to_char (날짜 데이터, '패턴'), to_char (숫자, '패턴')
select sysdate, to_char(sysdate, 'YYYY.MM.DD. HH24:MT:SS')
from dual;


select ename, hiredate,to_char (hiredate, 'YYYY.MM.DD.')
from emp;

select *
from orders;

select orderid, orderdate, to_char(orderdate, 'YYYY.MM.DD')
from orders;

-- 숫자 -> 문자
select to_char(123456,'0,000,000,000'), to_char(123456, 'L9,999,999,999')
from dual;

select ename, to_char(sal*1100, 'L999,999,999')
from emp;


-- 문자 -> 숫자
-- to_number(문자열, 패턴)
select to_number('1,000,000', '9,999,999') , to_number('1,000,000', '9,999,999') + 100000
from dual;

-- 문자 --> 날짜
-- to_date(문자열, 패턴)
select to_date('2012.05.17', 'YYYY.MM.DD'),
       trunc((sysdate-to_date('2012.05.17', 'YYYY.MM.DD')) / 365)
from dual;


-- decode 함수 : 분기를 위해 사용 switch-case 유사
-- decode(컬럼, = 조건1값, 조건1의 참 일 때 사용할 값,
--           , 조건2 값, 조건2의 참 일 때 사용할 값
--           , ....
-- )

-- emp 테이블에서 부서번호의 맞는 부서 이름을 출력
select * 
from dept;

-- 10 ACCOUNTING
-- 20 RESEARCH
-- 30 SALES
-- 40 OPERATIONS

select ename, deptno,
       decode( deptno, 10, 'ACCOUNTING',
                       20, 'RESEARCH',
                       30, 'SALES',
                       40, 'OPERATIONS'
       ) AS DENAME
from emp
order by dename
;


-- 8. 직급에 따라 급여를 인상하도록 하자. 
--    직급이 'ANAlYST'인 사원은 5%, 
--    'SALESMAN'인 사원은 10%,
--    'MANAGER'인 사원은 15%, 
--    'CLERK'인 사원은 20%인 인상한다.

select ename, sal,
       decode ( job,'ANAlYST', sal*1.05, -- 5% 인상
                  'SALESMAN', sal*1.01, -- 10% 인상
                  'MANAGER', sal*1.15, -- 15% 인상
                  'CLERK', sal*1.2 -- 20% 인상
        ) as upsal
from emp
;

-- case 함수도 분기할 때 사용
-- case when 조건식 then 참일 때 값
select ename, deptno,
        case when deptno = 10 then 'ACCOUNTING'
             when deptno = 20 then 'RESEARCH'
             when deptno = 30 then 'MANAGER'
             when deptno = 40 then 'CLERK'
        END as deptname
from emp
;