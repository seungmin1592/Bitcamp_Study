-- 2021.06.21

-- SQL 활용
-- 데이터베이스 구현

CREATE TABLE MEMBER (
    IDX NUMBER(4) CONSTRAINT MEMBER_IDX_PK PRIMARY KEY,
    MID VARCHAR2(10) NOT NULL, CONSTRAINT MEMBER_MID_UK UNIQUE,
    MNAME VARCHAR2(10) NOT NULL,
    MPW VARCHAR2(20) NOT NULL,
    PHOTONAME VARCHAR2(20),
    MDATE DATE DEFAULT(SYSDATE)
);



CREATE INDEX MEMBER_INDEX ON MEMBER(MNAME);


CREATE VIEW MEMBER_VIEW AS SELECT MID, MNAME, IMAGENAME FROM MEMBER;
