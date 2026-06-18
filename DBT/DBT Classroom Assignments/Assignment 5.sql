/* Assignment 5 */


/* Q.1 Display Name of the salesperson, customer name and amount of sales. */

mysql> select salespeople.sname as sales_person, customers.cname as customer, orders.amt as sales_amount from orders join salespeople on orders.snum=salespeople.snum 
join customers on orders.cnum=customers.cnum;
+--------------+----------+--------------+
| sales_person | customer | sales_amount |
+--------------+----------+--------------+
| Rajan        | Santosh  |       767.19 |
| James        | Santosh  |        18.69 |
| Alax         | Santosh  |       500.58 |
| Natasha      | Santosh  |        245.6 |
| Natasha      | Santosh  |       600.65 |
| James        | Santosh  |       138.35 |
| Rajan        | Santosh  |       125.45 |
| Alax         | Joe      |        75.75 |
| Alax         | Joe      |      1713.23 |
| Alax         | Joe      |      3455.78 |
| Alax         | Joe      |      1245.98 |
| Rajan        | Joe      |       767.19 |
| Alax         | Joe      |      1713.23 |
| Monika       | Joe      |        75.75 |
| Natasha      | Joe      |      1309.95 |
| Alax         | Joe      |      3455.78 |
| Alax         | Joe      |      1245.98 |
| Natasha      | Joe      |       522.23 |
| James        | Joe      |       980.65 |
| James        | Joe      |      1000.95 |
| James        | Joe      |       790.75 |
| Natasha      | Raj      |      5160.45 |
| James        | Raj      |      5160.45 |
| Natasha      | Grass    |      1309.95 |
| Natasha      | Grass    |        734.5 |
| Natasha      | Grass    |        734.5 |
| Alax         | Grass    |       1200.8 |
| James        | Grass    |      2133.35 |
| Rajan        | Raja     |         4723 |
| Rajan        | Raja     |      9891.88 |
| Rajan        | Raja     |      3721.53 |
| Rajan        | Raja     |      1729.67 |
| Natasha      | Raja     |         4723 |
| Rajan        | Raja     |      9891.88 |
| Rajan        | Raja     |      3721.53 |
| James        | Raja     |      1729.67 |
| James        | Raja     |      3434.55 |
| James        | Raja     |       1500.5 |
| Monika       | Raja     |       535.25 |
| James        | Raja     |      1100.25 |
| Monika       | Jackson  |       1900.1 |
| Monika       | Jackson  |       1900.1 |
| Rajan        | Jackson  |        125.5 |
| James        | William  |        18.69 |
| James        | William  |      1098.16 |
| James        | William  |      1098.16 |
| James        | William  |        457.4 |
| Alax         | William  |        145.2 |
| James        | William  |      1350.75 |
+--------------+----------+--------------+
49 rows in set (0.02 sec)


/* 2. List employee name and name of managers. */
mysql> select employee.ename as employee_name, manager.ename as manager_name from emp employee join emp manager on employee.mgr=manager.empno;
+---------------+--------------+
| employee_name | manager_name |
+---------------+--------------+
| GITA          | GRASS        |
| VRUSHALI      | GRASS        |
| SHARMIN       | GRASS        |
| BANDISH       | GRASS        |
| SMITH         | FORD         |
| AARAV         | FORD         |
| THOMAS        | GRASS        |
| ALLEN         | BLAKE        |
| WARD          | BLAKE        |
| JONES         | KING         |
| MARTIN        | BLAKE        |
| BLAKE         | KING         |
| CLARK         | KING         |
| SCOTT         | JONES        |
| FRED          | KING         |
| TURNER        | BLAKE        |
| ADAMS         | SCOTT        |
| Ruhan         | Ruhan        |
| Neel          | KING         |
| JAMES         | BLAKE        |
| FORD          | JONES        |
| HOFFMAN       | JONES        |
| GRASS         | HOFFMAN      |
| MILLER        | CLARK        |
| AARUSH        | FORD         |
| ALEX          | BLAKE        |
| NATASHA       | GRASS        |
| SANGITA       | GRASS        |
| SUPRIYA       | GRASS        |
+---------------+--------------+
29 rows in set (0.05 sec)

/* 3. Display details of all departments and the corresponding employees */


