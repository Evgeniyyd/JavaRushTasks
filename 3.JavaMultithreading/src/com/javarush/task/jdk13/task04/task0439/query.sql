-- Write your code here:
SELECT employee.name,
       TRIM(' ' FROM name),
       LTRIM(name),
       RTRIM(name)
FROM employee;