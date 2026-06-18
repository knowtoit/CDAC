/* Assignment 4 */



/* 1. Count total no. of employees. */
mysql> select count(*) No_Of_Employees from emp;
+-----------------+
| No_Of_Employees |
+-----------------+
|              30 |
+-----------------+
1 row in set (0.05 sec)


/* 2. Determine the maximum and minimum salary. */
mysql> select max(sal) from emp;
+----------+
| max(sal) |
+----------+
|     5000 |
+----------+
1 row in set (0.00 sec)

mysql> select min(sal) from emp;
+----------+
| min(sal) |
+----------+
|      800 |
+----------+
1 row in set (0.00 sec)


/* 3. Display the count of employees having salary greater than 3000. */

mysql> select count(*) emp_count from emp where sal>3000;
+-----------+
| emp_count |
+-----------+
|         4 |
+-----------+
1 row in set (0.00 sec)


/* 4. Print department wise count of employees. */

mysql> select deptno, count(*) emp_count from emp group by deptno;
+--------+-----------+
| deptno | emp_count |
+--------+-----------+
|     10 |         5 |
|     20 |         8 |
|     30 |        12 |
|     50 |         3 |
|     60 |         2 |
+--------+-----------+
5 rows in set (0.03 sec)


/*  5. Display employee details who earn maximum and minimum salary.  */

mysql> select * from emp where sal=(select max(sal) from emp) or sal=(select min(sal) from emp);
+-------+-------+--------+----------------+------+------------+------+------+--------+---------+------------+-----------+------------+----------+
| EMPNO | ENAME | GENDER | JOB            | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME  | PWD       | PHONE      | isActive |
+-------+-------+--------+----------------+------+------------+------+------+--------+---------+------------+-----------+------------+----------+
|  7369 | SMITH | M      | CLERK          | 7902 | 1980-12-17 |  800 | NULL |     20 |       2 | TRITONE    | a12recmpm | 7032300023 |        0 |
|  7839 | KING  | M      | PRESIDENT      | NULL | 1981-11-17 | 5000 | NULL |     10 |       1 | KING       | r50mpm    | 7132300081 |        1 |
|  7840 | FRED  | M      | vice PRESIDENT | 7839 | 1983-08-09 | 5000 | NULL |     20 |       1 | SAND STONE | a12recmpm | NULL       |        1 |
+-------+-------+--------+----------------+------+------------+------+------+--------+---------+------------+-----------+------------+----------+
3 rows in set (0.00 sec)



/*  6. Print jobwise total salary.  */

mysql> select job, sum(sal) total_sal from emp group by job;
+---------------------+-----------+
| job                 | total_sal |
+---------------------+-----------+
| Compliance officers |      5250 |
| Public Relation     |      3500 |
| CLERK               |     11000 |
| SALESMAN            |      9525 |
| MANAGER             |     13675 |
| ANALYST             |      7750 |
| PRESIDENT           |      5000 |
| vice PRESIDENT      |      6000 |
| Network             |      2000 |
+---------------------+-----------+
9 rows in set (0.04 sec)



/*  7. Print department wise maximum salary.  */

mysql> select deptno, max(sal) Maximum_salary from emp group by deptno;
+--------+----------------+
| deptno | Maximum_salary |
+--------+----------------+
|     10 |           5000 |
|     20 |           5000 |
|     30 |           4150 |
|     50 |           1750 |
|     60 |           2000 |
+--------+----------------+
5 rows in set (0.00 sec)


/*  8. Print jobwise average salary.  */

mysql> select job, avg(sal) Average_salary from emp group by job;
+---------------------+----------------+
| job                 | Average_salary |
+---------------------+----------------+
| Compliance officers |      1750.0000 |
| Public Relation     |      1750.0000 |
| CLERK               |      1571.4286 |
| SALESMAN            |      1587.5000 |
| MANAGER             |      2735.0000 |
| ANALYST             |      2583.3333 |
| PRESIDENT           |      5000.0000 |
| vice PRESIDENT      |      3000.0000 |
| Network             |      2000.0000 |
+---------------------+----------------+
9 rows in set (0.03 sec)

mysql> select job, round(avg(sal),2) Average_salary from emp group by job;
+---------------------+----------------+
| job                 | Average_salary |
+---------------------+----------------+
| Compliance officers |        1750.00 |
| Public Relation     |        1750.00 |
| CLERK               |        1571.43 |
| SALESMAN            |        1587.50 |
| MANAGER             |        2735.00 |
| ANALYST             |        2583.33 |
| PRESIDENT           |        5000.00 |
| vice PRESIDENT      |        3000.00 |
| Network             |        2000.00 |
+---------------------+----------------+
9 rows in set (0.03 sec)


/*  9. Print count of employee working in department 20.  */

