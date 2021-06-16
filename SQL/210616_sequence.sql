-- 2021.06.16

-- sequence : 번호 재생기
create sequence pi_idx_pk;

select pi_idx_pk.nextval
from dual;

select pi_idx_pk.currval
from dual;