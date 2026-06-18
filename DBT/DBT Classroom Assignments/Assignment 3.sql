/* Assignment 3 */

/* 1. List names of employees whose job is MANAGER */

mysql> select ename, job from emp where job='Manager';
+---------+---------+
| ename   | job     |
+---------+---------+
| JONES   | MANAGER |
| BLAKE   | MANAGER |
| CLARK   | MANAGER |
| HOFFMAN | MANAGER |
| ALEX    | MANAGER |
+---------+---------+
5 rows in set (0.00 sec)



/* 2. List names of employee having salary greater than equal to 3000. */

mysql> select ename, job, sal from emp where sal>=3000;
+---------+----------------+------+
| ename   | job            | sal  |
+---------+----------------+------+
| AARAV   | CLERK          | 3350 |
| SCOTT   | ANALYST        | 3000 |
| KING    | PRESIDENT      | 5000 |
| FRED    | vice PRESIDENT | 5000 |
| FORD    | ANALYST        | 3000 |
| HOFFMAN | MANAGER        | 4150 |
+---------+----------------+------+
6 rows in set (0.00 sec)



/* 3. List all employees having ‘A’ as second letter in their names.  */ 

mysql> select ename from emp where ename like '_A%';
+---------+
| ename   |
+---------+
| BANDISH |
| AARAV   |
| WARD    |
| MARTIN  |
| JAMES   |
| AARUSH  |
| NATASHA |
| SANGITA |
+---------+
8 rows in set (0.04 sec)


/*4. List the Employee Number, Name, Hiredate and Job Title of the Employees in the Department 10.  */


mysql> select empno, ename, hiredate, job from emp where deptno=10;
+-------+--------+------------+-----------+
| empno | ename  | hiredate   | job       |
+-------+--------+------------+-----------+
|  7415 | AARAV  | 1981-12-31 | CLERK     |
|  7421 | THOMAS | 1981-07-19 | CLERK     |
|  7782 | CLARK  | 1981-06-09 | MANAGER   |
|  7839 | KING   | 1981-11-17 | PRESIDENT |
|  7934 | MILLER | 1982-01-23 | CLERK     |
+-------+--------+------------+-----------+
5 rows in set (0.00 sec)

mysql> select empno, ename, hiredate, job, deptno from emp where deptno=10;
+-------+--------+------------+-----------+--------+
| empno | ename  | hiredate   | job       | deptno |
+-------+--------+------------+-----------+--------+
|  7415 | AARAV  | 1981-12-31 | CLERK     |     10 |
|  7421 | THOMAS | 1981-07-19 | CLERK     |     10 |
|  7782 | CLARK  | 1981-06-09 | MANAGER   |     10 |
|  7839 | KING   | 1981-11-17 | PRESIDENT |     10 |
|  7934 | MILLER | 1982-01-23 | CLERK     |     10 |
+-------+--------+------------+-----------+--------+
5 rows in set (0.00 sec)



/*5. Display the details of those Employees who earn a monthly Salary of more than 2000.  */

mysql> select empno, ename, hiredate, job, sal from emp where sal>=2000;
+-------+---------+------------+----------------+------+
| empno | ename   | hiredate   | job            | sal  |
+-------+---------+------------+----------------+------+
|  7415 | AARAV   | 1981-12-31 | CLERK          | 3350 |
|  7566 | JONES   | 1981-04-02 | MANAGER        | 2975 |
|  7698 | BLAKE   | 1981-05-01 | MANAGER        | 2850 |
|  7782 | CLARK   | 1981-06-09 | MANAGER        | 2450 |
|  7788 | SCOTT   | 1982-12-09 | ANALYST        | 3000 |
|  7839 | KING    | 1981-11-17 | PRESIDENT      | 5000 |
|  7840 | FRED    | 1983-08-09 | vice PRESIDENT | 5000 |
|  7888 | Ruhan   | 1983-08-09 | Network        | 2000 |
|  7902 | FORD    | 1981-12-03 | ANALYST        | 3000 |
|  7919 | HOFFMAN | 1982-03-24 | MANAGER        | 4150 |
|  7920 | GRASS   | 1980-02-14 | SALESMAN       | 2575 |
+-------+---------+------------+----------------+------+
11 rows in set (0.00 sec)


/*6. Display the names of all Employees from Department 10 and 20 whose name start with “A” and ends with “B”.  */

mysql> select ename from emp where (deptno=10 or deptno=20) and ename like 'A%B';
Empty set (0.00 sec)

/*7. Display the details of the employees who have joined on 21-DEC-1990. */
/* No table available with hiring year 1990*/

/* 8. Display the Employee Code, Name, Job & Annual Salary for all Employees belonging to Department Number 10. */
 mysql> select empno, ename, job, sal, deptno from emp where deptno=10;
+-------+--------+-----------+------+--------+
| empno | ename  | job       | sal  | deptno |
+-------+--------+-----------+------+--------+
|  7415 | AARAV  | CLERK     | 3350 |     10 |
|  7421 | THOMAS | CLERK     | 1750 |     10 |
|  7782 | CLARK  | MANAGER   | 2450 |     10 |
|  7839 | KING   | PRESIDENT | 5000 |     10 |
|  7934 | MILLER | CLERK     | 1300 |     10 |
+-------+--------+-----------+------+--------+
5 rows in set (0.00 sec)