mysql> select deptno, count(*) emp_count from emp where deptno=20;
+--------+-----------+
| deptno | emp_count |
+--------+-----------+
|     20 |         8 |
+--------+-----------+
1 row in set (0.00 sec)

/*  10. Print count of employee working in department 10 having job as MANAGER.. */

mysql> select deptno,job, count(*) emp_count from emp where deptno=10 and job='manager';
+--------+---------+-----------+
| deptno | job     | emp_count |
+--------+---------+-----------+
|     10 | MANAGER |         1 |
+--------+---------+-----------+
1 row in set (0.00 sec)

/* 11. Print count of employee working in department 20 having comm as null. */

mysql> select comm, count(*) emp_count from emp where deptno=20 and comm is null group by comm;
+------+-----------+
| comm | emp_count |
+------+-----------+
| NULL |         8 |
+------+-----------+
1 row in set (0.00 sec)


/* 12. Print names of employees working in ACCOUNTS department having maximum salary. */

mysql> select emp.ename from emp join dept on emp.deptno = dept.deptno where dept.dname='accounting' and emp.sal=(select max(sal) from emp where deptno=10);
+-------+
| ename |
+-------+
| KING  |
+-------+
1 row in set (0.00 sec)


/* 13. Print employee details having salary less than average salary of MANAGER. */

mysql> select * from emp where sal <(select avg(sal) from emp where job='manager');
+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+
| EMPNO | ENAME    | GENDER | JOB                 | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME    | PWD        | PHONE      | isActive |
+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+
|  6001 | GITA     | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | GITA         | sales@2017 | NULL       |        1 |
|  6129 | VRUSHALI | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | VRUSHALI     | PUN@8877   | NULL       |        1 |
|  6473 | SHARMIN  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | SHARMIN      | a12recmpm  | NULL       |        1 |
|  6781 | BANDISH  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | BANDISH      | a12recmpm  | NULL       |        1 |
|  7369 | SMITH    | M      | CLERK               | 7902 | 1980-12-17 |  800 | NULL |     20 |       2 | TRITONE      | a12recmpm  | 7032300023 |        0 |
|  7421 | THOMAS   | M      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     10 |       1 | THOMAS       | r50mpm     | 7032300011 |        0 |
|  7499 | ALLEN    | M      | SALESMAN            | 7698 | 1981-02-20 | 1600 |  300 |     30 |       4 | ALWAYS TESTE | sales@2017 | 7032300096 |        1 |
|  7521 | WARD     | M      | SALESMAN            | 7698 | 1981-02-22 | 1250 |  500 |     30 |       1 | WARD         | sales@2017 | 7132300034 |        1 |
|  7654 | MARTIN   | M      | SALESMAN            | 7698 | 1981-09-28 | 1250 | 1400 |     30 |       6 | LIFE RACER   | sales@2017 | 7132300050 |        1 |
|  7782 | CLARK    | M      | MANAGER             | 7839 | 1981-06-09 | 2450 | NULL |     10 |       3 | CLARK        | r50mpm     | 7032300001 |        1 |
|  7844 | TURNER   | M      | SALESMAN            | 7698 | 1981-09-08 | 1500 |    0 |     30 |       5 | SAND DUST    | sales@2017 | NULL       |        1 |
|  7876 | ADAMS    | M      | CLERK               | 7788 | 1983-01-12 | 1100 | NULL |     20 |       1 | CRAZY ANYONE | a12recmpm  | 7132300086 |        1 |
|  7888 | Ruhan    | M      | Network             | 7888 | 1983-08-09 | 2000 | NULL |     60 |       1 | Ruhan        | BRD@1122   | NULL       |        1 |
|  7889 | Neel     | M      | vice PRESIDENT      | 7839 | 1983-08-09 | 1000 | NULL |     60 |       0 | Neel         | BRD@1122   | NULL       |        1 |
|  7900 | JAMES    | M      | CLERK               | 7698 | 1981-12-03 |  950 | NULL |     30 |       2 | CRAZY LEADER | sales@2017 | 7132300042 |        1 |
|  7920 | GRASS    | M      | SALESMAN            | 7919 | 1980-02-14 | 2575 | 2700 |     30 |       5 | GRASS        | sales@2017 | NULL       |        1 |
|  7934 | MILLER   | M      | CLERK               | 7782 | 1982-01-23 | 1300 | 1300 |     10 |       2 | QUARTERNOTE  | r50mpm     | 7132300055 |        0 |
|  7945 | AARUSH   | M      | SALESMAN            | 7902 | 1980-02-14 | 1350 | 2700 |     30 |    NULL | AARUSH       | ABCDEF     | NULL       |        0 |
|  7949 | ALEX     | M      | MANAGER             | 7698 | 1982-01-24 | 1250 |  500 |     30 |       5 | QUARTERREST  | sales@2017 | 7156567183 |        1 |
|  8433 | NATASHA  | F      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | NATASHA      | sales@2017 | NULL       |        1 |
|  9400 | SANGITA  | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SANGITA      | NULL       | NULL       |        1 |
|  9473 | SUPRIYA  | F      | ANALYST             | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SUPRIYA      | XYZ@1234   | NULL       |        1 |
+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+
22 rows in set (0.00 sec)


