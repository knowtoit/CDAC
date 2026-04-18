

/* Assignment 1 */



/* Que.0 Names of all the departments as “Department Names”. */


/* Que.1 Display the location as “Location” and names of all the departments as “Departmthe entire contents of EMP table.  */

mysql> select dname 'Departments', locationid 'Location' from dept1;
+---------------------+----------+
| Departments         | Location |
+---------------------+----------+
| ACCOUNTING          |        1 |
| RESEARCH            |        2 |
| SALES               |        3 |
| OPERATIONS          |        4 |
| PURCHASE            |        5 |
| PRODUCTION          |        6 |
| CONTROLS            |        7 |
| OPERATIONS RESEARCH |        8 |
| FINANCE             |        1 |
| IT                  |        2 |
| IT SUPPORT          |        3 |
| SHIPPING            |        4 |
| IT HELPDESK         |        1 |
| RETAIL SALES        |        2 |
| IT NETWORK          |        3 |
| PUBLIC RELATIONS    |        4 |
| MATERIALS SCIENCE   |        1 |
| CAREER SERVICES     |        2 |
| COMMERCIAL          |        5 |
| ECONOMICS           |        6 |
| HRD                 |        5 |
+---------------------+----------+
21 rows in set (0.00 sec)

/* Que 2 Print the name of employees.  */

mysql> select ename from emp;
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



/* Que 3 Retrieve the list of names and jobs of employees. */

mysql> select ename, job from emp;
+----------+---------------------+
| ename    | job                 |
+----------+---------------------+
| GITA     | Compliance officers |
| VRUSHALI | Compliance officers |
| SHARMIN  | Public Relation     |
| BANDISH  | Public Relation     |
| SMITH    | CLERK               |
| AARAV    | CLERK               |
| THOMAS   | CLERK               |
| ALLEN    | SALESMAN            |
| WARD     | SALESMAN            |
| JONES    | MANAGER             |
| MARTIN   | SALESMAN            |
| BLAKE    | MANAGER             |
| CLARK    | MANAGER             |
| SCOTT    | ANALYST             |
| KING     | PRESIDENT           |
| FRED     | vice PRESIDENT      |
| TURNER   | SALESMAN            |
| ADAMS    | CLERK               |
| Ruhan    | Network             |
| Neel     | vice PRESIDENT      |
| JAMES    | CLERK               |
| FORD     | ANALYST             |
| HOFFMAN  | MANAGER             |
| GRASS    | SALESMAN            |
| MILLER   | CLERK               |
| AARUSH   | SALESMAN            |
| ALEX     | MANAGER             |
| NATASHA  | CLERK               |
| SANGITA  | Compliance officers |
| SUPRIYA  | ANALYST             |
+----------+---------------------+
30 rows in set (0.00 sec)



/* Que 4. List of various department available from dept table */

mysql> select dname 'Department' from dept;
+------------+
| Department |
+------------+
| ACCOUNTING |
| RESEARCH   |
| SALES      |
| OPERATIONS |
| HR         |
| IT         |
+------------+
6 rows in set (0.00 sec)


/* Que 5. Show the information of the Department table. */

mysql> desc dept;
+-----------+-------------+------+-----+---------+-------+
| Field     | Type        | Null | Key | Default | Extra |
+-----------+-------------+------+-----+---------+-------+
| DEPTNO    | int         | NO   | PRI | NULL    |       |
| DNAME     | varchar(12) | YES  |     | NULL    |       |
| LOC       | varchar(10) | YES  |     | NULL    |       |
| PWD       | varchar(20) | YES  |     | NULL    |       |
| STARTEDON | varchar(10) | YES  |     | NULL    |       |
+-----------+-------------+------+-----+---------+-------+
5 rows in set (0.01 sec)

