-- 2021.06.15

-- DDL 생성하기

create table phoneInfo_basic (
    idx number(6) 
        constraint phoneInfo_basic_idx_pk primary key,
    fr_name varchar2(20) 
        not null,
    fr_phonenumber varchar2(20) 
        not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date 
        default sysdate
);


create table phoneinfo_univ (
    idx number(6),
    fr_u_major VARCHAR2(20) default 'N' not null,
    fr_u_year number(1) default 1  not null, --check (fr_u_year between 1 and 4),
    fr_ref number(6) not null,
    constraint pi_univ_idx_PK primary key (idx),
    constraint chk check (fr_u_year between 1 and 4), -- 테이블 레벨에서 check  제약 설정 
    constraint pi_univ_ref_FK FOREIGN KEY (fr_ref) REFERENCES phoneInfo_basic (idx)
);


create table phoneInfo_com (
    idx number(6) 
        constraint phoneInfo_com_idx_pk primary key,
    fr_c_company varchar2(20) 
        default 'N' not null,
    fr_ref number(6) 
        not null, constraint phoneInfo_com_fr_ref_fk references phoneInfo_basic(idx)
);



-- sequence : 번호 재생기
create sequence pi_idx_pk;
create sequence pi_u_idx_pk start with 5 increment by 1;
create sequence pi_c_idx_pk start with 5 increment by 1;