/*  14. Give SQL statement to find the average annual salary per job in each detp. */

mysql> select deptno, job, round(avg(sal * 12)) as avg_salary from emp group by deptno, job;
+--------+---------------------+------------+
| deptno | job                 | avg_salary |
+--------+---------------------+------------+
|     30 | Compliance officers |      21000 |
|     50 | Compliance officers |      21000 |
|     20 | Public Relation     |      21000 |
|     20 | CLERK               |      11400 |
|     10 | CLERK               |      25600 |
|     30 | SALESMAN            |      19050 |
|     20 | MANAGER             |      35700 |
|     30 | MANAGER             |      33000 |
|     10 | MANAGER             |      29400 |
|     20 | ANALYST             |      36000 |
|     10 | PRESIDENT           |      60000 |
|     20 | vice PRESIDENT      |      60000 |
|     60 | Network             |      24000 |
|     60 | vice PRESIDENT      |      12000 |
|     30 | CLERK               |      16200 |
|     50 | ANALYST             |      21000 |
+--------+---------------------+------------+
16 rows in set (0.00 sec)


/*  15. Count the number of people in the dept 30 who receive a salary and the no.of people who receive comm.  */

mysql> select deptno, count(sal) emp_receiving_sal, count(comm) emp_receiving_comm from emp where deptno=30;
+--------+-------------------+--------------------+
| deptno | emp_receiving_sal | emp_receiving_comm |
+--------+-------------------+--------------------+
|     30 |                12 |                  7 |
+--------+-------------------+--------------------+
1 row in set (0.00 sec)


/*  16. Calculate the avg, min and max salary of those groups of employees having the job as CLERK or MANAGER. */

mysql> select avg(sal) avg_salary, max(sal) maximum_salary, min(sal) minimum_salary from emp where job in('clerk', 'manager') group by job;
+------------+----------------+----------------+
| avg_salary | maximum_salary | minimum_salary |
+------------+----------------+----------------+
|  1571.4286 |           3350 |            800 |
|  2735.0000 |           4150 |           1250 |
+------------+----------------+----------------+
2 rows in set (0.00 sec)


/*  17. Display the deptno of departments which have more than one CLERK. */

mysql> select deptno, job from emp where job='clerk' group by deptno having count(*) > 1;
+--------+-------+
| deptno | job   |
+--------+-------+
|     10 | CLERK |
|     20 | CLERK |
|     30 | CLERK |
+--------+-------+
3 rows in set (0.00 sec)


/*  18. List names and hiredates of employees who were hired in the month of December  */

mysql> select ename, hiredate from emp where month(hiredate) = 12;
+-------+------------+
| ename | hiredate   |
+-------+------------+
| SMITH | 1980-12-17 |
| AARAV | 1981-12-31 |
| SCOTT | 1982-12-09 |
| JAMES | 1981-12-03 |
| FORD  | 1981-12-03 |
+-------+------------+
5 rows in set (0.02 sec)

mysql> select ename, hiredate from emp where monthname(hiredate)='December';
+-------+------------+
| ename | hiredate   |
+-------+------------+
| SMITH | 1980-12-17 |
| AARAV | 1981-12-31 |
| SCOTT | 1982-12-09 |
| JAMES | 1981-12-03 |
| FORD  | 1981-12-03 |
+-------+------------+
5 rows in set (0.04 sec)


/*  19. List names and hiredate of employees hired in the year 1980  */
mysql> select ename, hiredate from emp where year(hiredate)=1980;
+--------+------------+
| ename  | hiredate   |
+--------+------------+
| SMITH  | 1980-12-17 |
| GRASS  | 1980-02-14 |
| AARUSH | 1980-02-14 |
+--------+------------+
3 rows in set (0.00 sec)

/* 20. Display names and jobs of the people separated by a hyphen. Capitalize the first character of name and job. */

mysql> select concat(upper(substring(ename,1,1)), lower(substring(ename,2)), '-',upper(substring(job,1,1)),lower(substring(job,2))) employee_job from emp;
+------------------------------+
| employee_job                 |
+------------------------------+
| Gita-Compliance officers     |
| Vrushali-Compliance officers |
| Sharmin-Public relation      |
| Bandish-Public relation      |
| Smith-Clerk                  |
| Aarav-Clerk                  |
| Thomas-Clerk                 |
| Allen-Salesman               |
| Ward-Salesman                |
| Jones-Manager                |
| Martin-Salesman              |
| Blake-Manager                |
| Clark-Manager                |
| Scott-Analyst                |
| King-President               |
| Fred-Vice president          |
| Turner-Salesman              |
| Adams-Clerk                  |
| Ruhan-Network                |
| Neel-Vice president          |
| James-Clerk                  |
| Ford-Analyst                 |
| Hoffman-Manager              |
| Grass-Salesman               |
| Miller-Clerk                 |
| Aarush-Salesman              |
| Alex-Manager                 |
| Natasha-Clerk                |
| Sangita-Compliance officers  |
| Supriya-Analyst              |
+------------------------------+
30 rows in set (0.04 sec)




