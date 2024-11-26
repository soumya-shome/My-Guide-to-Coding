create table customers(
	customer_id serial primary key,
	first_name varchar(50),
	last_name varchar(50),
	email varchar(150),
	age int
);

select * from customers;

insert into customers (first_name,last_name,email,age)
values ('Adnan','Waheed','a@b.com',40);

insert into customers (first_name,last_name)
values ('Adnan','Waheed'),
('John','Adams'),
('Linda','Abe');

insert into customers (first_name) values ('Bill ''O Sullivan');

insert into customers (first_name)
values ('ADAM');

insert into customers (first_name)
values ('Joseph') returning *;

insert into customers (first_name)
values ('Joseph') returning customer_id;


update customers
set email='a2@b.com'
where customer_id=2;

update customers
set
email = 'a4b.com',
age=30
where customer_id=1;

update customers
set
email='a@b.com'
where customer_id=3
returning *;

update customers
set is_enable ='Y'


select * from customers order by customer_id;

delete from customers
where customer_id=7;

delete from customers returning *;

create table t_tags (
	id serial primary key,
	tag text unique,
	update_date timestamp default now()
);

insert into t_tags (tag) values
('Pen'),('Pencil');

-- 2023-04-18 20:34:14.730678

Select * from t_tags;


insert into t_tags (tag)
values ('Pen')
on conflict (tag)
do
	nothing;
	
insert into t_tags (tag)
values ('Pen')
on conflict (tag)
do
	update set
		tag = excluded.tag || '1',
		update_date=now();