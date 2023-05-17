--######## UNIQUE KEY ########
--Lets create a sample table

CREATE TABLE table_emails
(
  id serial primary key,
  emails text UNIQUE
);

tablename_columnname_key

--lets view the data
SELECT * from table_emails
--lets view in pgAdmin

--lets insert some unique data records

INSERT INTO table_emails (emails) VALUES ('A@B.COM')

--view the data

--now lets try to insert the duplicate record

--Create UNIQUE key on multiple column
CREATE TABLE table_products (
  id SERIAL PRIMARY KEY,
  product_code varchar(10),
  product_name text
)
--Now create UNIQUE constraints

ALTER TABLE tablename
ADD CONSTRAINT yourname UNIQUE (col1,col2,.....)

ALTER TABLE table_products
ADD CONSTRAINT unique_product_code UNIQUE (product_code, product_name);

--Lets insert some data
INSERT INTO table_products (product_code, product_name) VALUES
('A','apple');



--######## DEFAULT KEY ########
CREATE TABLE employees (
  employee_id SERIAL PRIMARY KEY,
  first_name VARCHAR (50),
  last_name VARCHAR(50),
  is_enable VARCHAR(2) DEFAULT 'Y'
);

SELECT * FROM employees;

INSERT INTO employees (first_name, last_name) VALUES('JOHN','ADAM');

-----
ALTER TABLE employees
ALTER COLUMN is_enable SET DEFAULT 'N'
-----
ALTER TABLE employees
ALTER COLUMN is_enable DROP DEFAULT



--######## PRIMARY KEY ########
CREATE TABLE table_items (
  item_id INTEGER PRIMARY KEY,
  item_name VARCHAR(100) NOT NULL
);

SELECT * FROM table_items;

INSERT INTO table_items (item_id, item_name) VALUES
(1,'PEN');


--ALTER TABLE table_items DROP CONSTRAINT cname;
ALTER TABLE table_items
DROP CONSTRAINT table_items_pkey;


ALTER TABLE table_items
ADD PRIMARY KEY (item_id);


--######## FOREIGN KEY ########
CREATE TABLE t_products (
  product_id INTEGER PRIMARY KEY,
  product_name VARCHAR(100) NOT NULL,
  supplier_id INT NOT NULL
);

CREATE TABLE t_suppliers (
  supplier_id INTEGER PRIMARY KEY,
  supplier_name VARCHAR(100) NOT NULL
);

INSERT INTO t_suppliers (supplier_id, supplier_name) VALUES
(1,'SUPPLIER1'),
(2,'SUPPLIER2');

INSERT INTO t_products (product_id, product_name, supplier_id) VALUES
(1,'PEN',1),
(2,'PAPER',2),
(3,'COMPUTER',10); -- wont validate 

--Foreign key constraints ## this is how it should bt used
CREATE TABLE t_products (
  product_id INTEGER PRIMARY KEY,
  product_name VARCHAR(100) NOT NULL,
  supplier_id INT NOT NULL,
  FOREIGN KEY (supplier_id) REFERENCES t_suppliers (supplier_id)
);


--######## DROP Constraint  ########

ALTER TABLE table_name DROP CONSTRAINT c_name;

--######## Update foreign key Constraint on existing table ########

-- ALTER TABLE table_name ADD CONSTRAINT c_name FOREIGN KEY (columnname) 
--REFERENCES table2_name (column_name);


--######## CHECK constraint ########

CREATE TABLE staff (
  staff_id SERIAL PRIMARY KEY,
  first_name VARCHAR (50),
  last_name VARCHAR (50),
  birth_date DATE CHECK (birth_date>'1900-01-01'),
  joined_date DATE CHECK ( joined_date > birth_date),
  salary numeric CHECK (salary > 0)
);

SELECT * from staff;

INSERT INTO staff ( first_name, last_name, birth_date, joined_date, salary)
VALUES ( 'ADAM' , 'KING' , '1999-01-01', '2002-01-01',100);

INSERT INTO staff ( first_name, last_name, birth_date, joined_date, salary)
VALUES ( 'John' , 'Adams' , '2020-01-01', '2020-01-01',100); -- error

-- add check constraint to existing table
ALTER TABLE prices
ADD CONSTRAINT price_check
CHECK ( 
  price > 0
  AND discount >=0
  AND price > discount
);

-- rename constraint

ALTER TABLE table_name
RENAME CONSTRAINT old_name TO new_name

--Drop a constraint
ALTER TABLE table_name
DROP CONSTRAINT c_name