/* 21. List employee numbers, names and hiredates of the people working in the department number 20, display the hiredates in the dd/mm/yy format */

mysql> select deptno,empno, ename, date_format(hiredate, '%d/%m/%y') as hiredate from emp where deptno=10;
+--------+-------+--------+----------+
| deptno | empno | ename  | hiredate |
+--------+-------+--------+----------+
|     10 |  7415 | AARAV  | 31/12/81 |
|     10 |  7421 | THOMAS | 19/07/81 |
|     10 |  7782 | CLARK  | 09/06/81 |
|     10 |  7839 | KING   | 17/11/81 |
|     10 |  7934 | MILLER | 23/01/82 |
+--------+-------+--------+----------+
5 rows in set (0.00 sec)

/* 22. Find number of months the president has worked for the company.*/

mysql> select ename, timestampdiff(month, hiredate, curdate()) as months_worked from emp where job='president';
+-------+---------------+
| ename | months_worked |
+-------+---------------+
| KING  |           533 |
+-------+---------------+
1 row in set (0.03 sec)


/* 23. Find the day of the week on which SMITH joined */

mysql> select ename, dayname(hiredate) as joining_day from emp where ename='smith';
+-------+-------------+
| ename | joining_day |
+-------+-------------+
| SMITH | Wednesday   |
+-------+-------------+
1 row in set (0.03 sec)

/* 24. Find the time of time of the day in which ADAMS joined */

mysql> select ename, time(hiredate) as joining_time from emp where ename='adams';
+-------+--------------+
| ename | joining_time |
+-------+--------------+
| ADAMS | 00:00:00     |
+-------+--------------+
1 row in set (0.00 sec)

/*  25. Find day of month on which KING joined */

mysql> select ename, dayofmonth(hiredate) as joining_day from emp where ename='king';
+-------+-------------+
| ename | joining_day |
+-------+-------------+
| KING  |          17 |
+-------+-------------+
1 row in set (0.00 sec)

/* 26. Find out month on which MARTIN joined */

mysql> select ename, month(hiredate) as joining_month from emp where ename='martin';
+--------+---------------+
| ename  | joining_month |
+--------+---------------+
| MARTIN |             9 |
+--------+---------------+
1 row in set (0.00 sec)


mysql> select ename, monthname(hiredate) as joining_month from emp where ename='martin';
+--------+---------------+
| ename  | joining_month |
+--------+---------------+
| MARTIN | September     |
+--------+---------------+
1 row in set (0.00 sec)

/* 27. Find out which quarter of the year the employees joined. Display their number and names as well */

mysql> select empno, ename, quarter(hiredate) as joining_quarter from emp;
+-------+----------+-----------------+
| empno | ename    | joining_quarter |
+-------+----------+-----------------+
|  6001 | GITA     |               3 |
|  6129 | VRUSHALI |               3 |
|  6473 | SHARMIN  |               3 |
|  6781 | BANDISH  |               3 |
|  7369 | SMITH    |               4 |
|  7415 | AARAV    |               4 |
|  7421 | THOMAS   |               3 |
|  7499 | ALLEN    |               1 |
|  7521 | WARD     |               1 |
|  7566 | JONES    |               2 |
|  7654 | MARTIN   |               3 |
|  7698 | BLAKE    |               2 |
|  7782 | CLARK    |               2 |
|  7788 | SCOTT    |               4 |
|  7839 | KING     |               4 |
|  7840 | FRED     |               3 |
|  7844 | TURNER   |               3 |
|  7876 | ADAMS    |               1 |
|  7888 | Ruhan    |               3 |
|  7889 | Neel     |               3 |
|  7900 | JAMES    |               4 |
|  7902 | FORD     |               4 |
|  7919 | HOFFMAN  |               1 |
|  7920 | GRASS    |               1 |
|  7934 | MILLER   |               1 |
|  7945 | AARUSH   |               1 |
|  7949 | ALEX     |               1 |
|  8433 | NATASHA  |               3 |
|  9400 | SANGITA  |               3 |
|  9473 | SUPRIYA  |               3 |
+-------+----------+-----------------+
30 rows in set (0.00 sec)


/*  28. Retrieve ANALYST records with the hiredate formatted as – ‘The 3rd of December 1984’ */