mysql> select * from dept;
+--------+------------+----------+------------+------------+
| DEPTNO | DNAME      | LOC      | PWD        | STARTEDON  |
+--------+------------+----------+------------+------------+
|     10 | ACCOUNTING | NEW YORK | r50mpm     | 24/03/1989 |
|     20 | RESEARCH   | DALLAS   | a12recmpm  | 12/04/1989 |
|     30 | SALES      | CHICAGO  | sales@2017 | 13/04/1989 |
|     40 | OPERATIONS | BOSTON   | opr@123    | 12/07/1989 |
|     50 | HR         | PUNE     | PUN@8877   | 22/12/1989 |
|     60 | IT         | BARODA   | BRD@1122   | 02/10/1989 |
+--------+------------+----------+------------+------------+
6 rows in set (0.00 sec)


/* Que 6 Display the contents of the column Empno, Ename as Employee Name and Sal from the Emp table.  */

mysql> select empno, ename 'Employee Name', sal from emp;
+-------+---------------+------+
| empno | Employee Name | sal  |
+-------+---------------+------+
|  6001 | GITA          | 1750 |
|  6129 | VRUSHALI      | 1750 |
|  6473 | SHARMIN       | 1750 |
|  6781 | BANDISH       | 1750 |
|  7369 | SMITH         |  800 |
|  7415 | AARAV         | 3350 |
|  7421 | THOMAS        | 1750 |
|  7499 | ALLEN         | 1600 |
|  7521 | WARD          | 1250 |
|  7566 | JONES         | 2975 |
|  7654 | MARTIN        | 1250 |
|  7698 | BLAKE         | 2850 |
|  7782 | CLARK         | 2450 |
|  7788 | SCOTT         | 3000 |
|  7839 | KING          | 5000 |
|  7840 | FRED          | 5000 |
|  7844 | TURNER        | 1500 |
|  7876 | ADAMS         | 1100 |
|  7888 | Ruhan         | 2000 |
|  7889 | Neel          | 1000 |
|  7900 | JAMES         |  950 |
|  7902 | FORD          | 3000 |
|  7919 | HOFFMAN       | 4150 |
|  7920 | GRASS         | 2575 |
|  7934 | MILLER        | 1300 |
|  7945 | AARUSH        | 1350 |
|  7949 | ALEX          | 1250 |
|  8433 | NATASHA       | 1750 |
|  9400 | SANGITA       | 1750 |
|  9473 | SUPRIYA       | 1750 |
+-------+---------------+------+
30 rows in set (0.00 sec)


/* Que.7 Display the Job, Comm and Ename from the Emp table with Customized column heading */

mysql> select ename 'Employee Name', job, comm 'Commission' from emp;
+---------------+---------------------+------------+
| Employee Name | job                 | Commission |
+---------------+---------------------+------------+
| GITA          | Compliance officers |       NULL |
| VRUSHALI      | Compliance officers |       NULL |
| SHARMIN       | Public Relation     |       NULL |
| BANDISH       | Public Relation     |       NULL |
| SMITH         | CLERK               |       NULL |
| AARAV         | CLERK               |       NULL |
| THOMAS        | CLERK               |       NULL |
| ALLEN         | SALESMAN            |        300 |
| WARD          | SALESMAN            |        500 |
| JONES         | MANAGER             |       NULL |
| MARTIN        | SALESMAN            |       1400 |
| BLAKE         | MANAGER             |       NULL |
| CLARK         | MANAGER             |       NULL |
| SCOTT         | ANALYST             |       NULL |
| KING          | PRESIDENT           |       NULL |
| FRED          | vice PRESIDENT      |       NULL |
| TURNER        | SALESMAN            |          0 |
| ADAMS         | CLERK               |       NULL |
| Ruhan         | Network             |       NULL |
| Neel          | vice PRESIDENT      |       NULL |
| JAMES         | CLERK               |       NULL |
| FORD          | ANALYST             |       NULL |
| HOFFMAN       | MANAGER             |       NULL |
| GRASS         | SALESMAN            |       2700 |
| MILLER        | CLERK               |       1300 |
| AARUSH        | SALESMAN            |       2700 |
| ALEX          | MANAGER             |        500 |
| NATASHA       | CLERK               |       NULL |
| SANGITA       | Compliance officers |       NULL |
| SUPRIYA       | ANALYST             |       NULL |
+---------------+---------------------+------------+
30 rows in set (0.00 sec)