mysql> select dept.* , emp.* from dept left join emp on dept.deptno=emp.deptno;
+--------+------------+----------+------------+------------+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+
| DEPTNO | DNAME      | LOC      | PWD        | STARTEDON  | EMPNO | ENAME    | GENDER | JOB                 | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME    | PWD        | PHONE      | isActive |
+--------+------------+----------+------------+------------+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+
|     10 | ACCOUNTING | NEW YORK | r50mpm     | 24/03/1989 |  7415 | AARAV    | M      | CLERK               | 7902 | 1981-12-31 | 3350 | NULL |     10 |    NULL | AARAV        | NULL       | 7032300084 |        0 |
|     10 | ACCOUNTING | NEW YORK | r50mpm     | 24/03/1989 |  7421 | THOMAS   | M      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     10 |       1 | THOMAS       | r50mpm     | 7032300011 |        0 |
|     10 | ACCOUNTING | NEW YORK | r50mpm     | 24/03/1989 |  7782 | CLARK    | M      | MANAGER             | 7839 | 1981-06-09 | 2450 | NULL |     10 |       3 | CLARK        | r50mpm     | 7032300001 |        1 |
|     10 | ACCOUNTING | NEW YORK | r50mpm     | 24/03/1989 |  7839 | KING     | M      | PRESIDENT           | NULL | 1981-11-17 | 5000 | NULL |     10 |       1 | KING         | r50mpm     | 7132300081 |        1 |
|     10 | ACCOUNTING | NEW YORK | r50mpm     | 24/03/1989 |  7934 | MILLER   | M      | CLERK               | 7782 | 1982-01-23 | 1300 | 1300 |     10 |       2 | QUARTERNOTE  | r50mpm     | 7132300055 |        0 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |  6473 | SHARMIN  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | SHARMIN      | a12recmpm  | NULL       |        1 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |  6781 | BANDISH  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | BANDISH      | a12recmpm  | NULL       |        1 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |  7369 | SMITH    | M      | CLERK               | 7902 | 1980-12-17 |  800 | NULL |     20 |       2 | TRITONE      | a12recmpm  | 7032300023 |        0 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |  7566 | JONES    | M      | MANAGER             | 7839 | 1981-04-02 | 2975 | NULL |     20 |       4 | HONEYCOMB    | a12recmpm  | 7132300039 |        1 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |  7788 | SCOTT    | M      | ANALYST             | 7566 | 1982-12-09 | 3000 | NULL |     20 |       3 | WHITE SAND   | a12recmpm  | NULL       |        1 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |  7840 | FRED     | M      | vice PRESIDENT      | 7839 | 1983-08-09 | 5000 | NULL |     20 |       1 | SAND STONE   | a12recmpm  | NULL       |        1 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |  7876 | ADAMS    | M      | CLERK               | 7788 | 1983-01-12 | 1100 | NULL |     20 |       1 | CRAZY ANYONE | a12recmpm  | 7132300086 |        1 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |  7902 | FORD     | M      | ANALYST             | 7566 | 1981-12-03 | 3000 | NULL |     20 |       4 | CONBRIO      | a12recmpm  | NULL       |        0 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  6001 | GITA     | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | GITA         | sales@2017 | NULL       |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7499 | ALLEN    | M      | SALESMAN            | 7698 | 1981-02-20 | 1600 |  300 |     30 |       4 | ALWAYS TESTE | sales@2017 | 7032300096 |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7521 | WARD     | M      | SALESMAN            | 7698 | 1981-02-22 | 1250 |  500 |     30 |       1 | WARD         | sales@2017 | 7132300034 |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7654 | MARTIN   | M      | SALESMAN            | 7698 | 1981-09-28 | 1250 | 1400 |     30 |       6 | LIFE RACER   | sales@2017 | 7132300050 |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7698 | BLAKE    | M      | MANAGER             | 7839 | 1981-05-01 | 2850 | NULL |     30 |       1 | BIG BEN      | sales@2017 | 7132300027 |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7844 | TURNER   | M      | SALESMAN            | 7698 | 1981-09-08 | 1500 |    0 |     30 |       5 | SAND DUST    | sales@2017 | NULL       |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7900 | JAMES    | M      | CLERK               | 7698 | 1981-12-03 |  950 | NULL |     30 |       2 | CRAZY LEADER | sales@2017 | 7132300042 |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7919 | HOFFMAN  | M      | MANAGER             | 7566 | 1982-03-24 | 4150 | NULL |     30 |       3 | INTERVAL     | sales@2017 | NULL       |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7920 | GRASS    | M      | SALESMAN            | 7919 | 1980-02-14 | 2575 | 2700 |     30 |       5 | GRASS        | sales@2017 | NULL       |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7945 | AARUSH   | M      | SALESMAN            | 7902 | 1980-02-14 | 1350 | 2700 |     30 |    NULL | AARUSH       | ABCDEF     | NULL       |        0 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  7949 | ALEX     | M      | MANAGER             | 7698 | 1982-01-24 | 1250 |  500 |     30 |       5 | QUARTERREST  | sales@2017 | 7156567183 |        1 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |  8433 | NATASHA  | F      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | NATASHA      | sales@2017 | NULL       |        1 |
|     40 | OPERATIONS | BOSTON   | opr@123    | 12/07/1989 |  NULL | NULL     | NULL   | NULL                | NULL | NULL       | NULL | NULL |   NULL |    NULL | NULL         | NULL       | NULL       |     NULL |
|     50 | HR         | PUNE     | PUN@8877   | 22/12/1989 |  6129 | VRUSHALI | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | VRUSHALI     | PUN@8877   | NULL       |        1 |
|     50 | HR         | PUNE     | PUN@8877   | 22/12/1989 |  9400 | SANGITA  | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SANGITA      | NULL       | NULL       |        1 |
|     50 | HR         | PUNE     | PUN@8877   | 22/12/1989 |  9473 | SUPRIYA  | F      | ANALYST             | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SUPRIYA      | XYZ@1234   | NULL       |        1 |
|     60 | IT         | BARODA   | BRD@1122   | 02/10/1989 |  7888 | Ruhan    | M      | Network             | 7888 | 1983-08-09 | 2000 | NULL |     60 |       1 | Ruhan        | BRD@1122   | NULL       |        1 |
|     60 | IT         | BARODA   | BRD@1122   | 02/10/1989 |  7889 | Neel     | M      | vice PRESIDENT      | 7839 | 1983-08-09 | 1000 | NULL |     60 |       0 | Neel         | BRD@1122   | NULL       |        1 |
+--------+------------+----------+------------+------------+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+
31 rows in set (0.05 sec)


