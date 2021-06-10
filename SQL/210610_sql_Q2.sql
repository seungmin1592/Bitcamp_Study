-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.

--(1) 도서번호가1인도서의이름
select bookname
from book
where bookid = 1
;

-- (2) 가격이20,000원이상인도서의이름
select bookname
from book 
where price >= 20000
;

-- (3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
select sum(saleprice) as "박지성의 전체 구매액"
from orders
where custid = 1
;

-- (4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
select count(orderid) as "구매한 도서의 수"
from orders
where custid = 1
;

--------------------------------------------------------------
-- 2 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 문을 작성하시오.

-- (1) 마당서점도서의총개수
select count(bookid) as "서점 도서의 총 개수"
from book
;

-- (2) 마당서점에 도서를 출고하는 출판사의 총 개수
select count(distinct publisher) as "출판사 개수"
from book
;


-- (3) 모든고객의이름, 주소
select name, address
from customer
;

-- (4) 2014년7월4일~7월7일사이에 주문받은 도서의 주문번호
select orderid
from orders
where orderdate between '14/07/04' and '14/07/07'
;


-- (5) 2014년7월4일~7월7일사이에 주문받은 도서를 제외한 도서의 주문번호
select orderid
from orders
where orderdate not between '14/07/04' and '14/07/07'
;

-- (6) 성이‘김’씨인 고객의 이름과 주소
select name, address
from customer
where name like '김%'
;

-- (7) 성이‘김’씨이고 이름이‘아’로 끝나는 고객의 이름과 주소
select name, address
from customer
where name like '김%아' 
;