# Question 19

JDBC user lookup/insert program.

Before running:

```sql
CREATE DATABASE assignmentdb;
USE assignmentdb;

CREATE TABLE userinfo (
  username VARCHAR(50) PRIMARY KEY,
  address VARCHAR(200),
  mobile VARCHAR(15),
  email VARCHAR(80)
);

INSERT INTO userinfo VALUES
('user1','Pune','9000000001','user1@mail.com'),
('user2','Mumbai','9000000002','user2@mail.com'),
('user3','Nashik','9000000003','user3@mail.com'),
('user4','Nagpur','9000000004','user4@mail.com'),
('user5','Delhi','9000000005','user5@mail.com'),
('user6','Chennai','9000000006','user6@mail.com'),
('user7','Bangalore','9000000007','user7@mail.com'),
('user8','Hyderabad','9000000008','user8@mail.com'),
('user9','Kolkata','9000000009','user9@mail.com'),
('user10','Goa','9000000010','user10@mail.com');
```

Update DB URL, username, and password in `DbConfig.java` if needed.