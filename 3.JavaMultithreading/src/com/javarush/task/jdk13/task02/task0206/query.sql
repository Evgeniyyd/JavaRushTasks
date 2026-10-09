-- Write your code here:
SELECT id,
       IF(salary <= 500 OR salary > 500, 1000, 0)
FROM employee
WHERE id > 5;
