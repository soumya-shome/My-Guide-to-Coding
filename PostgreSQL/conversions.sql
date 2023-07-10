-- What is a type conversion?
/*

1. A data converted from its ORIGINAL dra type to ANOTHER data type, it is called 'Type Conversion'

2. Two type Of conversions
	Implicit	data conversion is done AUTOMATICALLY
	Explicit	data conversion is done via 'conversion functions' examples e.g CAST or ::

3. 'Type conversion'

*/

SELECT * FROM movies;

--integer =integer

SELECT * FROM movies
WHERE movie_id =1 -- same data type, so NO CONVERSION

-- integer = string

SELECT * FROM movies
WHERE movie_id ='1'  --PostgreSQL automatically do the conversion here i.e. Implicit conversion

-- 4. what if we want to use Explicit conversion?

SELECT * FROM movies
WHERE movie_id = integer '1'

-- Using CAST for data conversions

--PostgreSQL CAST Operator is used to convert a value of one type to another data type

CAST (expression AS target_data_type);

/*

expression	Can be a constant, a table column, or an expression

target_data_type	Boolean; Character (char, varchar, text), Numberic (integer, floating point number); array
					; JSON; UUID; hstore (stores as key/value pairs); Temporal type (date,time,timestamp,interval)
					special type (network address, geometric data)
*/


--1. String to integer conversion

SELECT  CAST ('10' AS INTEGER);

--2. String to date conversion

SELECT CAST('2020-01-01' AS DATE);

--String to boolean

SELECT CAST ('true' AS BOOLEAN),
CAST ('t' AS BOOLEAN);

--String to double

SELECT CAST('14.7888' AS DOUBLE PRECISION);

--YOu can also use the following syntax for conversion directly too

expression::type

SELECT '10'::INTEGER, '2020-01-01'::DATE;

--String to timestamp

SELECT '2020-02-20 10:30:25.467'::TIMESTAMP;

--with timezone

SELECT '2020-02-20 10:30:25.467'::TIMESTAMPTZ;

--String to Interval

SELECT '10 minute'::interval,'4 hour'::interval

-- Implicit to explicit conversions
-- 1. Using integer and factorial

SELECT 20 !;

SELECT 20 ! AS "result";

-- ! factorial takes an ardument type bigint!, so lets convert integer to bigint ,

SELECT CAST(20 AS bigint) ! AS "result";

-- 2. Round with numeric

SELECT ROUND(10,4) AS "result";

-- 3. CAST with text
SELECT SUBSTR('123456',2) AS "result"

SELECT
	SUBSTR ('123456',2) AS "Implicit"
	SUBSTR (CAST('123456' AS TEXT),2) AS "explicit";
	
	
	
--Table data conversion
-- 1. Lets create a table called 'ratings' with initial data as charaters

CREATE TABLE ratings(
	rating_id SERIAL PRIMARY KEY,
	rating VARCHAR(1) NOT NULL
	);

SELECT * FROM ratings;
-- 2. Lets insert some data

INSERT INTO ratings (rating) VALUES
('A'),('B'),('C'),('D');

SELECT * FROM ratings;

--3. Now say the business requirements is changes and now they want the all ratings to be numeric.
	-- so lets first add some integer data
	
INSERT INTO ratings (rating) VALUES
(1),(2),(3),(4);

SELECT * FROM ratings;

--5. Now, we have to convert all values in the rating column into integers
--We will use CAST to change all non-numeric data to integers
SELECT
	rating_id,
	CASE
		WHEN rating~E'^\\d+$' THEN
			CAST (rating AS INTEGER)
		ELSE
			0
		END as rating
FROM
	ratings ;
	
	
