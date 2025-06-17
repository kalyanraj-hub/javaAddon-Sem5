//multiRow Functions
mysql> select avg(salary),sum(salary),max(salary)
    -> from Employee;
+-------------+-------------+-------------+
| avg(salary) | sum(salary) | max(salary) |
+-------------+-------------+-------------+
| 284000.0000 |     1420000 |     1000000 |
+-------------+-------------+-------------+
1 row in set (0.00 sec)

mysql> select avg(salary),sum(salary),max(salary),count(name)
    -> from Employee;
+-------------+-------------+-------------+-------------+
| avg(salary) | sum(salary) | max(salary) | count(name) |
+-------------+-------------+-------------+-------------+
| 284000.0000 |     1420000 |     1000000 |           5 |
+-------------+-------------+-------------+-------------+
1 row in set (0.00 sec)

mysql>