/*9. Display the details of the Employees who earn an Annual salary of more than 25000. Sort the records in the
descending order of Salary. */



/* 10. Display the names of Employees whose names contain the character “F”. */
mysql> select ename from emp where ename like '%f%';
+---------+
| ename   |
+---------+
| FRED    |
| FORD    |
| HOFFMAN |
+---------+
3 rows in set (0.00 sec)

/*11. Display the Employee Code, Name, Job & Annual Salary for all Employees belonging to Department Number 10. */ 
mysql> select empno, ename, job, sal, deptno from emp where deptno=10;
+-------+--------+-----------+------+--------+
| empno | ename  | job       | sal  | deptno |
+-------+--------+-----------+------+--------+
|  7415 | AARAV  | CLERK     | 3350 |     10 |
|  7421 | THOMAS | CLERK     | 1750 |     10 |
|  7782 | CLARK  | MANAGER   | 2450 |     10 |
|  7839 | KING   | PRESIDENT | 5000 |     10 |
|  7934 | MILLER | CLERK     | 1300 |     10 |
+-------+--------+-----------+------+--------+
5 rows in set (0.00 sec)


/*12. Display the details of the Employees who earn an Annual salary of more than 25000. Sort the records in the
descending order of Salary. */


/*13. Display the names of Employees whose names contain the character “F”. */

mysql> select ename from emp where ename like '%f%';
+---------+
| ename   |
+---------+
| FRED    |
| FORD    |
| HOFFMAN |
+---------+
3 rows in set (0.00 sec)


/*14. Display the Names and Numbers of all Departments in the descending order of the Department Names. */

mysql> select deptno , dname from dept1 order by dname desc;
+--------+---------------------+
| deptno | dname               |
+--------+---------------------+
|    120 | SHIPPING            |
|     30 | SALES               |
|    140 | RETAIL SALES        |
|     20 | RESEARCH            |
|     50 | PURCHASE            |
|    160 | PUBLIC RELATIONS    |
|     60 | PRODUCTION          |
|     80 | OPERATIONS RESEARCH |
|     40 | OPERATIONS          |
|    170 | MATERIALS SCIENCE   |
|    110 | IT SUPPORT          |
|    150 | IT NETWORK          |
|    130 | IT HELPDESK         |
|    100 | IT                  |
|    201 | HRD                 |
|     90 | FINANCE             |
|    200 | ECONOMICS           |
|     70 | CONTROLS            |
|    190 | COMMERCIAL          |
|    180 | CAREER SERVICES     |
|     10 | ACCOUNTING          |
+--------+---------------------+
21 rows in set (0.00 sec)



/*15. Display the Name, Employee Number, Designation and Salary of those Employees who earn a monthly salary
of not less than 1000 and not more than 2000. */

mysql> select empno, ename, job , sal from emp where sal<2000 and sal >1000;
+-------+----------+---------------------+------+
| empno | ename    | job                 | sal  |
+-------+----------+---------------------+------+
|  6001 | GITA     | Compliance officers | 1750 |
|  6129 | VRUSHALI | Compliance officers | 1750 |
|  6473 | SHARMIN  | Public Relation     | 1750 |
|  6781 | BANDISH  | Public Relation     | 1750 |
|  7421 | THOMAS   | CLERK               | 1750 |
|  7499 | ALLEN    | SALESMAN            | 1600 |
|  7521 | WARD     | SALESMAN            | 1250 |
|  7654 | MARTIN   | SALESMAN            | 1250 |
|  7844 | TURNER   | SALESMAN            | 1500 |
|  7876 | ADAMS    | CLERK               | 1100 |
|  7934 | MILLER   | CLERK               | 1300 |
|  7945 | AARUSH   | SALESMAN            | 1350 |
|  7949 | ALEX     | MANAGER             | 1250 |
|  8433 | NATASHA  | CLERK               | 1750 |
|  9400 | SANGITA  | Compliance officers | 1750 |
|  9473 | SUPRIYA  | ANALYST             | 1750 |
+-------+----------+---------------------+------+
16 rows in set (0.00 sec)



/* 16. Find out the Bonus (Bonus 1.1% of Annual Salary) that every person will receive at the end of the year.  */
/* which table should take for monthly sal and which one for Annual sal?*/


/*17. Display the Name, Job and Dept No. of all the Employees who either work in Department 30 or in Department 40. */


mysql> select ename, job, deptno from emp2 where deptno=30 or deptno=40;
+----------+--------------------+--------+
| ename    | job                | deptno |
+----------+--------------------+--------+
| Eli      | Personal Assistant |     30 |
| louis    | clerk              |     30 |
| ALLEN    | SALESMAN           |     30 |
| WARD     | SALESMAN           |     30 |
| MARTIN   | SALESMAN           |     30 |
| BLAKE    | MANAGER            |     30 |
| TURNER   | SALESMAN           |     30 |
| JAMES    | CLERK              |     30 |
| STEVEN   | Assistant          |     40 |
| SHERLOCK | CLERK              |     40 |
| STEPHEN  | ASSISTANT          |     40 |
| SHERLOCK | CLERK              |     40 |
| sherlock | clerk              |     40 |
| troy     | analyst            |     40 |
+----------+--------------------+--------+
14 rows in set (0.03 sec)