-- to_char()
/*
1.PostgreSQL function converts
	— a timestamp,
	- an interval,
	- an integer,
	- a double precision, or
	— a numeric value

to a string.

2. TO_CHAR (expression, format)

3. Valid format options for numbers

Format Description
	9 Numeric value with the speci fied number of digits
	0 Numeric value with leading zeros
	. (period) decimal point
	D decimal point that uses locale
	, (comma) group (thousand) separator
	FM Fill mode, which suppresses padding blanks and leading zeroes .
	PR Negative value in an le brackets.
	S Sign anchored to a number that uses locale
	L Currency symbol that uses locale
	G Group separator that uses locale
	MI Minus sign in the specified position for numbers that are less than O.
	PL Plus sign in the specified position for numbers that are greater than O.
	SG Plus / minus sign in the specified posi t ion
	RN Roman numeral that ranges from 1 to 3999
	TH or th Upper case or lower case ordinal number suffix
	
Valid timestamp format options
Pattern		Description

Y,YYY		year in 4 digits with comma
YYYY		year in 4 digits
YYY			last 3 digits Of year
YY			last 2 digits Of year
Y			The last digit of year
IYYY		ISO 8601 week-numbering year (4 or more digits)
IYY			Last 3 digits of ISO 8601 week-numbering year
IV			Last 2 digits of ISO 8601 week-numbering year
I 			Last digit of ISO 8601 week-numbering year
BC, bc, AD or ad 	Era indicator without periods
B.C., b.c., A.D. or a.d. Era indicator with periods
MONTH 		English month name in uppercase
Month		Full capitalized English month name
month		Full lowercase English month name
MON			Abbreviated uppercase month name e.g. JAN, FEB, etc.
Mon			Abbreviated capitali zed month name e.g, Jan, Feb, etc.
mon			Abbreviated lowercase month name e.g., jan, feb, etc.
MM			month number from 01 to 12
DAY			Full uppercase day name
Day 		Full capitalized day name
day			Full lowercase day name
DY			Abbreviated uppercase day name
Dy			Abbreviated capitali zed day name
dy			Abbreviated lowercase day namel
DDD			Day of year (001-366)
IDDD		Day Of ISO 8601 week-numbering year (001-371; day 1 Of the year is Monday Of the first ISO week)
DD			Day Of month (01—31)
D			Day of the week, Sunday (1) to Saturday (7)
ID			ISO 8601 day of the week, Monday (1) to Sunday (7)
W			Week of month (1-5) (the first week starts on the first day of the month)
WW			Week number of year (1-53) (the first week starts on the first day of the year)
IW			Week number of ISO 8601 week-numbering year (01-53; the first Thursday of the year is in week 1) 
CC			Century e.g, 21, 22, etc.
J			Julian Day (integer days since November 24, 4714 BC at midnight UTC) 
RM			Month in upper case Roman numerals (I-XII; >
rm			Month in lowercase Roman numerals (i-xii; > rm
HH			Hour of day (0-12)
HH12		Hour of day (0-12)
HH			Hour of day (0-12)
HH12		Hour of day (8-12)
HH24		Hour of day (0-23)
MI			Minute (0-59)
SS			Second (0-59)
MS			Millisecond (000-9999)
US			Microsecond (000000-999999)
SSSS		Seconds past midnight (0-86399)
AM,am, PM or pm 	Meridiem indicator (without periods)
A.M., a.m., P.M. or p.m.	Meridiem indicator (with periods)

4. return value will be a TEXT data type I
*/

--Convert an integer to a string
SELECT TO_CHAR (100970, '9,99999');

--LETS VIEW MOVIE RELEASE DATE IN DD-MM-YYYY FROMAT

SELECT 
	release_date, 
	TO_CHAR(release_date,'DD-MM-YYYY'),
	TO_CHAR(release_date,'Dy,MM, YYYY')
FROM movies;

-- converting timestamp to a string
SELECT
	TO_CHAR(
		TIMESTAMP '2020-01-01 10:30:45',
		'HH24 : MI : SS'
	);
--Adding currency symbol to say movies revenues
SELECT
	movie_id
	revenues_domestic,
	TO_CHAR (revenues_domestic, '$99999D99')
FROM movies_revenues ;

-- TO_NUMBER().
/*
1.PostgreSQL TO_NUMBER() function converts a character string to a numeric value.
2. to_number(string, format)
3. format options are;

Format Description
9	Numeric value with the speci fied number of digits
0	Numeric value with leading zeros
.	(period) decimal point
D	decimal point that uses locale
,	(comma) group (thousand) separator
FM	Fill mode, which suppresses A'dding blanks and leading zeroes.
PR	Negative value in angle brackets.
S	Sign anchored to a number that uses locale
L	Currency symbol that uses locale
G	Group separator that uses locale
MI	Minus sign in the specified position for numbers that are less than O.
PL	Plus sign in the specified position for numbers that are greater than O.
SG	Plus / minus sign in the specified posi t ion
RN	Roman numeral that ranges from 1 to 3999
TH or th	Upper case or lower case ordinal number suffi
*/

--convert a string to a number
select to_number('1420.89','9999.');

SELECT
TO_NUMBER(
'10,625.78-',
'99G999D99S');

--formating
SELECT TO_NUMBER(
'$1,420.64','L9G999');

SELECT TO_NUMBER('1,234,567.89','9G999g999');

SELECT TO_NUMBER('1,234,567.89','9G999g999D99');

--converting say money number
SELECT TO_NUMBER('$1,978,299.78','L9G999g999.99');