mysql> select empno, ename, job, date_format(hiredate, 'The %D of %M %Y') as formatted_hiredate from emp where job='analyst';
+-------+---------+---------+--------------------------+
| empno | ename   | job     | formatted_hiredate       |
+-------+---------+---------+--------------------------+
|  7788 | SCOTT   | ANALYST | The 9th of December 1982 |
|  7902 | FORD    | ANALYST | The 3rd of December 1981 |
|  9473 | SUPRIYA | ANALYST | The 19th of July 1981    |
+-------+---------+---------+--------------------------+
3 rows in set (0.00 sec)

/* 29. List all names, jobs, and a job classification number, which is to be assigned by you.
Translate the value started in each job field to a job classification number. This is to be

done as follows-
A. CLERK

B. MANAGER
C. PRESIDENT
D. OTHER */


mysql> select ename, job, case when job='clerk' then 1 when job='manager' then 2 when job='president' then 3 else 4 end as job_classification from emp;
+----------+---------------------+--------------------+
| ename    | job                 | job_classification |
+----------+---------------------+--------------------+
| GITA     | Compliance officers |                  4 |
| VRUSHALI | Compliance officers |                  4 |
| SHARMIN  | Public Relation     |                  4 |
| BANDISH  | Public Relation     |                  4 |
| SMITH    | CLERK               |                  1 |
| AARAV    | CLERK               |                  1 |
| THOMAS   | CLERK               |                  1 |
| ALLEN    | SALESMAN            |                  4 |
| WARD     | SALESMAN            |                  4 |
| JONES    | MANAGER             |                  2 |
| MARTIN   | SALESMAN            |                  4 |
| BLAKE    | MANAGER             |                  2 |
| CLARK    | MANAGER             |                  2 |
| SCOTT    | ANALYST             |                  4 |
| KING     | PRESIDENT           |                  3 |
| FRED     | vice PRESIDENT      |                  4 |
| TURNER   | SALESMAN            |                  4 |
| ADAMS    | CLERK               |                  1 |
| Ruhan    | Network             |                  4 |
| Neel     | vice PRESIDENT      |                  4 |
| JAMES    | CLERK               |                  1 |
| FORD     | ANALYST             |                  4 |
| HOFFMAN  | MANAGER             |                  2 |
| GRASS    | SALESMAN            |                  4 |
| MILLER   | CLERK               |                  1 |
| AARUSH   | SALESMAN            |                  4 |
| ALEX     | MANAGER             |                  2 |
| NATASHA  | CLERK               |                  1 |
| SANGITA  | Compliance officers |                  4 |
| SUPRIYA  | ANALYST             |                  4 |
+----------+---------------------+--------------------+
30 rows in set (0.00 sec)


/* 30. Display the length of the longest employees name / */

mysql> select max(length(ename)) as longest_name from emp;
+--------------+
| longest_name |
+--------------+
|            8 |
+--------------+
1 row in set (0.00 sec)

mysql> select ename, length(ename) as name_length from emp where length(ename)=(select max(length(ename))from emp);
+----------+-------------+
| ename    | name_length |
+----------+-------------+
| VRUSHALI |           8 |
+----------+-------------+
1 row in set (0.03 sec)



/*  31. Write a query to list the length of service of the employees (of the form n years and m months). */

mysql> select ename, concat(floor(timestampdiff(month, hiredate, curdate())/12),' years and ', mod(timestampdiff(month, hiredate, curdate()),12),' months') as length_of_service from emp;
+----------+------------------------+
| ename    | length_of_service      |
+----------+------------------------+
| GITA     | 44 years and 9 months  |
| VRUSHALI | 44 years and 9 months  |
| SHARMIN  | 44 years and 9 months  |
| BANDISH  | 44 years and 9 months  |
| SMITH    | 45 years and 4 months  |
| AARAV    | 44 years and 4 months  |
| THOMAS   | 44 years and 9 months  |
| ALLEN    | 45 years and 2 months  |
| WARD     | 45 years and 2 months  |
| JONES    | 45 years and 1 months  |
| MARTIN   | 44 years and 7 months  |
| BLAKE    | 45 years and 0 months  |
| CLARK    | 44 years and 10 months |
| SCOTT    | 43 years and 4 months  |
| KING     | 44 years and 5 months  |
| FRED     | 42 years and 8 months  |
| TURNER   | 44 years and 7 months  |
| ADAMS    | 43 years and 3 months  |
| Ruhan    | 42 years and 8 months  |
| Neel     | 42 years and 8 months  |
| JAMES    | 44 years and 5 months  |
| FORD     | 44 years and 5 months  |
| HOFFMAN  | 44 years and 1 months  |
| GRASS    | 46 years and 2 months  |
| MILLER   | 44 years and 3 months  |
| AARUSH   | 46 years and 2 months  |
| ALEX     | 44 years and 3 months  |
| NATASHA  | 44 years and 9 months  |
| SANGITA  | 44 years and 9 months  |
| SUPRIYA  | 44 years and 9 months  |
+----------+------------------------+
30 rows in set (0.00 sec)