/*18. Display the Employee Number, Name for Clerks and Managers who’s Salary is more than 1500. */

mysql> select ename, job, sal from emp2 where (job='clerk' or job='manager') and sal>1500;
+-----------+---------+---------+
| ename     | job     | sal     |
+-----------+---------+---------+
| Alice     | Manager | 9000.00 |
| SHERLOCK  | CLERK   | 1600.00 |
| Alexander | Manager | 2950.00 |
| Brooke    | Clerk   | 2222.00 |
| shelley   | manager | 6000.99 |
| SHERLOCK  | CLERK   | 1600.00 |
| ALEXANDER | MANAGER | 2950.00 |
| BROOKE    | CLERK   | 2222.00 |
| JONES     | MANAGER | 2975.00 |
| BLAKE     | MANAGER | 2850.00 |
| CLARK     | MANAGER | 2450.00 |
| SHELLEY   | MANAGER | 6000.00 |
| sherlock  | clerk   | 1600.00 |
| sherlock  | clerk   | 1600.00 |
+-----------+---------+---------+
14 rows in set (0.00 sec)



/*19. Display the Name, Annual Salary and Commission as “Commission Earned” of all employees whose monthly
salary is greater than their Commission. The output should be in decreasing order of salary. If two or more
employees have same salary, then sort them by name within the highest order of salary.  */

mysql> select ename, sal, ((sal* 12)+comm) 'Annual Salary', comm 'Commission earned' from emp2 where sal>comm order by sal desc, ename asc;
+---------+----------+---------------+-------------------+
| ename   | sal      | Annual Salary | Commission earned |
+---------+----------+---------------+-------------------+
| William | 23700.00 |     285600.00 |           1200.00 |
| MARY    | 20000.00 |     241550.00 |           1550.00 |
| ROSE    | 18000.00 |     216250.00 |            250.00 |
| TESSA   | 14700.00 |     177500.00 |           1100.00 |
| TINA    | 13700.00 |     166800.00 |           2400.00 |
| MAI     |  8000.00 |      96111.00 |            111.00 |
| MAYA    |  7000.15 |      84122.59 |            120.79 |
| ZARIA   |  7000.00 |      84555.00 |            555.00 |
| Matthew |  4700.00 |      57600.00 |           1200.00 |
| Aaron   |  4500.00 |      55200.73 |           1200.73 |
| AARON   |  4500.00 |      55200.40 |           1200.40 |
| KATE    |  3000.00 |      36900.00 |            900.00 |
| ALLEN   |  1600.00 |      19500.00 |            300.00 |
| TURNER  |  1500.00 |      18000.00 |              0.00 |
| WARD    |  1250.00 |      15500.00 |            500.00 |
+---------+----------+---------------+-------------------+
15 rows in set (0.00 sec)



/*20. Display the Name and Job of sales executives or managers whose names end with the letter ‘S’. */
mysql> select ename, job from emp2 where (job='salesman' or job='salesgirl' or job='manager') and ename like '%s';
+-------+---------+
| ename | job     |
+-------+---------+
| JONES | MANAGER |
+-------+---------+
1 row in set (0.00 sec)


/*21. Display all the Names of the Employees whose Salary is either more than 1000 but not more than 2200. */

mysql> select ename, sal from emp2 where sal >1000 and sal<2200;
+----------+---------+
| ename    | sal     |
+----------+---------+
| SHERLOCK | 1600.00 |
| STEPHEN  | 1100.00 |
| Dirk     | 1500.00 |
| SHERLOCK | 1600.00 |
| DIRK     | 1500.00 |
| ALLEN    | 1600.00 |
| WARD     | 1250.00 |
| MARTIN   | 1250.00 |
| TURNER   | 1500.00 |
| ADAMS    | 1100.00 |
| STEPHEN  | 1100.00 |
| MILLER   | 1300.00 |
| stephen  | 1100.00 |
| sherlock | 1600.00 |
| sherlock | 1600.00 |
| stephen  | 1100.00 |
+----------+---------+
16 rows in set (0.00 sec)




/* 22. Select Name & Salary of employees who are clerks. */

mysql> select ename, sal, job from emp2 where job='clerk';
+----------+----------+-------+
| ename    | sal      | job   |
+----------+----------+-------+
| SHERLOCK |  1600.00 | CLERK |
| Brooke   |  2222.00 | Clerk |
| SHERLOCK |  1600.00 | CLERK |
| BROOKE   |  2222.00 | CLERK |
| joel     | -1600.00 | clerk |
| louis    | -1600.00 | clerk |
| SMITH    |   800.00 | CLERK |
| ADAMS    |  1100.00 | CLERK |
| JAMES    |   950.00 | CLERK |
| MILLER   |  1300.00 | CLERK |
| sherlock |  1600.00 | clerk |
| sherlock |  1600.00 | clerk |
+----------+----------+-------+
12 rows in set (0.00 sec)



/* 23. List the Department Number and Names of all Employees having Salary less than 2500. */

