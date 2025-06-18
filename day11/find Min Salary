mysql>  select * from employee
    ->  where salary = (select min(salary)
    ->  from employee
    -> where dep='sale');
+-------+--------+---------+--------+------------+
| empid | name   | dep     | salary | joindate   |
+-------+--------+---------+--------+------------+
|     4 | kathir | editing | 100000 | 2010-01-12 |
|     5 | levy   | sale    | 100000 | 2020-10-16 |
+-------+--------+---------+--------+------------+
2 rows in set (0.00 sec)

mysql>