--TO_DATE()
/*
1. PostgreSQL function that helps you convert a string to a date.
2, TO_DATE(text,format) ;
3. Valid format options are;

Pattern Description
Y,YYY	year in 4 digits with comma
YYYY	year in 4 digits
YYY		last 3 digits of year
YY		last 2 digits of year
Y		The last digit of year
IYYY	ISO 8601 week—numbering year (4 or more digits)
IYY		Last 3 digits of ISO 8601 week-numbering year
IY		Last 2 digits of ISO 8601 week-numbering year
I		Last digit of ISO 8601 week-numbering year
BC, bc, AD or ad 	Era indicator without periods
B.c.,b. c. , A.D. or a. d. 	Era indicator with periods
MONTH	English month name in uppercase
Month	Full capitali zed English month name
month	Full lowercase English month name
MON		Abbreviated uppercase month name e.g. ,JAN, FEB, etc.
Mon		Abbreviated capitatized month name e . g, Jan, Feb, etc.
mon		Abbreviated lowercase month name e.g. ,jan, feb, etc.
MM		month number from 01 to 12
DAY		Full uppercase day name
Day		Full capitali zed day name
day		Full lowercase day name
DY		Abbreviated uppercase day name
Dy		Abbreviated capi talized day name
dy		Abbreviated lowercase day name
DDD		Day Of year (001—366)
IDDD	Day Of ISO 8661 week—numbering yrar day 1 Of the year is Monday Of the first ISO week)
DD		Day Of month (01—31)
D		Day Of the week, Sunday (1) to Saturday (7)
ID		ISO 8601 day of the week, Monday (1) to Sunday (7)
W		Week of month (1-5) (the first week starts on the first day of the month)
WW		Week number of year (1-53) (the first week starts on the fi rst day of the year)
IW		Week number of ISO 8601 week-numbering year (01—53; the fi rst Thursday of the year is in week 1)
CC		Century e. g, 21, 22, etc.
J		Julian Day (integer days since November 24, 4714 BC at ght UTC)
RM		Month in upper case Roman numerals (I—XII; >
rm		Month in lowercase Roman numerals (i —xii ;
HH		Hour of day (0—12)
HH12	Hour Of day (0—12)
HH24	Hour of day (0—23)
MI		Minute (0-59)
SS		Second (0-59)
MS		Mi11i second (000—9999)
US		Microsecond (000000-999999)
SSSS	Seconds past midni ght (0—86399)
AM, am,PM or pm		Meridiem indicator (wi thout peri ods)
A.M., a.m., P.M. or p.m.	Meridiem indicator (with periods)

4. return value is a date
*/

SELECT TO_DATE('2020/10/22','YYYY/MM/DD');

SELECT TO_DATE('022199','MMDDYY');

SELECT TO_DATE('March 07, 2019','Month DD, YYYY');

--error handling

SELECT TO_DATE('2020/02/25','YYYY/MM/DD');

--TO_timestamp
/*
1. PostgreSQL function to convert a string to a timestamp based on a specified format.
2, TO_timestamp(timestamp,format) ;
3. Valid format options are;

Pattern Description
Y,YYY	year in 4 digits with comma
YYYY	year in 4 digits
YYY		last 3 digits of year
YY		last 2 digits of year
Y		The last digit of year
IYYY	ISO 8601 week—numbering year (4 or more digits)
IYY		Last 3 digits of ISO 8601 week-numbering year
IY		Last 2 digits of ISO 8601 week-numbering year
I		Last digit of ISO 8601 week-numbering year
BC, bc, AD or ad 	Era indicator without periods
B.c.,b. c. , A.D. or a. d. 	Era indicator with periods
MONTH	English month name in uppercase
Month	Full capitali zed English month name
month	Full lowercase English month name
MON		Abbreviated uppercase month name e.g. ,JAN, FEB, etc.
Mon		Abbreviated capitatized month name e . g, Jan, Feb, etc.
mon		Abbreviated lowercase month name e.g. ,jan, feb, etc.
MM		month number from 01 to 12
DAY		Full uppercase day name
Day		Full capitali zed day name
day		Full lowercase day name
DY		Abbreviated uppercase day name
Dy		Abbreviated capi talized day name
dy		Abbreviated lowercase day name
DDD		Day Of year (001—366)
IDDD	Day Of ISO 8661 week—numbering yrar day 1 Of the year is Monday Of the first ISO week)
DD		Day Of month (01—31)
D		Day Of the week, Sunday (1) to Saturday (7)
ID		ISO 8601 day of the week, Monday (1) to Sunday (7)
W		Week of month (1-5) (the first week starts on the first day of the month)
WW		Week number of year (1-53) (the first week starts on the fi rst day of the year)
IW		Week number of ISO 8601 week-numbering year (01—53; the fi rst Thursday of the year is in week 1)
CC		Century e. g, 21, 22, etc.
J		Julian Day (integer days since November 24, 4714 BC at ght UTC)
RM		Month in upper case Roman numerals (I—XII; >
rm		Month in lowercase Roman numerals (i —xii ;
HH		Hour of day (0—12)
HH12	Hour Of day (0—12)
HH24	Hour of day (0—23)
MI		Minute (0-59)
SS		Second (0-59)
MS		Mi11i second (000—9999)
US		Microsecond (000000-999999)
SSSS	Seconds past midni ght (0—86399)
AM, am,PM or pm		Meridiem indicator (wi thout peri ods)
A.M., a.m., P.M. or p.m.	Meridiem indicator (with periods)

4. return value is a date
*/

SELECT TO_TIMESTAMP('2020-10-28 10:30:25','YYYY-MM-DD HH:MI:SS');

-- it skip spaces

SELECT TO_TIMESTAMP('2020         May','YYYY MON');

--minimal error checking is done, so be carefule!!!!!

SELECT TO_TIMESTAMP('2020-01-01 32:8:00','YYYY-MM-DD HH24:MI:SS');

SELECT TO_TIMESTAMP('2020-01-01 23:8:00','YYYY-MM-DD HH24:MI:SS');
