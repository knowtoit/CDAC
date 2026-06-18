

/*drop procedure if exists pro1;
 delimiter $
create procedure pro1()
 BEGIN
     SELECT 'Hello World';
End $
delimiter ;
*/


/*drop procedure if exists  pro1;
delimiter $
create procedure pro1()
BEGIN
   declare x int;
   declare y int default 20;
   
   set x := 10;
 
   select x + y;
end $
delimiter ;
*/


drop procedure if exists  pro1;
delimiter $
create procedure pro1(IN x int, OUT z int)
BEGIN
	set Z :=  x + @b;
end $
delimiter ;









CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO students VALUES (1, 'Aishwarya')
ON DUPLICATE KEY UPDATE name = 'Aishwarya';

DELIMITER //

CREATE PROCEDURE GetStudentName(IN studentId INT)
BEGIN
    SELECT id, name
    FROM students
    WHERE id = studentId;
END //

DELIMITER ;

CALL GetStudentName(1);