/* Que 8. Display the location as “Location” and names of all the departments as “Department Names”. */

mysql> select locationid 'Location', dname 'Department Names' from dept1;
+----------+---------------------+
| Location | Department Names    |
+----------+---------------------+
|        1 | ACCOUNTING          |
|        2 | RESEARCH            |
|        3 | SALES               |
|        4 | OPERATIONS          |
|        5 | PURCHASE            |
|        6 | PRODUCTION          |
|        7 | CONTROLS            |
|        8 | OPERATIONS RESEARCH |
|        1 | FINANCE             |
|        2 | IT                  |
|        3 | IT SUPPORT          |
|        4 | SHIPPING            |
|        1 | IT HELPDESK         |
|        2 | RETAIL SALES        |
|        3 | IT NETWORK          |
|        4 | PUBLIC RELATIONS    |
|        1 | MATERIALS SCIENCE   |
|        2 | CAREER SERVICES     |
|        5 | COMMERCIAL          |
|        6 | ECONOMICS           |
|        5 | HRD                 |
+----------+---------------------+
21 rows in set (0.00 sec)



/* Que.9  the different Managers CodesList */
mysql> select ename, job, mgr 'codeList' from emp where job='manager';
+---------+---------+----------+
| ename   | job     | codeList |
+---------+---------+----------+
| JONES   | MANAGER |     7839 |
| BLAKE   | MANAGER |     7839 |
| CLARK   | MANAGER |     7839 |
| HOFFMAN | MANAGER |     7566 |
| ALEX    | MANAGER |     7698 |
+---------+---------+----------+
5 rows in set (0.00 sec)



/* Que 10. Write a query, which concatenates the Emp No, Name and Mgr Code. Display output with spaces in the columns.   */

mysql> select concat(empno,' ', ename, ' ', mgr) ConcatedList from emp;
+--------------------+
| ConcatedList       |
+--------------------+
| 6001 GITA 7920     |
| 6129 VRUSHALI 7920 |
| 6473 SHARMIN 7920  |
| 6781 BANDISH 7920  |
| 7369 SMITH 7902    |
| 7415 AARAV 7902    |
| 7421 THOMAS 7920   |
| 7499 ALLEN 7698    |
| 7521 WARD 7698     |
| 7566 JONES 7839    |
| 7654 MARTIN 7698   |
| 7698 BLAKE 7839    |
| 7782 CLARK 7839    |
| 7788 SCOTT 7566    |
| NULL               |
| 7840 FRED 7839     |
| 7844 TURNER 7698   |
| 7876 ADAMS 7788    |
| 7888 Ruhan 7888    |
| 7889 Neel 7839     |
| 7900 JAMES 7698    |
| 7902 FORD 7566     |
| 7919 HOFFMAN 7566  |
| 7920 GRASS 7919    |
| 7934 MILLER 7782   |
| 7945 AARUSH 7902   |
| 7949 ALEX 7698     |
| 8433 NATASHA 7920  |
| 9400 SANGITA 7920  |
| 9473 SUPRIYA 7920  |
+--------------------+
30 rows in set (0.00 sec)





/* Que 11. Create a query to display all the data from the EMP table, separate each column by a comma. */


