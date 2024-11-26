--Database: mydata
-- DROP DATABASE mydata;

CREATE DATABASE mydata
	WITH
	OWNER = postgres
	ENCODING = 'UTF8'
	LC_COLLATE = 'C'
	LC_CTYPE = 'C'
	TABLESPACE = pg_default
	CONNECTION LIMIT = -1;

CREATE TABLE persons(
	person_id SERIAL PRIMARY KEY,
	first_name VARCHAR (20) not null,
	tast_name VARCHAR(20) NOT NULL
);

ALTER TABLE persons
ADD COLUMN age INT NOT NULL;

SELECT * FROM persons,

ALTER TABLE persons
ADD COLUMN nationality VARCHAR(20) not null,
ADD COLUMN email varchar(100) UNIQUE;

--Modify Tabble Structure

--rename a table

ALTER TABLE users
RENAME TO persons;

--rename a column

ALTER TABLE persons
RENAME COLUMN age to person_age

--drop a column


ALTER TABLE persons
DROP COLUMN person_age;

ALTER TABLE persons
ADD COLUMN age VARCHAR(10);

--change the data type of a column

ALTER TABLE persons
ALTER COLUMN age TYPE int
USING age::integer;

ALTER TABLE persons
ALTER COLUMN age TYPE VARCHAR (20);

SELECT * from persons;

--set a default value of a column

ALTER TABLE persons
ADD COLUMN is_enable VARCHAR(1);

ALTER tABLE persons
ALTER COLUMN is_enable SET DEFAULT 'Y';

INSERT INTO persons
(
	first_name,
	last_name,
	nationality,
	age
)
VALUES
(
	'JOHN',
	'BENJAMIN',
	'US',
	40
);


-- add a constraint to a column

--add a unique constraint to a column
CREATE TABLE web_links(
	link_id SERIAL PRIMARY KEY,
	link_url VARCHAR (255) NOT NULL,
	link_target VARCHAR (20)
);

SELECT * from web_links

INSERT INTO web_links (links_url,link_target) VALUES ('https://www.google.com','_blank');

ALTER TABLE web_links
ADD CONSTRAINT unique_web_url UNIQUE (link_url);

--to set a column to accept only defined allowed/acceptable values

ALTER TABLE web_links
ADD COLUMN is_enable VARCHAR(2) ;

INSERT INTO web_links (link_url,link_target,is_enable) VALUES('https://www.CITI.com','_blank','N');

ALTER TABLE web_links
ADD CHECK (is_enable IN ('Y' , 'N'));

UPDATE web_links
SET is_enable = 'N'
WHERE link_id = 3