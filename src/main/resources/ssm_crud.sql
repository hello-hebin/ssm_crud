DROP database IF EXISTS `ssm_crud`;
create database ssm_crud;

use ssm_crud;
create table account(
       id int primary key auto_increment,
       name varchar(20),
       money double
);

insert into account (name,money) values ('熊大',100);
insert into account (name,money) values ('熊二',200);
insert into account (name,money) values ('熊三',300);

