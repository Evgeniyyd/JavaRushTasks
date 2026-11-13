-- Write your code here:
SELECT employee.name, employee.position FROM employee
WHERE dayofyear(date_of_birth) < 200;