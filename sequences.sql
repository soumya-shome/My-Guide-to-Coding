-- CREATE SEQUENCE IF NOT EXIST name
-- CREATE SEQUENCE name

CREATE SEQUENCE IF NOT EXIST test_seq

--SELECT nextval(name)
SELECT nextval('text_seq');

--SELECT currval(name)
SELECT currval('test_seq')

--SELECT setval(name, value)
SELECT setval('test_seq',100) --101,102,103....

--SELECT setval(name,value,false)
SELECT setval('test_seq',200,false) --200,201,202,203,.....

--CREATE SEQUENCE IF NOT EXISTS name START WITH value
--CREATE SEQUENCE name START WITH value

CREATE SEQUENCE IF NOT EXISTS test_seq2 START WITH 100


--ALTER SEQUENCE name RESTART WITH value
--ALTER SEQUENCE name RENAME TO new_name
ALTER SEQUENCE text_seq RESTART WITH 100

ALTER SEQUENCE test_seq RENAME TO test_seq_2


--MAXVALUE value
--START WITH
--INCREMENT 
--MINVALUE