mysql> select ename, deptno, sal from emp2 where sal>2500;
+-------------+--------+----------+
| ename       | deptno | sal      |
+-------------+--------+----------+
| Alice       |    150 |  9000.00 |
| Victor      |    150 |  8000.00 |
| Jack        |    150 |  7000.00 |
| William     |    150 |  7000.79 |
| Rose        |    150 |  8000.48 |
| Kate        |    160 |  3000.00 |
| William     |    160 | 23700.00 |
| Matthew     |    160 |  4700.00 |
| MAI         |    150 |  8000.00 |
| ZARIA       |    150 |  7000.00 |
| MAYA        |    150 |  7000.15 |
| ROSE        |    150 | 18000.00 |
| KATE        |    160 |  3000.00 |
| TINA        |    160 | 13700.00 |
| MARY        |    160 | 20000.00 |
| TESSA       |    160 | 14700.00 |
| Aaron       |     60 |  4500.00 |
| Alexander   |     90 |  2950.00 |
| Bruce       |    120 |  4975.30 |
| Eli         |     30 |  5400.00 |
| shelley     |    170 |  6000.99 |
| Clive       |     50 |  3600.00 |
| Christopher |    190 |  4250.98 |
| ely         |    150 |  5250.00 |
| AARON       |     60 |  4500.00 |
| ALEXANDER   |     70 |  2950.00 |
| BRUCE       |     80 |  4975.00 |
| CHRISTOPHER |    180 |  4250.00 |
| CLIVE       |    120 |  3600.00 |
| ELI         |     70 |  5400.00 |
| ELY         |    140 |  5250.70 |
| TROY        |    160 |  4100.00 |
| JONES       |     20 |  2975.00 |
| BLAKE       |     30 |  2850.00 |
| SCOTT       |     20 |  3000.00 |
| KING        |     10 |  5000.00 |
| FORD        |     20 |  3000.00 |
| THOMAS      |     50 |  4900.00 |
| SHELLEY     |    180 |  6000.00 |
| thomas      |    200 |  4900.00 |
| troy        |     40 |  3100.00 |
+-------------+--------+----------+
41 rows in set (0.00 sec)


/*24. List the Employee Number and the Name of the President. */

mysql> select empno, ename, job from emp2 where job='president';
+-------+-------+-----------+
| empno | ename | job       |
+-------+-------+-----------+
|  7839 | KING  | PRESIDENT |
+-------+-------+-----------+
1 row in set (0.00 sec)


/* 25. Display Names whose job is either Clerk or Analyst or Salesman. */

mysql> select ename, job from emp2 where job='clerk' or job='analyst' or job='salesman';
+----------+----------+
| ename    | job      |
+----------+----------+
| William  | Salesman |
| Matthew  | Salesman |
| SHERLOCK | CLERK    |
| Aaron    | Salesman |
| Brooke   | Clerk    |
| SHERLOCK | CLERK    |
| AARON    | SALESMAN |
| BROOKE   | CLERK    |
| joel     | clerk    |
| jay      | analyst  |
| louis    | clerk    |
| SMITH    | CLERK    |
| TROY     | ANALYST  |
| ALLEN    | SALESMAN |
| WARD     | SALESMAN |
| MARTIN   | SALESMAN |
| SCOTT    | ANALYST  |
| TURNER   | SALESMAN |
| ADAMS    | CLERK    |
| JAMES    | CLERK    |
| FORD     | ANALYST  |
| MILLER   | CLERK    |
| sherlock | clerk    |
| sherlock | clerk    |
| troy     | analyst  |
+----------+----------+
25 rows in set (0.00 sec)



/* 26. List the Employees whose names start with ‘B’ or ‘M’ */

mysql> select ename from emp2 where ename like 'B%' or ename like 'M%';
+---------+
| ename   |
+---------+
| Matthew |
| MAI     |
| MAYA    |
| MARY    |
| Brooke  |
| Bruce   |
| BROOKE  |
| BRUCE   |
| matthew |
| MARTIN  |
| BLAKE   |
| MILLER  |
+---------+
12 rows in set (0.00 sec)

/* 27. Give a list of Employees sorted in alphabetic order of Names. */

mysql> select ename from emp2 order by ename;
+-------------+
| ename       |
+-------------+
| AARON       |
| Aaron       |
| ADAMS       |
| ALEXANDER   |
| Alexander   |
| Alice       |
| ALLEN       |
| BLAKE       |
| BROOKE      |
| Brooke      |
| Bruce       |
| BRUCE       |
| CHRISTOPHER |
| Christopher |
| CLARK       |
| Clive       |
| CLIVE       |
| DIRK        |
| Dirk        |
| ELI         |
| Eli         |
| ely         |
| ELY         |
| FORD        |
| Jack        |
| JAMES       |
| jay         |
| joe         |
| joel        |
| JONES       |
| Kate        |
| KATE        |
| KING        |
| louis       |
| MAI         |
| MARTIN      |
| MARY        |
| Matthew     |
| matthew     |
| MAYA        |
| MILLER      |
| ROSE        |
| Rose        |
| SCOTT       |
| shelley     |
| SHELLEY     |
| sherlock    |
| SHERLOCK    |
| SHERLOCK    |
| sherlock    |
| SMITH       |
| STEPHEN     |
| STEPHEN     |
| stephen     |
| stephen     |
| STEVEN      |
| TESSA       |
| THOMAS      |
| thomas      |
| TINA        |
| TROY        |
| troy        |
| TURNER      |
| Victor      |
| WARD        |
| William     |
| William     |
| ZARIA       |
+-------------+
68 rows in set (0.00 sec)




