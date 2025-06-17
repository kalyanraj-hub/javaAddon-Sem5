mysql> select sum(salary),dep
    -> from Employee
    -> group by dep;
+-------------+-----------+
| sum(salary) | dep       |
+-------------+-----------+
|     1000000 | creative  |
|      200000 | finance   |
|       20000 | marketing |
|      100000 | editing   |
|      100000 | sale      |
+-------------+-----------+
5 rows in set (0.00 sec)

mysql>
