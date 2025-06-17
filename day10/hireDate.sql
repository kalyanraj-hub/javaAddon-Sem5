mysql> select name,joindate
    -> from Employee
    -> where joindate> '2010-12-31' and joindate <'2024-01-10';
+----------+------------+
| name     | joindate   |
+----------+------------+
| chandran | 2023-01-04 |
| henry    | 2023-01-04 |
| levy     | 2020-10-16 |
+----------+------------+
3 rows in set (0.00 sec)

mysql>