/* 28. Find out details of Employees where Commission is greater than 5% of the Salary. */


mysql> select * from emp2 where comm is not null and comm > 0.05*sal;
+-------+---------+-----------+---------------------+----------+---------+--------+---------+---------+
| EMPNO | ENAME   | JOB       | HIREDATE            | SAL      | COMM    | DEPTNO | HOBBYID | BONUSID |
+-------+---------+-----------+---------------------+----------+---------+--------+---------+---------+
|  1006 | William | Salesman  | 1980-02-13 21:00:00 | 23700.00 | 1200.00 |    160 |    NULL |       8 |
|  1007 | Matthew | Salesman  | 1980-02-28 21:00:07 |  4700.00 | 1200.00 |    160 |      13 |       3 |
|  1009 | ZARIA   | SALESGIRL | 2002-12-25 11:35:00 |  7000.00 |  555.00 |    150 |       8 |       6 |
|  1012 | KATE    | SALESGIRL | 2005-01-30 12:24:00 |  3000.00 |  900.00 |    160 |       8 |       9 |
|  1013 | TINA    | SALESGIRL | 2006-02-13 21:00:00 | 13700.00 | 2400.00 |    160 |       8 |      10 |
|  1014 | MARY    | SALESGIRL | 2007-02-28 21:00:00 | 20000.00 | 1550.00 |    160 |       8 |       1 |
|  1015 | TESSA   | SALESGIRL | 2008-02-28 21:00:00 | 14700.00 | 1100.00 |    160 |       8 |       5 |
|  3000 | Aaron   | Salesman  | 1981-11-17 04:29:24 |  4500.00 | 1200.73 |     60 |       5 |       4 |
|  5001 | AARON   | SALESMAN  | 1981-11-17 04:29:24 |  4500.00 | 1200.40 |     60 |       6 |       9 |
|  7499 | ALLEN   | SALESMAN  | 1981-02-20 07:30:00 |  1600.00 |  300.00 |     30 |       5 |       8 |
|  7521 | WARD    | SALESMAN  | 1981-02-22 10:15:00 |  1250.00 |  500.00 |     30 |       1 |       3 |
|  7654 | MARTIN  | SALESMAN  | 1981-09-28 14:26:00 |  1250.00 | 1400.00 |     30 |       2 |       4 |
+-------+---------+-----------+---------------------+----------+---------+--------+---------+---------+
12 rows in set (0.00 sec)




/*29. Create query to display the Employee Name and Department Number for empno 7566. */

mysql> select ename , deptno from emp2 where empno=7566;
+-------+--------+
| ename | deptno |
+-------+--------+
| JONES |     20 |
+-------+--------+
1 row in set (0.00 sec)


mysql> select empno, ename , deptno from emp2 where empno=7566;
+-------+-------+--------+
| empno | ename | deptno |
+-------+-------+--------+
|  7566 | JONES |     20 |
+-------+-------+--------+
1 row in set (0.00 sec)



/* 30. List the Name and Salary of Employees who earn more than $1500 and are in Department 10 or 30. Label the
columns NAME and Monthly Salary, respectively. */

mysql> select ename, sal, deptno from emp2 where sal>1500 and (deptno=10 or deptno=30);
+-------+---------+--------+
| ename | sal     | deptno |
+-------+---------+--------+
| CLARK | 2450.00 |     10 |
| KING  | 5000.00 |     10 |
| Eli   | 5400.00 |     30 |
| ALLEN | 1600.00 |     30 |
| BLAKE | 2850.00 |     30 |
+-------+---------+--------+
5 rows in set (0.00 sec)


/* 31. Display the Name, Salary and Commission for all Employees who earn Commission. Sort data in descending
order of Salary and Commission. */

mysql> select ename, sal, comm from emp2 where comm is not null order by sal desc ,comm desc;
+---------+----------+---------+
| ename   | sal      | comm    |
+---------+----------+---------+
| William | 23700.00 | 1200.00 |
| MARY    | 20000.00 | 1550.00 |
| ROSE    | 18000.00 |  250.00 |
| TESSA   | 14700.00 | 1100.00 |
| TINA    | 13700.00 | 2400.00 |
| MAI     |  8000.00 |  111.00 |
| MAYA    |  7000.15 |  120.79 |
| ZARIA   |  7000.00 |  555.00 |
| Matthew |  4700.00 | 1200.00 |
| Aaron   |  4500.00 | 1200.73 |
| AARON   |  4500.00 | 1200.40 |
| KATE    |  3000.00 |  900.00 |
| ALLEN   |  1600.00 |  300.00 |
| TURNER  |  1500.00 |    0.00 |
| MARTIN  |  1250.00 | 1400.00 |
| WARD    |  1250.00 |  500.00 |
+---------+----------+---------+
16 rows in set (0.02 sec)


/* 32. Display the Names of all Employees with the third letter of their Name as an “A”. */

mysql> select ename from emp2 where ename like '__A%';
+-------+
| ename |
+-------+
| BLAKE |
| CLARK |
| ADAMS |
+-------+
3 rows in set (0.00 sec)


/* 33. Display the name of all Employees that have two ‘LS’ in the name and are in department 30 or their manager
is 7782. */

