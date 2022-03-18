create database StudentDatabase;
use StudentDatabase;
create  table Student(rollNo int key, fName varchar(10),lName varchar(10));
desc Student;
show tables;
insert into Student values(3, 'manasa', 'kallutla'),(2,'sai','Malhotra');
select * from Student;
select rollNo from Student;
update Student set lName = 'Kallutla' where rollNo = '2';
select * from Student;
alter table Student add mobileNum varchar(10);
desc Student;
update Student set mobileNum = '9059903113' where rollNo = '2';
select * from Student;
update Student set mobileNum = '7036281766' where rollNo = '3';
delete from Student where rollNo = '1';
select * from Student;

// the below command is used to update or delet the records in a table without using primary key
set sql_safe_updates = 0;

 