/* 32. How many employees who are joined in 1985. */

mysql> select count(*) No_of_employees from emp where year(hiredate)=1985;
+-----------------+
| No_of_employees |
+-----------------+
|               0 |
+-----------------+
1 row in set (0.00 sec)

mysql> select count(*) employee from emp1 where year(hiredate)=1985;
+----------+
| employee |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)

/*33. How many employees joined each month in 1985. */
mysql> select monthname(hiredate) as joining_month, count(*) as employee_count from emp1 where year(hiredate)=1985 group by month(hiredate), monthname(hiredate) order by month(hiredate);
+---------------+----------------+
| joining_month | employee_count |
+---------------+----------------+
| January       |              2 |
+---------------+----------------+
1 row in set (0.04 sec)


/* 34. How many employees who are joined in March 1985. */
mysql> select count(*) as employee_count from emp1 where year(hiredate)=1985 and month(hiredate)=3;
+----------------+
| employee_count |
+----------------+
|              0 |
+----------------+
1 row in set (0.01 sec)


/* 35. Find the total sales amount */
mysql> select sum(amount) Total_amount from sales;
+--------------+
| Total_amount |
+--------------+
|     95263.00 |
+--------------+
1 row in set (0.00 sec)

/* 36. Find the customer-wise lowest and highest sales amount */
mysql> select custid, max(amount) maximum_amount, min(amount) minimum_amount from sales group by custid;
+--------+----------------+----------------+
| custid | maximum_amount | minimum_amount |
+--------+----------------+----------------+
|    100 |        2400.00 |          50.00 |
|    101 |          58.00 |           8.40 |
|    102 |       16569.00 |        2300.50 |
|    103 |         450.00 |          24.00 |
|    104 |        3000.00 |          24.00 |
|    105 |       29000.00 |         340.00 |
|    106 |         440.00 |           2.40 |
|    107 |         280.00 |         180.00 |
|    108 |        4800.00 |         440.00 |
+--------+----------------+----------------+
9 rows in set (0.01 sec)

/*  37. Find product-wise lowest, highest and total sales. */
mysql> select prodid, min(amount) lowest_sales, max(amount) highest_sales, sum(amount) total_sales from sales group by prodid;
+--------+--------------+---------------+-------------+
| prodid | lowest_sales | highest_sales | total_sales |
+--------+--------------+---------------+-------------+
| 102130 |        34.00 |       1703.40 |     2417.40 |
| 100861 |        84.00 |       4500.00 |     8809.50 |
| 100870 |         8.40 |       3306.00 |     5426.90 |
| 100890 |        50.00 |      29000.00 |    29398.00 |
| 100860 |        35.00 |      16569.00 |    22144.00 |
| 200376 |         2.40 |       2400.00 |     3586.40 |
| 100871 |       250.00 |       5600.00 |    10056.80 |
| 101860 |        24.00 |       4800.00 |     7224.00 |
| 101863 |      1500.00 |       2500.00 |     4000.00 |
| 200380 |       400.00 |       1200.00 |     2200.00 |
+--------+--------------+---------------+-------------+
10 rows in set (0.00 sec)

/*38. Find department-wise average salary for all the departments employing more than three employees */
mysql> select deptno, avg(sal) average_salary from emp group by deptno having count(*)>3;
+--------+----------------+
| deptno | average_salary |
+--------+----------------+
|     10 |      2770.0000 |
|     20 |      2421.8750 |
|     30 |      1852.0833 |
+--------+----------------+
3 rows in set (0.00 sec)

/*39. Find the customer-wise total sales for all the customers except ‘TKB SPORT SHOP’ who came to purchase various sports items maximum four times. */

mysql> select custname, sum(amount) total_sales from sales where custname<> 'TKB SPORT SHOP' group by custname having count(*) <= 4;
+---------------+-------------+
| custname      | total_sales |
+---------------+-------------+
| VOLLYRITE     |    27775.50 |
| SHAPE UP      |      700.40 |
| WOMENS SPORTS |      710.00 |
| NORTH WOODS   |     6400.00 |
+---------------+-------------+
4 rows in set (0.00 sec)

/*40. Display the highest, lowest, sum and average salary for all employees. Label the columns appropriately. */

mysql> select max(sal) highest_salary, min(sal) lowest_salary, sum(sal) total_salary, avg(sal) avaerage_salary from emp;
+----------------+---------------+--------------+-----------------+
| highest_salary | lowest_salary | total_salary | avaerage_salary |
+----------------+---------------+--------------+-----------------+
|           5000 |           800 |        63700 |       2123.3333 |
+----------------+---------------+--------------+-----------------+
1 row in set (0.00 sec)


