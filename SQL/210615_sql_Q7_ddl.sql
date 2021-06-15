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


create table phoneInfo_univ (
    idx number(6) 
        constraint phoneInfo_univ_idx_pk primary key,
    fr_u_major varchar2(20) 
        default 'N',
    fr_u_year number(1) default 1, 
        constraint phoneInfo_univ_ch check ( 0 < fr_u_year and fr_u_year < 5),
    fr_ref number(7) 
        constraint phoneInfo_univ_fr_ref_fk references phoneInfo_basic(idx)
);


create table phoneInfo_com (
    idx number(6) 
        constraint phoneInfo_com_idx_pk primary key,
    fr_c_company varchar2(20) 
        default 'N',
    fr_ref number(6) 
        constraint phoneInfo_com_fr_ref_fk references phoneInfo_basic(idx)
);
