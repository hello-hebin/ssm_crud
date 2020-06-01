# ssm_crud : SSM框架整合之CRUD操作
CSDN: https://blog.csdn.net/weixin_44505194/article/details/106465333

 - 说明：
 	主要将SSM框架整合，做简单的业务逻辑操作CRUD，所以前端并不怎么好看，但是业务逻辑更集中SSM整合和CRUD操作，非常适合刚学过Sping + SpringMVC +Mybatis的伙伴。
		
 - 展示：
 1. 前台页面：
 
	![在这里插入图片描述](https://img-blog.csdnimg.cn/20200601080446657.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDUwNTE5NA==,size_16,color_FFFFFF,t_70)

2. 代码布局

	![在这里插入图片描述](https://img-blog.csdnimg.cn/2020060108093813.png)

- 数据库：
	**ssm_crud.sql**
	```sql
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
	```
	![在这里插入图片描述](https://img-blog.csdnimg.cn/20200601082118258.png)
	
	**项目代码我已开源至 [Github](https://github.com/hello-hebin/ssm_crud)**