mysql> select ename from emp where ename like '%LS%LS%' and (deptno=30 or mgr=7782);
Empty set (0.04 sec)

mysql>

/* Ask */



/*34. Display Name, Job & Sal for all Emp whose job is Clerk or Analyst and their Sal is not equal to 1000, 3000 &
5000. */

mysql> select ename, job, sal from emp2 where (job='clerk' or job='Analyst') and (sal != 1000 or sal !=3000 or sal !=5000);
+----------+---------+----------+
| ename    | job     | sal      |
+----------+---------+----------+
| SHERLOCK | CLERK   |  1600.00 |
| Brooke   | Clerk   |  2222.00 |
| SHERLOCK | CLERK   |  1600.00 |
| BROOKE   | CLERK   |  2222.00 |
| joel     | clerk   | -1600.00 |
| jay      | analyst | -3100.00 |
| louis    | clerk   | -1600.00 |
| SMITH    | CLERK   |   800.00 |
| TROY     | ANALYST |  4100.00 |
| SCOTT    | ANALYST |  3000.00 |
| ADAMS    | CLERK   |  1100.00 |
| JAMES    | CLERK   |   950.00 |
| FORD     | ANALYST |  3000.00 |
| MILLER   | CLERK   |  1300.00 |
| sherlock | clerk   |  1600.00 |
| sherlock | clerk   |  1600.00 |
| troy     | analyst |  3100.00 |
+----------+---------+----------+
17 rows in set (0.00 sec)





/*35. Display the Name, Sal & Comm for all Employees whose Comm amount is greater than their Sal increased by 10%. */


mysql> select ename, sal ,comm from emp2 where comm is not null and comm>sal*1.10;
+--------+---------+---------+
| ename  | sal     | comm    |
+--------+---------+---------+
| MARTIN | 1250.00 | 1400.00 |
+--------+---------+---------+
1 row in set (0.00 sec)


/*36. Display Employee Number, Name, Gross Salary (Bonus + Salary*12 + Commission) for all those Employees
who belong to Department Number 20 or 30 in the ascending order of Employee Numbers. */

/*bonus? */

mysql> select empno, ename, sal, (Bonusid + sal*12 + Comm) 'Gross Salary' from emp2 where comm is not null and (deptno=20 or deptno=30) order by empno desc;
+-------+--------+---------+--------------+
| empno | ename  | sal     | Gross Salary |
+-------+--------+---------+--------------+
|  7844 | TURNER | 1500.00 |     18010.00 |
|  7654 | MARTIN | 1250.00 |     16404.00 |
|  7521 | WARD   | 1250.00 |     15503.00 |
|  7499 | ALLEN  | 1600.00 |     19508.00 |
+-------+--------+---------+--------------+
4 rows in set (0.00 sec)


/*37. Display the Employee Number, Name, Salary, and Salary Increase by 15% expressed as a whole number.
Label the column New Salary. */

mysql> select empno, ename, sal, round(sal*1.15) 'New Salary' from emp2;
+-------+-------------+----------+------------+
| empno | ename       | sal      | New Salary |
+-------+-------------+----------+------------+
|  1000 | Alice       |  9000.00 |      10350 |
|  1001 | Victor      |  8000.00 |       9200 |
|  1002 | Jack        |  7000.00 |       8050 |
|  1003 | William     |  7000.79 |       8051 |
|  1004 | Rose        |  8000.48 |       9201 |
|  1005 | Kate        |  3000.00 |       3450 |
|  1006 | William     | 23700.00 |      27255 |
|  1007 | Matthew     |  4700.00 |       5405 |
|  1008 | MAI         |  8000.00 |       9200 |
|  1009 | ZARIA       |  7000.00 |       8050 |
|  1010 | MAYA        |  7000.15 |       8050 |
|  1011 | ROSE        | 18000.00 |      20700 |
|  1012 | KATE        |  3000.00 |       3450 |
|  1013 | TINA        | 13700.00 |      15755 |
|  1014 | MARY        | 20000.00 |      23000 |
|  1015 | TESSA       | 14700.00 |      16905 |
|  1016 | STEVEN      | -9500.00 |     -10925 |
|  2099 | SHERLOCK    |  1600.00 |       1840 |
|  2877 | STEPHEN     |  1100.00 |       1265 |
|  3000 | Aaron       |  4500.00 |       5175 |
|  3001 | Alexander   |  2950.00 |       3392 |
|  3002 | Brooke      |  2222.00 |       2555 |
|  3003 | Bruce       |  4975.30 |       5722 |
|  3189 | Eli         |  5400.00 |       6210 |
|  3244 | shelley     |  6000.99 |       6901 |
|  3267 | Clive       |  3600.00 |       4140 |
|  3467 | Christopher |  4250.98 |       4889 |
|  3598 | Dirk        |  1500.00 |       1725 |
|  3745 | ely         |  5250.00 |       6037 |
|  4934 | SHERLOCK    |  1600.00 |       1840 |
|  5001 | AARON       |  4500.00 |       5175 |
|  5002 | ALEXANDER   |  2950.00 |       3392 |
|  5003 | BROOKE      |  2222.00 |       2555 |
|  6001 | BRUCE       |  4975.00 |       5721 |
|  6002 | CHRISTOPHER |  4250.00 |       4888 |
|  6003 | CLIVE       |  3600.00 |       4140 |
|  6342 | joel        | -1600.00 |      -1840 |
|  6345 | jay         | -3100.00 |      -3565 |
|  6774 | joe         | -1100.00 |      -1265 |
|  6843 | matthew     | -1100.00 |      -1265 |
|  6980 | louis       | -1600.00 |      -1840 |
|  7005 | DIRK        |  1500.00 |       1725 |
|  7006 | ELI         |  5400.00 |       6210 |
|  7007 | ELY         |  5250.70 |       6038 |
|  7369 | SMITH       |   800.00 |        920 |
|  7388 | TROY        |  4100.00 |       4715 |
|  7499 | ALLEN       |  1600.00 |       1840 |
|  7521 | WARD        |  1250.00 |       1438 |
|  7566 | JONES       |  2975.00 |       3421 |
|  7654 | MARTIN      |  1250.00 |       1438 |
|  7698 | BLAKE       |  2850.00 |       3277 |
|  7782 | CLARK       |  2450.00 |       2818 |
|  7788 | SCOTT       |  3000.00 |       3450 |
|  7839 | KING        |  5000.00 |       5750 |
|  7844 | TURNER      |  1500.00 |       1725 |
|  7876 | ADAMS       |  1100.00 |       1265 |
|  7877 | STEPHEN     |  1100.00 |       1265 |
|  7900 | JAMES       |   950.00 |       1092 |
|  7902 | FORD        |  3000.00 |       3450 |
|  7934 | MILLER      |  1300.00 |       1495 |
|  8003 | THOMAS      |  4900.00 |       5635 |
|  8009 | SHELLEY     |  6000.00 |       6900 |
|  9277 | stephen     |  1100.00 |       1265 |
|  9341 | thomas      |  4900.00 |       5635 |
|  9434 | sherlock    |  1600.00 |       1840 |
|  9452 | sherlock    |  1600.00 |       1840 |
|  9822 | troy        |  3100.00 |       3565 |
|  9874 | stephen     |  1100.00 |       1265 |
+-------+-------------+----------+------------+
68 rows in set (0.01 sec)



