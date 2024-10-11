CREATE TABLE Worker (
    WORKER_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    SALARY DECIMAL(10, 2),
    JOINING_DATE DATE,
    DEPARTMENT VARCHAR(50)
);

INSERT INTO Worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT)
VALUES 
(1, 'Monika', 'Arora', 100000.00, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000.00, '2011-08-16', 'Admin'),
(3, 'Vishal', 'Singhal', 300000.00, '2018-09-12', 'HR'),
(4, 'Amitabh', 'Singh', 500000.00, '2019-07-14', 'Admin'),
(5, 'Vivek', 'Bhati', 300000.00, '2011-06-22', 'HR');

select * from worker

CREATE TABLE Title (
    WORKER_REF_ID INT,
    WORKER_TITLE VARCHAR(50),
    AFFECTED_FROM DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);


INSERT INTO Title (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM)
VALUES 
(1, 'Manager', '2021-03-01'),
(2, 'Accountant', '2020-08-15'),
(3, 'Developer', '2019-11-05'),
(4, 'Developer', '2021-01-05'),
(5, 'Manager', '2017-10-25');

select * from Title

CREATE TABLE Bonus (
    WORKER_REF_ID INT,
    BONUS_AMOUNT DECIMAL(10, 2),
    BONUS_DATE DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);


INSERT INTO Bonus (WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE)
VALUES 
(1, 40000.00, '2021-12-25'),
(2, 30000.00, '2020-12-15'),
(3, 20000.00, '2021-01-10');


SELECT W.FIRST_NAME, W.SALARY, T.WORKER_TITLE
FROM Worker W
JOIN Title T ON W.WORKER_ID = T.WORKER_REF_ID;


CREATE FUNCTION get_worker_count_by_nth_highest_salary(n INT)
RETURNS INTEGER AS $$
DECLARE
    nth_highest_salary DECIMAL;
    worker_count INTEGER;
BEGIN
   
    SELECT DISTINCT salary
    INTO nth_highest_salary
    FROM worker
    ORDER BY salary DESC
    LIMIT 1 OFFSET n - 1;
    
    
    SELECT COUNT(*)
    INTO worker_count
    FROM worker
    WHERE salary = nth_highest_salary;

    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;

SELECT get_worker_count_by_nth_highest_salary(2);