mysql> select concat_ws(',',  EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, `USER NAME`, PWD, PHONE, isActive) 'Employee Date' from emp;
+------------------------------------------------------------------------------------------+
| Employee Date                                                                            |
+------------------------------------------------------------------------------------------+
| 6001,GITA,F,Compliance officers,7920,1981-07-19,1750,30,1,GITA,sales@2017,1              |
| 6129,VRUSHALI,F,Compliance officers,7920,1981-07-19,1750,50,1,VRUSHALI,PUN@8877,1        |
| 6473,SHARMIN,F,Public Relation,7920,1981-07-19,1750,20,1,SHARMIN,a12recmpm,1             |
| 6781,BANDISH,F,Public Relation,7920,1981-07-19,1750,20,1,BANDISH,a12recmpm,1             |
| 7369,SMITH,M,CLERK,7902,1980-12-17,800,20,2,TRITONE,a12recmpm,7032300023,0               |
| 7415,AARAV,M,CLERK,7902,1981-12-31,3350,10,AARAV,7032300084,0                            |
| 7421,THOMAS,M,CLERK,7920,1981-07-19,1750,10,1,THOMAS,r50mpm,7032300011,0                 |
| 7499,ALLEN,M,SALESMAN,7698,1981-02-20,1600,300,30,4,ALWAYS TESTE,sales@2017,7032300096,1 |
| 7521,WARD,M,SALESMAN,7698,1981-02-22,1250,500,30,1,WARD,sales@2017,7132300034,1          |
| 7566,JONES,M,MANAGER,7839,1981-04-02,2975,20,4,HONEYCOMB,a12recmpm,7132300039,1          |
| 7654,MARTIN,M,SALESMAN,7698,1981-09-28,1250,1400,30,6,LIFE RACER,sales@2017,7132300050,1 |
| 7698,BLAKE,M,MANAGER,7839,1981-05-01,2850,30,1,BIG BEN,sales@2017,7132300027,1           |
| 7782,CLARK,M,MANAGER,7839,1981-06-09,2450,10,3,CLARK,r50mpm,7032300001,1                 |
| 7788,SCOTT,M,ANALYST,7566,1982-12-09,3000,20,3,WHITE SAND,a12recmpm,1                    |
| 7839,KING,M,PRESIDENT,1981-11-17,5000,10,1,KING,r50mpm,7132300081,1                      |
| 7840,FRED,M,vice PRESIDENT,7839,1983-08-09,5000,20,1,SAND STONE,a12recmpm,1              |
| 7844,TURNER,M,SALESMAN,7698,1981-09-08,1500,0,30,5,SAND DUST,sales@2017,1                |
| 7876,ADAMS,M,CLERK,7788,1983-01-12,1100,20,1,CRAZY ANYONE,a12recmpm,7132300086,1         |
| 7888,Ruhan,M,Network,7888,1983-08-09,2000,60,1,Ruhan,BRD@1122,1                          |
| 7889,Neel,M,vice PRESIDENT,7839,1983-08-09,1000,60,0,Neel,BRD@1122,1                     |
| 7900,JAMES,M,CLERK,7698,1981-12-03,950,30,2,CRAZY LEADER,sales@2017,7132300042,1         |
| 7902,FORD,M,ANALYST,7566,1981-12-03,3000,20,4,CONBRIO,a12recmpm,0                        |
| 7919,HOFFMAN,M,MANAGER,7566,1982-03-24,4150,30,3,INTERVAL,sales@2017,1                   |
| 7920,GRASS,M,SALESMAN,7919,1980-02-14,2575,2700,30,5,GRASS,sales@2017,1                  |
| 7934,MILLER,M,CLERK,7782,1982-01-23,1300,1300,10,2,QUARTERNOTE,r50mpm,7132300055,0       |
| 7945,AARUSH,M,SALESMAN,7902,1980-02-14,1350,2700,30,AARUSH,ABCDEF,0                      |
| 7949,ALEX,M,MANAGER,7698,1982-01-24,1250,500,30,5,QUARTERREST,sales@2017,7156567183,1    |
| 8433,NATASHA,F,CLERK,7920,1981-07-19,1750,30,1,NATASHA,sales@2017,1                      |
| 9400,SANGITA,F,Compliance officers,7920,1981-07-19,1750,50,1,SANGITA,1                   |
| 9473,SUPRIYA,F,ANALYST,7920,1981-07-19,1750,50,1,SUPRIYA,XYZ@1234,1                      |
+------------------------------------------------------------------------------------------+
30 rows in set (0.00 sec)




/* Que.12 Modify the above query to add a column that will subtract the Old Salary from the New Salary. */




/* Que.13  Write a query that produces the following for each employee as- <employee name> earns <salary> monthly,
 but wants salary <3 times salary>. Label the columns Dream Salaries. */