/* 4. Display all customer names with their order details (order number and ship date) for the orders shipped in 1987. */
mysql> select customer.name as customer, ord.ordid as order_number, ord.shipdate as shipping_date from ord join customer on ord.custid=customer.custid 
where year(ord.shipdate)=1987;
+----------------+--------------+---------------+
| customer       | order_number | shipping_date |
+----------------+--------------+---------------+
| TKB SPORT SHOP |          610 | 1987-01-08    |
| VOLLYRITE      |          611 | 1987-01-11    |
| EVERY MOUNTAIN |          612 | 1987-01-20    |
| NORTH WOODS    |          613 | 1987-02-01    |
| VOLLYRITE      |          614 | 1987-02-05    |
| WOMENS SPORTS  |          615 | 1987-02-06    |
| JUST TENNIS    |          616 | 1987-02-10    |
| K + T SPORTS   |          617 | 1987-03-03    |
| VOLLYRITE      |          618 | 1987-03-06    |
| EVERY MOUNTAIN |          619 | 1987-02-04    |
| JOCKSPORTS     |          620 | 1987-03-12    |
| JOCKSPORTS     |          621 | 1987-03-01    |
| K + T SPORTS   |          622 | 1987-01-01    |
| K + T SPORTS   |          624 | 1987-01-06    |
| K + T SPORTS   |          625 | 1987-01-10    |
| WOMENS SPORTS  |          626 | 1987-02-01    |
| JOCKSPORTS     |          627 | 1987-02-14    |
| JOCKSPORTS     |          628 | 1987-03-14    |
| JOCKSPORTS     |          629 | 1987-03-16    |
| EVERY MOUNTAIN |          630 | 1987-02-22    |
| EVERY MOUNTAIN |          631 | 1987-02-23    |
+----------------+--------------+---------------+
21 rows in set (0.00 sec)

/* 5. Display salesman names and names of customers they are dealing with.  */
mysql> select salespeople.sname as salesman, customers.cname as customer from salespeople join customers on salespeople.snum=customers.snum;
+----------+----------+
| salesman | customer |
+----------+----------+
| James    | Saleel   |
| James    | Nitish   |
| Rajan    | Santosh  |
| Alax     | Joe      |
| Natasha  | Raj      |
| Natasha  | Grass    |
| Rajan    | Raja     |
| Monika   | Jackson  |
| James    | William  |
| James    | Smith    |
| James    | ADAMS    |
+----------+----------+
11 rows in set (0.00 sec)