/* 41. Modify the above query and display the output for each job type. */

mysql> select job, max(sal) highest_salary, min(sal) lowest_salary, sum(sal) total_salary, avg(sal) avaerage_salary from emp group by job;
+---------------------+----------------+---------------+--------------+-----------------+
| job                 | highest_salary | lowest_salary | total_salary | avaerage_salary |
+---------------------+----------------+---------------+--------------+-----------------+
| Compliance officers |           1750 |          1750 |         5250 |       1750.0000 |
| Public Relation     |           1750 |          1750 |         3500 |       1750.0000 |
| CLERK               |           3350 |           800 |        11000 |       1571.4286 |
| SALESMAN            |           2575 |          1250 |         9525 |       1587.5000 |
| MANAGER             |           4150 |          1250 |        13675 |       2735.0000 |
| ANALYST             |           3000 |          1750 |         7750 |       2583.3333 |
| PRESIDENT           |           5000 |          5000 |         5000 |       5000.0000 |
| vice PRESIDENT      |           5000 |          1000 |         6000 |       3000.0000 |
| Network             |           2000 |          2000 |         2000 |       2000.0000 |
+---------------------+----------------+---------------+--------------+-----------------+
9 rows in set (0.00 sec)


/*42. List names of people who have salary less than the average salary for dept 20 */
mysql> select ename from emp where deptno=20 and sal<(select avg(sal) from emp where deptno=20);
+---------+
| ename   |
+---------+
| SHARMIN |
| BANDISH |
| SMITH   |
| ADAMS   |
+---------+
4 rows in set (0.00 sec)

/*43. Find the average annual salary per job in each department. */
mysql> select deptno, job, round(avg(sal*12)) as average_salary from emp group by deptno, job;
+--------+---------------------+----------------+
| deptno | job                 | average_salary |
+--------+---------------------+----------------+
|     30 | Compliance officers |          21000 |
|     50 | Compliance officers |          21000 |
|     20 | Public Relation     |          21000 |
|     20 | CLERK               |          11400 |
|     10 | CLERK               |          25600 |
|     30 | SALESMAN            |          19050 |
|     20 | MANAGER             |          35700 |
|     30 | MANAGER             |          33000 |
|     10 | MANAGER             |          29400 |
|     20 | ANALYST             |          36000 |
|     10 | PRESIDENT           |          60000 |
|     20 | vice PRESIDENT      |          60000 |
|     60 | Network             |          24000 |
|     60 | vice PRESIDENT      |          12000 |
|     30 | CLERK               |          16200 |
|     50 | ANALYST             |          21000 |
+--------+---------------------+----------------+
16 rows in set (0.00 sec)

/*  44. Count the number of people in department 30 who receive a salary and the number of people who receive a commission */
mysql> select count(sal) as emp_receiving_salary, count(comm) as emp_receiving_comm from emp where deptno=30;
+----------------------+--------------------+
| emp_receiving_salary | emp_receiving_comm |
+----------------------+--------------------+
|                   12 |                  7 |
+----------------------+--------------------+
1 row in set (0.00 sec)

/* 45. Compute the average, minimum and maximum salaries of these groups of employees having job as Clerk or manager, Display the job as well */
mysql> select job, avg(sal) average_salary, min(sal) minimum_salary , max(sal) maximum_salary from emp where job in('clerk', 'manager') group by job;
+---------+----------------+----------------+----------------+
| job     | average_salary | minimum_salary | maximum_salary |
+---------+----------------+----------------+----------------+
| CLERK   |      1571.4286 |            800 |           3350 |
| MANAGER |      2735.0000 |           1250 |           4150 |
+---------+----------------+----------------+----------------+
2 rows in set (0.00 sec)

/* 46. Write an SQL command that displays 2nd highest salary paid */
mysql> select distinct sal as second_highest_paid from emp order by sal desc limit 1 offset 1;
+---------------------+
| second_highest_paid |
+---------------------+
|                4150 |
+---------------------+
1 row in set (0.00 sec)

mysql>

/*47. Write a query to find the employees who are earning the maximum salary in their departments. */
mysql> select ename, deptno, sal from emp e where sal=(select max(sal) from emp where deptno=e.deptno);
+----------+--------+------+
| ename    | deptno | sal  |
+----------+--------+------+
| VRUSHALI |     50 | 1750 |
| KING     |     10 | 5000 |
| FRED     |     20 | 5000 |
| Ruhan    |     60 | 2000 |
| HOFFMAN  |     30 | 4150 |
| SANGITA  |     50 | 1750 |
| SUPRIYA  |     50 | 1750 |
+----------+--------+------+
7 rows in set (0.00 sec)