mysql> select ename 'Employee Name', sal Salary, sal*3 'Dream Salary' from emp;
+---------------+--------+--------------+
| Employee Name | Salary | Dream Salary |
+---------------+--------+--------------+
| GITA          |   1750 |         5250 |
| VRUSHALI      |   1750 |         5250 |
| SHARMIN       |   1750 |         5250 |
| BANDISH       |   1750 |         5250 |
| SMITH         |    800 |         2400 |
| AARAV         |   3350 |        10050 |
| THOMAS        |   1750 |         5250 |
| ALLEN         |   1600 |         4800 |
| WARD          |   1250 |         3750 |
| JONES         |   2975 |         8925 |
| MARTIN        |   1250 |         3750 |
| BLAKE         |   2850 |         8550 |
| CLARK         |   2450 |         7350 |
| SCOTT         |   3000 |         9000 |
| KING          |   5000 |        15000 |
| FRED          |   5000 |        15000 |
| TURNER        |   1500 |         4500 |
| ADAMS         |   1100 |         3300 |
| Ruhan         |   2000 |         6000 |
| Neel          |   1000 |         3000 |
| JAMES         |    950 |         2850 |
| FORD          |   3000 |         9000 |
| HOFFMAN       |   4150 |        12450 |
| GRASS         |   2575 |         7725 |
| MILLER        |   1300 |         3900 |
| AARUSH        |   1350 |         4050 |
| ALEX          |   1250 |         3750 |
| NATASHA       |   1750 |         5250 |
| SANGITA       |   1750 |         5250 |
| SUPRIYA       |   1750 |         5250 |
+---------------+--------+--------------+
30 rows in set (0.00 sec)




mysql> select concat_ws(' ', ename, 'earns', sal, 'monthly but wants salary', sal*3) 'Dream Salary' from emp;
+---------------------------------------------------+
| Dream Salary                                      |
+---------------------------------------------------+
| GITA earns 1750 monthly but wants salary 5250     |
| VRUSHALI earns 1750 monthly but wants salary 5250 |
| SHARMIN earns 1750 monthly but wants salary 5250  |
| BANDISH earns 1750 monthly but wants salary 5250  |
| SMITH earns 800 monthly but wants salary 2400     |
| AARAV earns 3350 monthly but wants salary 10050   |
| THOMAS earns 1750 monthly but wants salary 5250   |
| ALLEN earns 1600 monthly but wants salary 4800    |
| WARD earns 1250 monthly but wants salary 3750     |
| JONES earns 2975 monthly but wants salary 8925    |
| MARTIN earns 1250 monthly but wants salary 3750   |
| BLAKE earns 2850 monthly but wants salary 8550    |
| CLARK earns 2450 monthly but wants salary 7350    |
| SCOTT earns 3000 monthly but wants salary 9000    |
| KING earns 5000 monthly but wants salary 15000    |
| FRED earns 5000 monthly but wants salary 15000    |
| TURNER earns 1500 monthly but wants salary 4500   |
| ADAMS earns 1100 monthly but wants salary 3300    |
| Ruhan earns 2000 monthly but wants salary 6000    |
| Neel earns 1000 monthly but wants salary 3000     |
| JAMES earns 950 monthly but wants salary 2850     |
| FORD earns 3000 monthly but wants salary 9000     |
| HOFFMAN earns 4150 monthly but wants salary 12450 |
| GRASS earns 2575 monthly but wants salary 7725    |
| MILLER earns 1300 monthly but wants salary 3900   |
| AARUSH earns 1350 monthly but wants salary 4050   |
| ALEX earns 1250 monthly but wants salary 3750     |
| NATASHA earns 1750 monthly but wants salary 5250  |
| SANGITA earns 1750 monthly but wants salary 5250  |
| SUPRIYA earns 1750 monthly but wants salary 5250  |
+---------------------------------------------------+
30 rows in set (0.00 sec)






/* Que.14 Display different types of positions available in the Company. */


/* Que.15 Using the sales table, you need to report the following 
a. Appropriate column heading should be given for all the columns. */