/* 38. Write a query that will display the employees name with the first letter capitalized an other letters
lowercase and the length of their name, for all employees whose name starts with J, A or M. */

mysql> select CONCAT(UPPER(SUBSTRING(ename,1,1)), LOWER(SUBSTRING(ename,2))) AS Name, length(ename) length from emp2 where ename like 'J%' or ename like 'A%' or ename like 'M%';
+-----------+--------+
| Name      | length |
+-----------+--------+
| Alice     |      5 |
| Jack      |      4 |
| Matthew   |      7 |
| Mai       |      3 |
| Maya      |      4 |
| Mary      |      4 |
| Aaron     |      5 |
| Alexander |      9 |
| Aaron     |      5 |
| Alexander |      9 |
| Joel      |      4 |
| Jay       |      3 |
| Joe       |      3 |
| Matthew   |      7 |
| Allen     |      5 |
| Jones     |      5 |
| Martin    |      6 |
| Adams     |      5 |
| James     |      5 |
| Miller    |      6 |
+-----------+--------+
20 rows in set (0.04 sec)



/* 39. Create a query that will display the Employees name and commission amount. If the employee does not
earn commission, put “No Commission”. */

mysql> select ename, IFNULL(comm, 'No Commission') as Commission from emp2;
+-------------+---------------+
| ename       | Commission    |
+-------------+---------------+
| Alice       | No Commission |
| Victor      | No Commission |
| Jack        | No Commission |
| William     | No Commission |
| Rose        | No Commission |
| Kate        | No Commission |
| William     | 1200.00       |
| Matthew     | 1200.00       |
| MAI         | 111.00        |
| ZARIA       | 555.00        |
| MAYA        | 120.79        |
| ROSE        | 250.00        |
| KATE        | 900.00        |
| TINA        | 2400.00       |
| MARY        | 1550.00       |
| TESSA       | 1100.00       |
| STEVEN      | No Commission |
| SHERLOCK    | No Commission |
| STEPHEN     | No Commission |
| Aaron       | 1200.73       |
| Alexander   | No Commission |
| Brooke      | No Commission |
| Bruce       | No Commission |
| Eli         | No Commission |
| shelley     | No Commission |
| Clive       | No Commission |
| Christopher | No Commission |
| Dirk        | No Commission |
| ely         | No Commission |
| SHERLOCK    | No Commission |
| AARON       | 1200.40       |
| ALEXANDER   | No Commission |
| BROOKE      | No Commission |
| BRUCE       | No Commission |
| CHRISTOPHER | No Commission |
| CLIVE       | No Commission |
| joel        | No Commission |
| jay         | No Commission |
| joe         | No Commission |
| matthew     | No Commission |
| louis       | No Commission |
| DIRK        | No Commission |
| ELI         | No Commission |
| ELY         | No Commission |
| SMITH       | No Commission |
| TROY        | No Commission |
| ALLEN       | 300.00        |
| WARD        | 500.00        |
| JONES       | No Commission |
| MARTIN      | 1400.00       |
| BLAKE       | No Commission |
| CLARK       | No Commission |
| SCOTT       | No Commission |
| KING        | No Commission |
| TURNER      | 0.00          |
| ADAMS       | No Commission |
| STEPHEN     | No Commission |
| JAMES       | No Commission |
| FORD        | No Commission |
| MILLER      | No Commission |
| THOMAS      | No Commission |
| SHELLEY     | No Commission |
| stephen     | No Commission |
| thomas      | No Commission |
| sherlock    | No Commission |
| sherlock    | No Commission |
| troy        | No Commission |
| stephen     | No Commission |
+-------------+---------------+
68 rows in set (0.00 sec)