/*48. Write a query to find the salesman number (repid) who has achieved the maximum total sales among the entire salesman. */
mysql> select repid, sum(amount) as total_sales from sales group by repid order by total_sales desc limit 1;
+-------+-------------+
| repid | total_sales |
+-------+-------------+
|  7844 |    58050.90 |
+-------+-------------+
1 row in set (0.01 sec)


/* 49. List the highest salary paid for each job. */
mysql> select job, max(sal) highest_sal from emp group by job;
+---------------------+-------------+
| job                 | highest_sal |
+---------------------+-------------+
| Compliance officers |        1750 |
| Public Relation     |        1750 |
| CLERK               |        3350 |
| SALESMAN            |        2575 |
| MANAGER             |        4150 |
| ANALYST             |        3000 |
| PRESIDENT           |        5000 |
| vice PRESIDENT      |        5000 |
| Network             |        2000 |
+---------------------+-------------+
9 rows in set (0.00 sec)

/*50. Find the most recently hired employee in each department. */
mysql> select ename, deptno, hiredate from emp e where hiredate=(select max(hiredate) from emp where deptno = e.deptno);
+----------+--------+------------+
| ename    | deptno | hiredate   |
+----------+--------+------------+
| VRUSHALI |     50 | 1981-07-19 |
| FRED     |     20 | 1983-08-09 |
| Ruhan    |     60 | 1983-08-09 |
| Neel     |     60 | 1983-08-09 |
| HOFFMAN  |     30 | 1982-03-24 |
| MILLER   |     10 | 1982-01-23 |
| SANGITA  |     50 | 1981-07-19 |
| SUPRIYA  |     50 | 1981-07-19 |
+----------+--------+------------+
8 rows in set (0.01 sec)





/* 51. In which year did most people join the company? Display the year and the number of employees. */
mysql> select year(hiredate) as joining_year, count(*) as employee_count from emp group by year(hiredate) order by employee_count desc limit 1;
+--------------+----------------+
| joining_year | employee_count |
+--------------+----------------+
|         1981 |             19 |
+--------------+----------------+
1 row in set (0.01 sec)

/* 52. Write a query to display employee name whose name occurs only once in the table. */
mysql> select ename from emp group by ename having count(*) =1;
+----------+
| ename    |
+----------+
| GITA     |
| VRUSHALI |
| SHARMIN  |
| BANDISH  |
| SMITH    |
| AARAV    |
| THOMAS   |
| ALLEN    |
| WARD     |
| JONES    |
| MARTIN   |
| BLAKE    |
| CLARK    |
| SCOTT    |
| KING     |
| FRED     |
| TURNER   |
| ADAMS    |
| Ruhan    |
| Neel     |
| JAMES    |
| FORD     |
| HOFFMAN  |
| GRASS    |
| MILLER   |
| AARUSH   |
| ALEX     |
| NATASHA  |
| SANGITA  |
| SUPRIYA  |
+----------+
30 rows in set (0.00 sec)

/*53. Write a query to display all the details from dept table along with the no. of employee working in each dept. */
mysql> select dept.*, count(emp.empno) as eployee_count from dept left join emp on dept.deptno=emp.deptno group by dept.deptno, dept.dname, dept.startedon;
+--------+------------+----------+------------+------------+---------------+
| DEPTNO | DNAME      | LOC      | PWD        | STARTEDON  | eployee_count |
+--------+------------+----------+------------+------------+---------------+
|     10 | ACCOUNTING | NEW YORK | r50mpm     | 24/03/1989 |             5 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |             8 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |            12 |
|     40 | OPERATIONS | BOSTON   | opr@123    | 12/07/1989 |             0 |
|     50 | HR         | PUNE     | PUN@8877   | 22/12/1989 |             3 |
|     60 | IT         | BARODA   | BRD@1122   | 02/10/1989 |             2 |
+--------+------------+----------+------------+------------+---------------+
6 rows in set (0.02 sec)

/*54. Find out which department does not have any employees. */

mysql> select dept.* from dept left join emp on dept.deptno=emp.deptno where emp.empno is null;
+--------+------------+--------+---------+------------+
| DEPTNO | DNAME      | LOC    | PWD     | STARTEDON  |
+--------+------------+--------+---------+------------+
|     40 | OPERATIONS | BOSTON | opr@123 | 12/07/1989 |
+--------+------------+--------+---------+------------+
1 row in set (0.00 sec)

/* 55. List out the no. of employees joined in every month in ascending order.*/
mysql> select monthname(hiredate) joining_month, count(*) employee_count from emp group by month(hiredate), monthname(hiredate) order by month(hiredate) asc;
+---------------+----------------+
| joining_month | employee_count |
+---------------+----------------+
| January       |              3 |
| February      |              4 |
| March         |              1 |
| April         |              1 |
| May           |              1 |
| June          |              1 |
| July          |              8 |
| August        |              3 |
| September     |              2 |
| November      |              1 |
| December      |              5 |
+---------------+----------------+
11 rows in set (0.00 sec)