/* 6. Display salesman who did not earn commission, with customer names whom they are dealing with. */
mysql> select emp.ename as salesman, customer.name as customer from emp join customer on emp.empno=customer.repid where emp.job='salesman' and (emp.comm=0 or emp.comm is null);
+----------+--------------+
| salesman | customer     |
+----------+--------------+
| TURNER   | JOCKSPORTS   |
| TURNER   | K + T SPORTS |
| TURNER   | NORTH WOODS  |
+----------+--------------+
3 rows in set (0.04 sec)

/* 7. Display salesman names, salary, commission and their salary grades. */
mysql> select emp.ename as salesman, emp.sal, emp.comm, salgrade.grade from emp join salgrade on emp.sal between salgrade.losal and salgrade.hisal where emp.job='salesman';
+----------+------+------+-------+
| salesman | sal  | comm | grade |
+----------+------+------+-------+
| AARUSH   | 1350 | 2700 |     2 |
| MARTIN   | 1250 | 1400 |     2 |
| WARD     | 1250 |  500 |     2 |
| TURNER   | 1500 |    0 |     3 |
| ALLEN    | 1600 |  300 |     3 |
| GRASS    | 2575 | 2700 |     4 |
+----------+------+------+-------+
6 rows in set (0.01 sec)

/*8. Display all Tennis products and their price details (standard and minimum price). */
mysql> select product.descrip as product, price.stdprice as stanard_price, price.minprice as minimum_price from product join price on product.prodid=price.prodid where product.descrip like '%TENNIS%';
+-------------------------+---------------+---------------+
| product                 | stanard_price | minimum_price |
+-------------------------+---------------+---------------+
| ACE TENNIS RACKET I     |         30.00 |         24.00 |
| ACE TENNIS RACKET I     |         32.00 |         25.60 |
| ACE TENNIS RACKET I     |         35.00 |         28.00 |
| ACE TENNIS RACKET II    |         39.00 |         31.20 |
| ACE TENNIS RACKET II    |         42.00 |         33.60 |
| ACE TENNIS RACKET II    |         45.00 |         36.00 |
| ACE TENNIS BALLS-3 PACK |          2.40 |          1.90 |
| ACE TENNIS BALLS-3 PACK |          2.80 |          2.40 |
| ACE TENNIS BALLS-6 PACK |          4.80 |          3.20 |
| ACE TENNIS BALLS-6 PACK |          5.60 |          4.80 |
| ACE TENNIS NET          |         54.00 |         40.50 |
| ACE TENNIS NET          |         58.00 |         46.40 |
| SP TENNIS RACKET        |         24.00 |         18.00 |
| RH: "GUIDE TO TENNIS"   |          3.40 |          2.80 |
+-------------------------+---------------+---------------+
14 rows in set (0.01 sec)

/* 9. Display the products purchased by either JOCKSPORTS (customer number 100) or JUST TENNIS (customer number 103) or both of them. */
mysql> select distinct customer.name as customer, product.prodid, product.descrip as product_name from 
customer join ord on customer.custid=ord.custid join item on ord.ordid=item.ordid join product on item.prodid=product.prodid where ord.custid in(100, 103);
+-------------+--------+-------------------------+
| customer    | prodid | product_name            |
+-------------+--------+-------------------------+
| JOCKSPORTS  | 102130 | RH: "GUIDE TO TENNIS"   |
| JOCKSPORTS  | 100861 | ACE TENNIS RACKET II    |
| JOCKSPORTS  | 100870 | ACE TENNIS BALLS-3 PACK |
| JOCKSPORTS  | 100890 | ACE TENNIS NET          |
| JOCKSPORTS  | 100860 | ACE TENNIS RACKET I     |
| JOCKSPORTS  | 200376 | SB ENERGY BAR-6 PACK    |
| JUST TENNIS | 100861 | ACE TENNIS RACKET II    |
| JUST TENNIS | 100870 | ACE TENNIS BALLS-3 PACK |
| JUST TENNIS | 100890 | ACE TENNIS NET          |
| JUST TENNIS | 102130 | RH: "GUIDE TO TENNIS"   |
| JUST TENNIS | 200376 | SB ENERGY BAR-6 PACK    |
+-------------+--------+-------------------------+
11 rows in set (0.00 sec)

/* 10.Display the department name, and salary of any employee whose salary and commission matches both the salary and commission of any employee in DALLAS. */


/* 11. List out the common jobs in Research and Accounting Departments in ascending order. */ 