/*40. Display Customers Name, Sales Amount approximate Profit Earned (Profit = 8% of Sales Amount) in
whole numbers. */

mysql> select custname, amount, round(amount*0.08) Profit from sales;
+----------------+----------+--------+
| custname       | amount   | Profit |
+----------------+----------+--------+
| JOCKSPORTS     |  1703.40 |    136 |
| JOCKSPORTS     |   485.00 |     39 |
| JOCKSPORTS     |   292.50 |     23 |
| JOCKSPORTS     |    50.00 |      4 |
| JOCKSPORTS     |   350.00 |     28 |
| JOCKSPORTS     |  2400.00 |    192 |
| TKB SPORT SHOP |    35.00 |      3 |
| TKB SPORT SHOP |     8.40 |      1 |
| TKB SPORT SHOP |    58.00 |      5 |
| VOLLYRITE      |  3306.00 |    264 |
| VOLLYRITE      | 16569.00 |   1326 |
| VOLLYRITE      |  2300.50 |    184 |
| VOLLYRITE      |  5600.00 |    448 |
| JUST TENNIS    |   450.00 |     36 |
| JUST TENNIS    |   140.00 |     11 |
| JUST TENNIS    |   116.00 |      9 |
| JUST TENNIS    |    34.00 |      3 |
| JUST TENNIS    |    24.00 |      2 |
| EVERY MOUNTAIN |   846.80 |     68 |
| EVERY MOUNTAIN |    24.00 |      2 |
| EVERY MOUNTAIN |  3000.00 |    240 |
| EVERY MOUNTAIN |   810.00 |     65 |
| EVERY MOUNTAIN |  1500.00 |    120 |
| EVERY MOUNTAIN |   400.00 |     32 |
| EVERY MOUNTAIN |   240.00 |     19 |
| EVERY MOUNTAIN |   340.00 |     27 |
| K + T SPORTS   |  1750.00 |    140 |
| K + T SPORTS   |  4500.00 |    360 |
| K + T SPORTS   |  1400.00 |    112 |
| K + T SPORTS   |  2800.00 |    224 |
| K + T SPORTS   | 29000.00 |   2320 |
| K + T SPORTS   |  2400.00 |    192 |
| K + T SPORTS   |  2500.00 |    200 |
| K + T SPORTS   |   340.00 |     27 |
| K + T SPORTS   |   480.00 |     38 |
| K + T SPORTS   |  1200.00 |     96 |
| SHAPE UP       |     2.40 |      0 |
| SHAPE UP       |   174.00 |     14 |
| SHAPE UP       |    84.00 |      7 |
| SHAPE UP       |   440.00 |     35 |
| WOMENS SPORTS  |   180.00 |     14 |
| WOMENS SPORTS  |   280.00 |     22 |
| WOMENS SPORTS  |   250.00 |     20 |
| NORTH WOODS    |   560.00 |     45 |
| NORTH WOODS    |  4800.00 |    384 |
| NORTH WOODS    |   600.00 |     48 |
| NORTH WOODS    |   440.00 |     35 |
+----------------+----------+--------+
47 rows in set (0.00 sec)



/* 41. Using the sales table, you need to report the following
a.Sales for the first quarter of the year of 1999
b.Sales for the product SP TENNIS RACKET */

mysql> select custid, name,repid, creditlimit, lpad(concat('$',round(creditlimit *1.25)), 10,' ') New_Creditlimit from customer;
+--------+-------------------+-------+-------------+-----------------+
| custid | name              | repid | creditlimit | New_Creditlimit |
+--------+-------------------+-------+-------------+-----------------+
|    100 | JOCKSPORTS        |  7844 |     5000.00 |      $6250      |
|    101 | TKB SPORT SHOP    |  7521 |    10000.00 |     $12500      |
|    102 | VOLLYRITE         |  7654 |     7000.00 |      $8750      |
|    103 | JUST TENNIS       |  7521 |     3000.00 |      $3750      |
|    104 | EVERY MOUNTAIN    |  7499 |    10000.00 |     $12500      |
|    105 | K + T SPORTS      |  7844 |     5000.00 |      $6250      |
|    106 | SHAPE UP          |  7521 |     6000.00 |      $7500      |
|    107 | WOMENS SPORTS     |  7499 |    10000.00 |     $12500      |
|    108 | NORTH WOODS       |  7844 |     8000.00 |     $10000      |
|    109 | Saleel Sports     |  2002 |     8000.00 |     $10000      |
|    110 | Raj Sports Center |  2342 |    25000.00 |     $31250      |
|    117 | West WOODS        |  7870 |     8000.00 |     $10000      |
|    118 | South WOODS       |  7869 |     8000.00 |     $10000      |
+--------+-------------------+-------+-------------+-----------------+
13 rows in set (0.04 sec)


