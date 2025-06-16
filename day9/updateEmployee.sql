 UPDATE Employee SET salary=salary+10 WHERE department= 'finance';
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT*from Employee;
+-------+----------+------------+---------+------------+
| empid | name     | department | salary  | joindate   |
+-------+----------+------------+---------+------------+
|     1 | soma     | creative   | 1000000 | 2026-02-05 |
|     2 | chandran | finance    |  200010 | 2023-01-04 |
|     3 | henry    | marketing  |   20000 | 2023-01-04 |
|     4 | kathir   | editing    |  100000 | 2010-01-12 |
|     5 | levy     | sale       |  100000 | 2020-10-16 |
+-------+----------+------------+---------+------------+
5 rows in set (0.00 sec)

mysql>
