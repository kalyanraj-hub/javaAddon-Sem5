mysql> create database Librarys;
Query OK, 1 row affected (0.04 sec)

mysql> use librarys
Database changed
mysql> create table student(roll_no varchar(20) primary key,name varchar(20),course_name varchar(20),course_id varchar(20));
Query OK, 0 rows affected (0.07 sec)

mysql> insert into student values("jb58","vivin","ml","ml01");
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values("jb02","abdul","wd","wd01");
Query OK, 1 row affected (0.04 sec)

mysql> insert into student values("jb29","Kalyan","fsd","fsd01");
Query OK, 1 row affected (0.04 sec)

mysql> insert into student values("jb50","SriHarish","wd","wd01");
Query OK, 1 row affected (0.04 sec)

mysql> select * from student;
+---------+-----------+-------------+-----------+
| roll_no | name      | course_name | course_id |
+---------+-----------+-------------+-----------+
| jb02    | abdul     | wd          | wd01      |
| jb29    | Kalyan    | fsd         | fsd01     |
| jb50    | SriHarish | wd          | wd01      |
| jb58    | vivin     | ml          | ml01      |
+---------+-----------+-------------+-----------+
4 rows in set (0.00 sec)

mysql> create table course(course_id varchar(20),course_name varchar(20))
    -> ;
Query OK, 0 rows affected (0.04 sec)

mysql> insert into course values("wdo1","web-development");
Query OK, 1 row affected (0.01 sec)

mysql> insert into course values("ai01","Artifical intelengence");
ERROR 1406 (22001): Data too long for column 'course_name' at row 1
mysql> insert into course values("ai01","Artifical-intelengence");
ERROR 1406 (22001): Data too long for column 'course_name' at row 1
mysql> insert into course values("ai01","Artificalintelengence");
ERROR 1406 (22001): Data too long for column 'course_name' at row 1
mysql> insert into course values("ai01","Artificalintelengence");
ERROR 1406 (22001): Data too long for column 'course_name' at row 1
mysql> insert into course values("ai01","AI");
Query OK, 1 row affected (0.04 sec)

mysql> insert into course values("ml01","ML");
Query OK, 1 row affected (0.03 sec)

mysql> insert into course values("fsd01","Full Stack");
Query OK, 1 row affected (0.05 sec)

mysql> select * from course;
+-----------+-----------------+
| course_id | course_name     |
+-----------+-----------------+
| wdo1      | web-development |
| ai01      | AI              |
| ml01      | ML              |
| fsd01     | Full Stack      |
+-----------+-----------------+
4 rows in set (0.00 sec)

mysql>
