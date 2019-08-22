CREATE TABLESPACE testtbs01 DATAFILE 'test_data.dbf' SIZE 20M;
create sequence hibernate_sequence increment by 1 start with 1 maxvalue 999999999;
CREATE TABLE person (
                      id  NUMBER(5) PRIMARY KEY,
                      name  VARCHAR2(15) NOT NULL,
                      age NUMBER(5),
                      address VARCHAR2(15)) TABLESPACE testtbs01;
