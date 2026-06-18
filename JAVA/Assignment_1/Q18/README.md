# Question 18

JDBC product CRUD program.

Before running, create database and table:

```sql
CREATE DATABASE assignmentdb;
USE assignmentdb;

CREATE TABLE product (
  productid INT PRIMARY KEY,
  pname VARCHAR(50),
  price DOUBLE,
  qty INT
);
```

Update DB URL, username, and password in `DbConfig.java` if needed.