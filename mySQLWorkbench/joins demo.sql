create database demo1;
use demo1;

create table emp (
	e_id int primary key,
    name varchar(200),
    age int check(age>18)
);
 desc emp;
 insert into emp values(1,'abc',19);
 insert into emp(e_id, name, age) values(2, 'pqr',23),(3,'xyz',25),(4,'klm',21);
  insert into emp values(6,'hij',21);
 select * from emp;
 
create table dep(
	d_id int,
    d_name varchar(100),
    emp_id int, 
    primary key(d_id),
    foreign key (emp_id) references emp(e_id)
);
desc dep;

insert into dep (d_id, d_name,emp_id) values(1,'IT',1);
insert into dep(d_id, d_name, emp_id) values(2, 'civil',1),(3,'IT',2),(4,'mech',3),(5,'IT',4);
insert into dep (d_id, d_name,emp_id) values(6,'CSE',1);
insert into dep (d_id, d_name,emp_id) values(7,'CSE',6);
select* from dep;
	
    # inner join
	select e.e_id, e.name, e.age, d.d_id, d.d_name from emp as e
	Inner JOIN dep as d on e.e_id = d.emp_id;
    
    # left outer join
	select e.e_id, e.name, e.age, d.d_id, d.d_name from emp as e
	left JOIN dep as d on e.e_id = d.emp_id;
    
    # right outer join
	select e.e_id, e.name, e.age, d.d_id, d.d_name from emp as e
	right JOIN dep as d on e.e_id = d.emp_id;
    
    # self join
	select e.e_id, e.name, e.age, d.d_id, d.d_name from emp as e,
	 dep as d;
     # self join
     select e.e_id, e.name, e.age, d.d_id, d.d_name from emp as e,
	 dep as d where d.d_name= 'IT';
     
 